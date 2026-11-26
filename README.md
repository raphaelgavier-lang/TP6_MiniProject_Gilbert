# Agenda Tugas Siswa

## Latar Belakang dan Masalah
Siswa sering lupa tugas sekolah dan sulit memantau tugas yang sudah atau belum selesai.

## Pengguna dan Tujuan
Pengguna: siswa SMK. Tujuan: mencatat dan memantau tugas dengan data yang tetap tersimpan.

## Fitur Utama
- Tambah tugas
- Tampilkan tugas
- Cari tugas berdasarkan ID
- Ubah status tugas
- Simpan dan muat data dari berkas
- Hapus tugas

## Teknologi dan Struktur Berkas
Kotlin/JVM Console dengan IntelliJ IDEA.
- Model.kt: data class Tugas
- TugasService.kt: operasi tugas
- Penyimpanan.kt: baca dan tulis berkas
- Main.kt: menu dan input pengguna

## Cara Menjalankan
1. git clone https://github.com/USERNAME/TP6_MiniProject_NamaKelompok.git
2. Buka folder proyek di IntelliJ IDEA.
3. Jalankan fungsi main() pada Main.kt.

## Contoh Penggunaan atau Output
=== AGENDA TUGAS ===
1. Tambah tugas
2. Tampilkan tugas
   ...
   Pilihan: 1
   ID tugas: T01
   Judul tugas: Mengerjakan jobsheet TP6
   Tugas ditambahkan

## Hasil Pengujian
12 skenario uji: data normal, ID duplikat, judul kosong, cari, ubah status,
pilihan menu salah, simpan dan buka ulang, record rusak, dan fitur hapus.

## Pembagian Tugas dan Branch
Gilly - Semuanya

## Riwayat Pengembangan Ringkas
Branch fitur-menu dan fitur-hapus-tugas digabung ke main. Bug ID berspasi diperbaiki.

## Keterbatasan dan Rencana Pengembangan
Belum ada tenggat waktu dan ubah judul. Rencana: tenggat, ubah judul, filter status.
