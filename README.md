# Agenda Tugas Siswa

## Latar Belakang dan Masalah

Aplikasi Agenda Tugas Siswa dibuat untuk membantu siswa mengelola dan memantau tugas sekolah agar lebih teratur. Aplikasi ini membantu siswa mencatat tugas, mencari tugas, serta mengetahui status pengerjaannya.

## Pengguna dan Tujuan

Pengguna utama aplikasi ini adalah siswa.

Tujuan aplikasi:
- Mempermudah pencatatan tugas sekolah.
- Membantu mencari tugas berdasarkan ID.
- Memantau status penyelesaian tugas.
- Menyimpan dan memuat data tugas.

## Fitur Utama

1. Menambahkan tugas baru.
2. Menampilkan daftar tugas.
3. Mencari tugas berdasarkan ID.
4. Mengubah status tugas.
5. Menghapus tugas.
6. Menyimpan dan memuat data tugas.

## Teknologi dan Struktur Berkas

Teknologi yang digunakan:
- Bahasa pemrograman Kotlin.
- IntelliJ IDEA.
- Git dan GitHub.

Struktur berkas:
- `Main.kt`: Menu utama dan alur program.
- `Model.kt`: Struktur data tugas.
- `TugasService.kt`: Pengelolaan data dan fitur tugas.
- `Penyimpanan.kt`: Membaca dan menyimpan data tugas.
- `README.md`: Dokumentasi proyek.
- `agenda_tugas_tp6.txt`: File penyimpanan data tugas.
- `.gitignore`: Mengatur berkas yang tidak disertakan dalam Git.

## Cara Menjalankan

1. Buka proyek melalui IntelliJ IDEA.
2. Pastikan seluruh file Kotlin tersedia.
3. Buka `Main.kt`.
4. Jalankan program menggunakan tombol Run.
5. Pilih menu sesuai kebutuhan.

## Contoh Penggunaan atau Output

Contoh menu aplikasi:

```text
=== AGENDA TUGAS SISWA ===
1. Tambah tugas
2. Tampilkan tugas
3. Cari tugas
4. Ubah status tugas
5. Hapus tugas
6. Simpan data
0. Keluar
```

## Penyimpanan Data

Data tugas disimpan dalam file `agenda_tugas_tp6.txt`.

Format penyimpanan:

```text
id;judul;selesai
```

Contoh:

```text
03;IOT;false
```

## Hasil Pengujian

Pengujian dilakukan terhadap 12 skenario untuk memeriksa fungsi aplikasi.

Hasil yang telah dibuktikan:
- Pencarian tugas berhasil.
- Status tugas berhasil ditampilkan.
- Penghapusan tugas berhasil.
- Penyimpanan data berhasil.
- Program berhasil ditutup.

Hasil lengkap setiap skenario pengujian dicantumkan dalam dokumen laporan TP6.

## Pembagian Tugas dan Branch

Pengembangan proyek menggunakan Git dan GitHub dengan tiga branch:
- `main`
- `fitur-menu`
- `fitur-informasi`

Branch fitur digunakan untuk mengembangkan perubahan secara terpisah sebelum digabungkan ke branch utama (`main`).

## Riwayat Pengembangan Ringkas

- Menyiapkan struktur awal proyek.
- Menambahkan README dan `.gitignore`.
- Menambahkan judul dan deskripsi proyek.
- Membuat menu utama aplikasi.
- Menambahkan informasi aplikasi.
- Mengembangkan fitur pengelolaan agenda tugas.
- Memperbaiki validasi ID duplikat dan format penyimpanan data.
- Melakukan commit, merge, dan push menggunakan Git dan GitHub.

## Keterbatasan dan Rencana Pengembangan

Keterbatasan:
- Aplikasi masih berbasis Kotlin Console.
- Belum menggunakan database.
- Belum memiliki sistem login pengguna.

Rencana pengembangan:
- Menambahkan fitur tanggal tenggat tugas.
- Mengembangkan tampilan aplikasi.
- Menggunakan database untuk penyimpanan data.

## Repository GitHub

https://github.com/raphaelgavier-lang/TP6_MiniProject_Gilbert