package src;

import java.util.HashMap;
import java.util.Map;

// Kelas portofolio menyimpan informasi saham dan SBN yang dimiliki customer
public class Portofolio {
    private Map<Saham, Integer> sahamDimiliki; // Peta yang menyimpan saham yang dimiliki dan jumlahnya
    private Map<SuratBerhargaNegara, Double> sbnDimiliki; // Peta yang menyimpan SBN yang dimiliki dan nominalnya

    // Konstruktor untuk membuat portofolio baru
    public Portofolio() {
        sahamDimiliki = new HashMap<>();
        sbnDimiliki = new HashMap<>();
    }

    // Menambahkan saham ke portofolio
    public void tambahSaham(Saham saham, int jumlah) {
        sahamDimiliki.put(saham, sahamDimiliki.getOrDefault(saham, 0) + jumlah);
    }

    // Menambahkan SBN ke portofolio
    public void tambahSBN(SuratBerhargaNegara sbn, double nominal) {
        sbnDimiliki.put(sbn, sbnDimiliki.getOrDefault(sbn, 0.0) + nominal);
    }

    // Menghitung total nilai pasar dari saham yang dimiliki
    public double hitungTotalNilaiPasar() {
        double totalNilaiPasar = 0.0;
        for (Map.Entry<Saham, Integer> entry : sahamDimiliki.entrySet()) {
            Saham saham = entry.getKey();
            int jumlah = entry.getValue();
            totalNilaiPasar += saham.getHarga() * jumlah;
        }
        return totalNilaiPasar;
    }

    // Menghitung total bunga SBN yang diterima setiap bulan
    public double hitungTotalBungaSBN() {
        double totalBunga = 0.0;
        for (Map.Entry<SuratBerhargaNegara, Double> entry : sbnDimiliki.entrySet()) {
            SuratBerhargaNegara sbn = entry.getKey();
            double nominal = entry.getValue();
            // Menghitung bunga bulanan berdasarkan rumus
            double bungaBulanan = (sbn.getBunga() / 12) * 0.9 * nominal;
            totalBunga += bungaBulanan; // Menambahkan bunga bulanan ke total
        }
        return totalBunga;
    }

    // Menampilkan portofolio investasi
    public void tampilkanPortofolio() {
        System.out.println("=== Portofolio Investasi ===");

        System.out.println("=== Saham yang Dimiliki ===");
        for (Map.Entry<Saham, Integer> entry : sahamDimiliki.entrySet()) {
            Saham saham = entry.getKey();
            int jumlah = entry.getValue();
            double totalNilai = saham.getHarga() * jumlah; // Total nilai pasar per saham
            System.out.printf("%s - %s - Jumlah: %d - Harga: %.2f - Total Nilai: %.2f%n",
                    saham.getKode(), saham.getNamaPerusahaan(), jumlah, saham.getHarga(), totalNilai);
        }

        System.out.println("=== SBN yang Dimiliki ===");
        for (Map.Entry<SuratBerhargaNegara, Double> entry : sbnDimiliki.entrySet()) {
            SuratBerhargaNegara sbn = entry.getKey();
            double nominal = entry.getValue();
            double bungaBulanan = (sbn.getBunga() / 12) * 0.9 * nominal; // Bunga bulanan
            System.out.printf("%s - Nominal: %.2f - Bunga Bulanan: %.2f%n",
                    sbn.getNama(), nominal, bungaBulanan);
        }

        // Menampilkan total nilai pasar dan total bunga SBN
        System.out.printf("Total Nilai Pasar Saham: %.2f%n", hitungTotalNilaiPasar());
        System.out.printf("Total Bunga SBN Bulanan: %.2f%n", hitungTotalBungaSBN());
    }
}