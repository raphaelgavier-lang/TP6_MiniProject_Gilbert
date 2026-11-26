
fun main() {
    var pilihan: Int

    do {
        println("\n=== AGENDA TUGAS ===")
        println("1. Tampilkan nama proyek")
        println("0. Keluar")
        print("Pilihan: ")

        pilihan = readLine()?.toIntOrNull() ?: -1

        when (pilihan) {
            1 -> println("Agenda Tugas Siswa")
            0 -> println("Program selesai")
            else -> println("Pilihan tidak tersedia")
        }

    } while (pilihan != 0)
}
