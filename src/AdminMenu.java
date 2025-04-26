package src;
import java.util.*;

public class AdminMenu {
    private Scanner scanner;

    public AdminMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void viewMenu() {
        while (true) {
            System.out.println("+---------------------------+");
            System.out.println("|        Admin Menu         |");
            System.out.println("+---------------------------+");
            System.out.println("|  1. Tambah Saham          |");
            System.out.println("|  2. Ubah Harga Saham      |");
            System.out.println("|  3. Tambah Produk SBN     |");
            System.out.println("|  4. Keluar                |");
            System.out.println("+---------------------------+");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSaham();
                    break;
                case 2:
                    changeSahamPrice();
                    break;
                case 3:
                    addSBN();
                    break;
                case 4:
                    System.out.println("Keluar dari sistem admin.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid..");
            }
        }
    }

    private void addSaham() {
        System.out.print("Kode Saham: ");
        String code = scanner.nextLine();
        System.out.print("Nama Perusahaan: ");
        String name = scanner.nextLine();
        System.out.print("Harga Saham: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Saham saham = new Saham(code, name, price);
        InvestmentData.addSaham(saham);
        System.out.println("Saham berhasil ditambahkan.");
    }

    private void changeSahamPrice() {
        List<Saham> sahamList = InvestmentData.getSahamList();
        if (sahamList.isEmpty()) {
            System.out.println("Data saham tidak tersedia.");
            return;
        }

        System.out.print("Masukkan kode saham: ");
        String code = scanner.nextLine();

        for (Saham saham : sahamList) {
            if (saham.getCode().equalsIgnoreCase(code)) {
                System.out.print("Harga baru: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();

                saham.setPrice(newPrice);
                System.out.println("Harga saham berhasil diperbarui.");
                return;
            }
        }

        System.out.println("Saham tidak ditemukan.");
    }

    private void addSBN() {
        System.out.print("Nama SBN: ");
        String name = scanner.nextLine();
        System.out.print("Suku Bunga (%): ");
        double interest = scanner.nextDouble();
        System.out.print("Durasi (tahun): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tanggal Jatuh Tempo (yyyy-mm-dd): ");
        String maturityDate = scanner.nextLine();
        System.out.print("Kuota Nasional: ");
        int quota = scanner.nextInt();
        scanner.nextLine();

        SBN sbn = new SBN(name, interest, duration, maturityDate, quota);
        InvestmentData.addSBN(sbn);
        System.out.println("SBN berhasil ditambahkan.");
    }

    private void viewInvestmentProducts() {
        System.out.println("=== Daftar Saham ===");
        for (Saham saham : InvestmentData.getSahamList()) {
            System.out.println(saham);
        }

        System.out.println("\n=== Daftar SBN ===");
        for (SBN sbn : InvestmentData.getSBNList()) {
            System.out.println(sbn);
        }
    }

    public static void main(String[] args) {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.viewMenu();
    }
}
