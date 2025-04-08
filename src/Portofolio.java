package src;

import java.util.HashMap;
import java.util.Map;

// Kelas portofolio menyimpan informasi saham dan SBN yang dimiliki customer
public class Portofolio {
    private Map<Saham, Integer> sahamOwned; // Peta yang menyimpan saham yang dimiliki dan jumlahnya
    private Map<SBN, Double> sbnOwned; // Peta yang menyimpan SBN yang dimiliki dan nominalnya

    // Konstruktor untuk membuat portofolio baru
    public Portofolio() {
        sahamOwned = new HashMap<>();
        sbnOwned = new HashMap<>();
    }

    // Menambahkan saham ke portofolio
    public void addSaham(Saham saham, int SahamAmount) {
        sahamOwned.put(saham, sahamOwned.getOrDefault(saham, 0) + SahamAmount);
    }

    // Menambahkan SBN ke portofolio
    public void addSBN(SBN sbn, double nominal) {
        sbnOwned.put(sbn, sbnOwned.getOrDefault(sbn, 0.0) + nominal);
    }

    // Menghitung total nilai pasar dari saham yang dimiliki
    public double calculateTotalMarketValue() {
        double totalMarketValue = 0.0;
        for (Map.Entry<Saham, Integer> entry : sahamOwned.entrySet()) {
            Saham saham = entry.getKey();
            int SahamAmount = entry.getValue();
            totalMarketValue += saham.getPrice() * SahamAmount;
        }
        return totalMarketValue;
    }

    // Menghitung total bunga SBN yang diterima setiap bulan
    public double calculateTotalInterestSBN() {
        double totalInterest = 0.0;
        for (Map.Entry<SBN, Double> entry : sbnOwned.entrySet()) {
            SBN sbn = entry.getKey();
            double nominal = entry.getValue();
            // Menghitung bunga bulanan berdasarkan rumus
            double monthlyInterest = (sbn.getInterestRate() / 12) * 0.9 * nominal;
            totalInterest += monthlyInterest; // Menambahkan bunga bulanan ke total
        }
        return totalInterest;
    }

    // Menampilkan portofolio investasi
    public void viewPortofolio() {
        System.out.println("=== Portofolio Investasi ===");

        System.out.println("=== Saham yang Dimiliki ===");
        for (Map.Entry<Saham, Integer> entry : sahamOwned.entrySet()) {
            Saham saham = entry.getKey();
            int SahamAmount = entry.getValue();
            double totalValue = saham.getPrice() * SahamAmount; // Total nilai pasar per saham
            System.out.printf("%s - %s - Jumlah: %d - Harga: %.2f - Total Nilai: %.2f%n",
                    saham.getCode(), saham.getCompanyName(), SahamAmount, saham.getPrice(), totalValue);
        }

        System.out.println("=== SBN yang Dimiliki ===");
        for (Map.Entry<SBN, Double> entry : sbnOwned.entrySet()) {
            SBN sbn = entry.getKey();
            double nominal = entry.getValue();
            double monthlyInterest = (sbn.getInterestRate() / 12) * 0.9 * nominal; // Bunga bulanan
            System.out.printf("%s - Nominal: %.2f - Bunga Bulanan: %.2f%n",
                    sbn.getName(), nominal, monthlyInterest);
        }

        // Menampilkan total nilai pasar dan total bunga SBN
        System.out.printf("Total Nilai Pasar Saham: %.2f%n", calculateTotalMarketValue());
        System.out.printf("Total Bunga SBN Bulanan: %.2f%n", calculateTotalInterestSBN());
    }
}