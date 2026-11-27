
import java.io.File

fun main() {
    val file = File("agenda_tugas_tp6.txt")
    val daftar = Penyimpanan.muat(file)
    val service = TugasService(daftar)

    var pilihan: Int

    do {
        println("\n=== AGENDA TUGAS SISWA ===")
        println("1. Tambah tugas")
        println("2. Tampilkan tugas")
        println("3. Cari tugas")
        println("4. Ubah status tugas")
        println("5. Hapus tugas")
        println("6. Simpan data")
        println("0. Keluar")
        print("Pilihan: ")

        pilihan = readLine()?.toIntOrNull() ?: -1

        when (pilihan) {
            1 -> {
                print("ID tugas: ")
                val id = readLine() ?: ""

                print("Judul tugas: ")
                val judul = readLine() ?: ""

                if (service.tambah(id, judul)) {
                    println("Tugas berhasil ditambahkan")
                } else {
                    println("Data tidak valid atau ID sudah digunakan")
                }
            }

            2 -> {
                println("\n=== DAFTAR TUGAS ===")
                service.tampilkan()
            }

            3 -> {
                print("Masukkan ID tugas: ")
                val id = readLine() ?: ""

                val hasil = service.cari(id)

                if (hasil != null) {
                    println("ID: ${hasil.id}")
                    println("Judul: ${hasil.judul}")
                    println("Status: ${if (hasil.selesai) "Selesai" else "Belum selesai"}")
                } else {
                    println("Tugas tidak ditemukan")
                }
            }

            4 -> {
                print("Masukkan ID tugas: ")
                val id = readLine() ?: ""

                if (service.ubahStatus(id)) {
                    println("Status tugas berhasil diubah")
                } else {
                    println("Tugas tidak ditemukan")
                }
            }

            5 -> {
                print("Masukkan ID tugas: ")
                val id = readLine() ?: ""

                if (service.hapus(id)) {
                    println("Tugas berhasil dihapus")
                } else {
                    println("Tugas tidak ditemukan")
                }
            }

            6 -> {
                Penyimpanan.simpan(file, daftar)
                println("Data berhasil disimpan")
            }

            0 -> {
                Penyimpanan.simpan(file, daftar)
                println("Data disimpan. Program selesai.")
            }

            else -> println("Pilihan tidak tersedia")
        }

    } while (pilihan != 0)
}
