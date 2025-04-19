package src;

import java.util.*;

public class CustMenu {
    private Customer customer;
    private Scanner scanner;

    public CustMenu(Customer customer) {
        this.customer = customer;
        this.scanner = new Scanner(System.in);
    }

    public void viewMenu() {
        while (true) {
            System.out.println("===== Menu Customer =====");
            System.out.println("  1. Beli Saham");
            System.out.println("  2. Jual Saham");
            System.out.println("  3. Beli SBN");
            System.out.println("  4. Simulasi SBN");
            System.out.println("  5. Lihat Portofolio");
            System.out.println("  6. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih Menu (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Buang enter

            switch (choice) {
                case 1:
                     buySaham();
                    break;
                case 2:
                     sellSaham();
                    break;
                case 3:
                     buySBN();
                    break;
                case 4:
                    // simulationSBN();
                    break;
                case 5:
                    customer.viewPortofolio();
                    break;
                case 6:
                    System.out.println("Keluar dari sistem customer.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void buySaham() {
        List<Saham> daftarSaham = InvestmentData.getSahamList();
        if (daftarSaham.isEmpty()) {
            System.out.println("Tidak ada saham yang tersedia.");
            return;
        }

        System.out.println("=== Daftar Saham Tersedia ===");
        for (Saham saham : daftarSaham) {
            System.out.printf("%s - %s - Harga: %.2f%n", saham.getCode(), saham.getCompanyName(), saham.getPrice());
        }

        System.out.print("Masukkan kode saham yang ingin dibeli: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan jumlah lembar saham: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (Saham saham : daftarSaham) {
            if (saham.getCode().equalsIgnoreCase(kode)) {
                customer.investSaham(saham, jumlah);
                System.out.println("Pembelian saham berhasil.");
                return;
            }
        }

        System.out.println("Saham tidak ditemukan.");
    }

    private void sellSaham() {
        Map<Saham, Integer> daftarSaham = customer.getPortofolio().getDaftarSaham();

        if (daftarSaham.isEmpty()) {
            System.out.println("Kamu belum memiliki saham.");
            return;
        }

        System.out.println("=== Saham yang Dimiliki ===");
        for (Map.Entry<Saham, Integer> entry : daftarSaham.entrySet()) {
            Saham saham = entry.getKey();
            int jumlah = entry.getValue();
            System.out.printf("%s - %s - Harga: %.2f - Jumlah: %d\n",
                    saham.getCode(), saham.getCompanyName(), saham.getPrice(), jumlah);
        }

        System.out.print("Masukkan kode saham yang ingin dijual: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan jumlah lembar saham yang ingin dijual: ");
        int jumlahJual = scanner.nextInt();
        scanner.nextLine();

        for (Saham saham : daftarSaham.keySet()) {
            if (saham.getCode().equalsIgnoreCase(kode)) {
                int jumlahDimiliki = daftarSaham.get(saham);
                if (jumlahJual > jumlahDimiliki) {
                    System.out.println("Jumlah saham yang dimiliki tidak mencukupi.");
                    return;
                } else {
                    daftarSaham.put(saham, jumlahDimiliki - jumlahJual);
                    if (daftarSaham.get(saham) == 0) {
                        daftarSaham.remove(saham); // hapus jika 0
                    }
                    System.out.println("Saham berhasil dijual.");
                    return;
                }
            }
        }

        System.out.println("Kode saham tidak ditemukan di portofolio.");
    }

    private void buySBN() {
        List<SBN> daftarSBN = InvestmentData.getSBNList();
        if (daftarSBN.isEmpty()) {
            System.out.println("Tidak ada produk SBN yang tersedia.");
            return;
        }

        System.out.println("=== Daftar SBN Tersedia ===");
        for (SBN sbn : daftarSBN) {
            System.out.println(sbn);
        }

        System.out.print("Masukkan nama SBN yang ingin dibeli: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah investasi (Rp): ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine();

        for (SBN sbn : daftarSBN) {
            if (sbn.getName().equalsIgnoreCase(nama)) {
                customer.investSBN(sbn, jumlah);
                System.out.println("Investasi SBN berhasil.");
                return;
            }
        }

        System.out.println("SBN tidak ditemukan.");
    }

    public static void main(String[] args) {
        Customer customer = new Customer("dummyUser", "dummyPass");
        CustMenu custMenu = new CustMenu(customer);

        custMenu.viewMenu();
    }
}