package com.dicoding.courseschedule.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

//TODO 3 : Define room database class
@Database(entities = [Course::class],
    version = 1,
    exportSchema = false)
abstract class CourseDatabase : RoomDatabase() {

    abstract fun courseDao(): CourseDao

    companion object {

        @Volatile
        private var instance: CourseDatabase? = null

        fun getInstance(context: Context): CourseDatabase {
            return instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    CourseDatabase::class.java,
                    "courses.db"
                )
                    .addCallback(object : Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            Executors.newSingleThreadExecutor().execute {
                                instance?.courseDao()?.let { dao ->
                                    if (dao.count() == 0) {
                                        dao.insertAll(InitialDataSource.getInitialCourses())
                                    }
                                }
                            }
                        }
                    })
                    .build()
                    .also { db ->
                        instance = db
                    }
            }
        }
    }
}