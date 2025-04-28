# PBO D
* Elika Putri Wicaksana (2405551093)
* Mahaprama Danesh Hiswara (2405551094)

# Program Investasi Saham dan SBN
Program ini dirancang untuk membantu pengguna dalam mengelola portofolio investasi mereka, khususnya dalam dua instrumen utama: 
Saham dan Surat Berharga Negara (SBN). Melalui program ini, pengguna dapat mencatat, memantau, dan membandingkan berbagai produk 
investasi berdasarkan nama, tingkat keuntungan (return), jangka waktu, serta kuota nasional khusus untuk SBN.

Fitur utama dalam program ini mencakup:

1. Pendaftaran produk investasi saham dan SBN, lengkap dengan data seperti nama produk, suku bunga atau return tahunan, durasi investasi, dan tanggal jatuh tempo.

2. Pengelompokan antara saham dan SBN, agar investor dapat memahami perbedaan karakteristik dan risiko dari masing-masing instrumen.

3. Penyajian informasi secara terstruktur dan informatif, sehingga memudahkan pengguna dalam mengambil keputusan berdasarkan profil risiko dan tujuan investasi.

Dengan menggabungkan dua jenis instrumen ini, program memberikan gambaran menyeluruh tentang pilihan investasi jangka pendek maupun jangka panjang, serta mempromosikan literasi finansial di kalangan pengguna.

## UML
![image](PBO_UMLInvestasiSaham.png)


# Prosedur Penggunaan Program

Program Investasi dapat dijalankan dengan dua jenis user, yaitu Admin dan Customer.

# Admin
![image](https://github.com/user-attachments/assets/b50e786f-2cb0-4d95-a4c1-682c0764e07b)


Jenis user ini memiliki akses ke fitur-fitur berikut:
1. Tambah Saham
2. Ubah Harga Saham
3. Tambah Produk SBN
4. Lihat Produk Investasi
5. Keluar

## Login (Admin)
![image](https://github.com/user-attachments/assets/a3e9b090-82e4-4231-9233-999e370cdb9f)

Untuk menjalankan program sebagai admin, masukkan username dan password sebagai berikut:
* Username: admin
* Password: admin123


Jika login berhasil, maka akan muncul pesan "Login Berhasil!".
Namun jika tidak berhasil, kemungkinan ada kesalahan pada username atau password yang dimasukkan.


## Tambah Saham
![image](https://github.com/user-attachments/assets/5db894c4-3c5d-47c3-80ae-c2860105ea1e)


Untuk menambahkan saham ke dalam program, pilih menu nomor 1 terlebih dahulu, lalu masukkan kode saham, nama perusahaan, dan harga saham. Jika saham berhasil ditambahkan, maka akan muncul pesan "Saham berhasil ditambahkan."

## Ubah Harga Saham
![image](https://github.com/user-attachments/assets/0c0f0b4b-6d09-4d4e-bbef-783c30064344)


Untuk mengubah harga saham di dalam program, pilih menu nomor 2, lalu masukkan kode saham dan harga terbarunya. Jika harga berhasil diperbarui, maka akan muncul pesan "Harga saham berhasil diperbarui."

## Tambah Produk SBN
![image](https://github.com/user-attachments/assets/57bc3987-54ae-4c0c-84e6-dad70c3fe4d7)


Untuk menambahkan produk SBN ke dalam program, pilih menu nomor 3, lalu masukkan nama SBN, suku bunga, durasi (tahun), tanggal jatuh tempo, dan kuota nasional. Jika data berhasil ditambahkan, maka akan muncul pesan "SBN berhasil ditambahkan."

## Lihat Produk Investasi
![image](https://github.com/user-attachments/assets/d70ddf47-3802-4bb9-a7ca-ada49650a58d)

Untuk melihat produk investasi (Saham & SBN) di dalam program, pilih menu nomor 4, lalu daftar produk investasi akan tampil.

## Keluar
Fitur ini berfungsi untuk keluar dari sistem customer dan kembali ke menu login Utama.

# Customer
![image](https://github.com/user-attachments/assets/5b743915-c53d-44d3-8ffc-05ddad7cce44)


Jenis user ini memiliki akses ke fitur-fitur berikut:
1. Beli Saham
2. Jual Saham
3. Beli SBN
4. Simulasi SBN
5. Lihat Portofolio
6. Keluar
   
## Login (Customer)
![image](https://github.com/user-attachments/assets/91c8ea9b-fc85-4b03-8a3d-fe60bb90aba9)


Untuk menjalankan program sebagai customer, masukkan username dan password sebagai berikut:
* Username: customer
* Password: customer123

## Beli Saham
![image](https://github.com/user-attachments/assets/d8f577a9-76a0-4e47-9391-41b5e594fe16)


Untuk membeli saham dengan program, pilih menu nomor 1 terlebih dahulu, lalu masukkan kode saham dan jumlah lembar saham yang ingin dibeli. Jika saham berhasil dibeli, maka akan muncul pesan "Pembelian saham berhasil."


## Jual Saham
![image](https://github.com/user-attachments/assets/a2323f69-de28-498a-951a-7f1480651fd3)


Untuk menjual saham dengan program, pilih menu nomor 2 terlebih dahulu, lalu masukkan kode saham dan jumlah lembar saham yang ingin dijual. Jika saham berhasil dijual, maka akan muncul pesan "Saham berhasil dijual."


## Beli SBN
![image](https://github.com/user-attachments/assets/f45c1370-e1a7-4a9b-a020-fe498cf4358d)


Untuk membeli SBN dengan program, pilih menu nomor 3 terlebih dahulu, lalu masukkan nama SBN dan jumlah investasi (Rp) yang ingin dibeli. Jika SBN berhasil dibeli, maka akan muncul pesan "Investasi SBN berhasil."

## Simulasi SBN
![image](https://github.com/user-attachments/assets/4f44d55d-7295-488f-9eee-e73f9cf39570)


Untuk melakukan simulasi SBN, pilih menu nomor 4 terlebih dahulu, lalu masukkan nama dan nominal investasi (Rp) dari SBN yang ingin disimulasikan. Setelah itu program akan memberikan informasi mengenai simulasi bunga bulanan dari investasi yang disimulasikan.

## Lihat Portofolio
![image](https://github.com/user-attachments/assets/7f77704c-8afc-4274-8f93-e8bde99ad25b)


Untuk melihat Portofolio, pilih menu nomor 5 terlebih dahulu, setelah itu akan tampil daftar saham dan sbn yang dimiliki, beserta total nilai pasar saham dan total bunga SBN bulanan.

## Keluar 
Fitur ini berfungsi untuk keluar dari sistem customer dan kembali ke menu login Utama.
