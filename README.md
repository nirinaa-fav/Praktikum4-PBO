# Praktikum 4 - Pemrograman Berbasis Objek (Array,List,Iterator)

**Nama  :Nirina Ariftiyanti**  
**NIM   :L0325041**   
**Kelas :A**   

---

### 1. Tujuan Praktikum
Menerapkan penggunaan `List` (`ArrayList` / `LinkedList`) di Java.
Memahami cara iterasi dan penghapusan data menggunakan `Iterator`.
Mengimplementasikan operasi dasar CRUD pada data aset IT.

### 2. Penjelasan Class
**`AsetIT`**: Menyimpan atribut `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`.
**`ManajemenAset`**: Memiliki method `tambahAset()`, `tampilkanSemuaAset()` (For-Each), dan `hapusAset()` (Iterator).
**`MainAset`**: Menjalankan alur simulasi penambahan 4 data aset, menampilkan data, dan menghapus salah satu data.

### 3. Output Program
--- Data Aset IT (Awal) ---
ID Aset        : AST01
Nama Perangkat : Server
Lokasi         : Ruang Server
Status Kondisi : Baik
-----------------------------------
ID Aset        : AST02
Nama Perangkat : Router
Lokasi         : Ruang Network
Status Kondisi : Rusak
-----------------------------------
ID Aset        : AST03
Nama Perangkat : Switch
Lokasi         : Lantai 2
Status Kondisi : Baik
-----------------------------------
ID Aset        : AST04
Nama Perangkat : PC Workstation
Lokasi         : Lab Komputer
Status Kondisi : Baik
-----------------------------------

--- Data Aset IT (Setelah Penghapusan) ---
ID Aset        : AST01
Nama Perangkat : Server
Lokasi         : Ruang Server
Status Kondisi : Baik
-----------------------------------
ID Aset        : AST03
Nama Perangkat : Switch
Lokasi         : Lantai 2
Status Kondisi : Baik
-----------------------------------
ID Aset        : AST04
Nama Perangkat : PC Workstation
Lokasi         : Lab Komputer
Status Kondisi : Baik
-----------------------------------
BUILD SUCCESSFUL (total time: 0 seconds)
