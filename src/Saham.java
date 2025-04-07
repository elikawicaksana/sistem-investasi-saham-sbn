package src;

// Kelas untuk saham yang menyimpan informasi  code saham, nama perusahaan, dan price
public class Saham {
    private String code; // Kode unik untuk saham
    private String companyName; // Nama perusahaan yang menerbitkan saham
    private double price; // Harga saham

    public Saham(String code, String companyName, double price) {
        this.code = code;
        this.companyName = companyName;
        this.price = price;
    }

    // Metode getter untuk mengakses field private
    public String getCode() {
        return code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    // Memperbarui price saham
    public void setPrice(double price) {
        this.price = price;
    }
}