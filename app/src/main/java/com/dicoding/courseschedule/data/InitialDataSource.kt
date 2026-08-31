package com.dicoding.courseschedule.data

object InitialDataSource {

    fun getInitialCourses(): List<Course> {
        return listOf(
            // --- SENIN (Day 2) - Terlewat (Pagi & Siang) ---
            Course(
                courseName = "Struktur Data dan Algoritma",
                day = 2, // Monday
                startTime = "07:30",
                endTime = "09:10",
                lecturer = "Dr. Ir. Bambang Hermanto, M.T.",
                note = "Lab Komputer 3 - Bawa laptop dan praktikum bab Tree & Graph"
            ),
            Course(
                courseName = "Pengembangan Aplikasi Android",
                day = 2, // Monday
                startTime = "09:30",
                endTime = "11:45",
                lecturer = "Siti Rahmawati, S.Kom., M.Cs.",
                note = "Gedung C R.302 - Pembahasan Room Database & Jetpack"
            ),
            Course(
                courseName = "Jaringan Komputer Lanjut",
                day = 2, // Monday
                startTime = "13:00",
                endTime = "15:15",
                lecturer = "Ahmad Fauzi, M.Kom.",
                note = "Lab Jaringan - Konfigurasi Routing OSPF & VLAN"
            ),
            Course(
                courseName = "Rekayasa Perangkat Lunak",
                day = 2, // Monday
                startTime = "15:30",
                endTime = "17:10",
                lecturer = "Prof. Dr. Hendra Gunawan",
                note = "Ruang Teori 204 - Presentasi Proposal Proyek Akhir"
            ),

            // --- SENIN (Day 2) - Akan Datang (Malam Ini) ---
            Course(
                courseName = "Kecerdasan Buatan & Machine Learning",
                day = 2, // Monday
                startTime = "21:00",
                endTime = "22:40",
                lecturer = "Eko Prasetyo, Ph.D.",
                note = "Kuliah Online via Zoom - Evaluasi Model Neural Network"
            ),
            Course(
                courseName = "Cloud Computing & DevOps",
                day = 2, // Monday
                startTime = "22:45",
                endTime = "23:45",
                lecturer = "Rian Kurniawan, M.T.",
                note = "Lab Server / Online - Hands-on Docker & Kubernetes CI/CD"
            ),

            // --- SELASA (Day 3) - Akan Datang ---
            Course(
                courseName = "Basis Data Relasional",
                day = 3, // Tuesday
                startTime = "08:00",
                endTime = "09:40",
                lecturer = "Dian Pratama, M.Kom.",
                note = "Lab Basis Data 1 - Normalisasi dan Kueri SQL Kompleks"
            ),
            Course(
                courseName = "Interaksi Manusia dan Komputer (UI/UX)",
                day = 3, // Tuesday
                startTime = "10:00",
                endTime = "12:15",
                lecturer = "Maya Indah, M.Ds.",
                note = "Gedung Desain D.101 - Review Usability Testing Figma"
            ),
            Course(
                courseName = "Sistem Operasi",
                day = 3, // Tuesday
                startTime = "13:30",
                endTime = "15:45",
                lecturer = "Dr. Agus Susanto, M.T.",
                note = "Ruang Kuliah 105 - Sinkronisasi Thread dan Deadlock"
            ),

            // --- RABU (Day 4) - Akan Datang ---
            Course(
                courseName = "Pemrograman Web Lanjut",
                day = 4, // Wednesday
                startTime = "08:00",
                endTime = "10:15",
                lecturer = "Fajar Nugraha, S.Kom., M.T.",
                note = "Lab Komputer 2 - Pembuatan RESTful API dengan Spring Boot"
            ),
            Course(
                courseName = "Keamanan Siber & Kriptografi",
                day = 4, // Wednesday
                startTime = "10:30",
                endTime = "12:45",
                lecturer = "Bayu Wicaksono, M.Cs.",
                note = "Ruang Seminar B - Analisis Vulnerability & Enkripsi AES"
            ),
            Course(
                courseName = "Matematika Diskrit",
                day = 4, // Wednesday
                startTime = "14:00",
                endTime = "16:15",
                lecturer = "Dra. Endang Lestari, M.Si.",
                note = "Gedung A R.102 - Teori Graf dan Kombinatorika"
            ),

            // --- KAMIS (Day 5) - Akan Datang ---
            Course(
                courseName = "Pemrosesan Bahasa Alami (NLP)",
                day = 5, // Thursday
                startTime = "08:00",
                endTime = "10:15",
                lecturer = "Dr. Rina Wijaya, M.Sc.",
                note = "Lab AI - Sentiment Analysis menggunakan LLM"
            ),
            Course(
                courseName = "Big Data Analytics",
                day = 5, // Thursday
                startTime = "10:30",
                endTime = "12:45",
                lecturer = "Irwan Setiawan, M.Kom.",
                note = "Lab Big Data - Pengolahan Data dengan Apache Spark"
            ),
            Course(
                courseName = "Etika Profesi & Hukum IT",
                day = 5, // Thursday
                startTime = "13:30",
                endTime = "15:10",
                lecturer = "Hj. Sri Wahyuni, S.H., M.H.",
                note = "Ruang Teori 301 - Studi Kasus Privasi Data dan UU ITE"
            ),

            // --- JUMAT (Day 6) - Akan Datang ---
            Course(
                courseName = "Internet of Things (IoT)",
                day = 6, // Friday
                startTime = "07:30",
                endTime = "09:45",
                lecturer = "Taufik Hidayat, S.T., M.T.",
                note = "Lab Hardware - Pemrograman ESP32 & Protokol MQTT"
            ),
            Course(
                courseName = "Metodologi Penelitian TI",
                day = 6, // Friday
                startTime = "13:30",
                endTime = "15:45",
                lecturer = "Prof. Dr. Ir. Joko Sutrisno",
                note = "Auditorium Utama - Review Literature & Format Skripsi"
            ),

            // --- SABTU (Day 7) - Akan Datang ---
            Course(
                courseName = "Mobile Game Development",
                day = 7, // Saturday
                startTime = "09:00",
                endTime = "11:30",
                lecturer = "Kevin Sanjaya, M.Ds.",
                note = "Lab Multimedia - Workshop Unity 3D & Rigging Karakter"
            ),

            // --- MINGGU (Day 1) - Terlewat / Akhir Pekan ---
            Course(
                courseName = "Arsitektur Komputer Modern",
                day = 1, // Sunday
                startTime = "08:30",
                endTime = "10:45",
                lecturer = "Dr. Hendro Purnomo, M.T.",
                note = "Kelas Matrikulasi Online - Pipelining dan RISC-V"
            ),
            Course(
                courseName = "Manajemen Proyek Teknologi Informasi",
                day = 1, // Sunday
                startTime = "13:00",
                endTime = "15:15",
                lecturer = "Nugroho Adiputra, PMP., M.T.",
                note = "Workshop Agile & Scrum Sprint Planning"
            )
        )
    }
}
