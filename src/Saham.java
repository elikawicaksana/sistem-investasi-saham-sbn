package src;

// Kelas untuk saham yang menyimpan informasi  kode saham, nama perusahaan, dan harga
public class Saham {
    private String kode; // Kode unik untuk saham
    private String namaPerusahaan; // Nama perusahaan yang menerbitkan saham
    private double harga; // Harga saham

    public Saham(String kode, String namaPerusahaan, double harga) {
        this.kode = kode;
        this.namaPerusahaan = namaPerusahaan;
        this.harga = harga;
    }

    // Metode getter untuk mengakses field private
    public String getKode() {
        return kode;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public double getHarga() {
        return harga;
    }

    // Memperbarui harga saham
    public void setHarga(double harga) {
        this.harga = harga;
    }
}