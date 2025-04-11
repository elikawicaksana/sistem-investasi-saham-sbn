package src;
import java.util.*;

public class AdminMenu {
    private List<Saham> daftarSaham;
    private List<SBN> daftarSBN;
    private Scanner scanner;

    public AdminMenu() {
        daftarSaham = new ArrayList<>();
        daftarSBN = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void viewMenu() {
        while (true) {
            System.out.println("\n--- Menu Admin ---");
            System.out.println("1. Tambah Saham");
            System.out.println("2. Ubah Harga Saham");
            System.out.println("3. Tambah Produk SBN");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang enter

            switch (pilihan) {
                case 1:
                    addSaham();
                    break;
                case 2:
                    changeSahamPrice();
                    break;
                case 3:
                    addSBN();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem admin.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void addSaham() {
        System.out.print("Kode Saham: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Perusahaan: ");
        String nama = scanner.nextLine();
        System.out.print("Harga Saham: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        daftarSaham.add(new Saham(kode, nama, harga));
        System.out.println("Saham berhasil ditambahkan.");
    }

    private void addSBN() {
        System.out.print("Nama SBN: ");
        String nama = scanner.nextLine();
        System.out.print("Bunga (%): ");
        double bunga = scanner.nextDouble();
        System.out.print("Durasi (tahun): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tanggal Jatuh Tempo: ");
        String tanggal = scanner.nextLine();
        System.out.print("Kuota Nasional: ");
        int kuota = scanner.nextInt();
        scanner.nextLine();

        daftarSBN.add(new SBN(nama, bunga, durasi, tanggal, kuota));
        System.out.println("SBN berhasil ditambahkan.");
    }

    private void changeSahamPrice() {
        if (daftarSaham.isEmpty()) {
            System.out.println("Belum ada data saham.");
            return;
        }

        System.out.print("Masukkan kode saham: ");
        String kode = scanner.nextLine();
        for (Saham saham : daftarSaham) {
            if (saham.getCode().equalsIgnoreCase(kode)) {
                System.out.print("Harga baru: ");
                double hargaBaru = scanner.nextDouble();
                scanner.nextLine();

                saham.setPrice(hargaBaru);
                System.out.println("Harga saham berhasil diubah.");
                return;
            }
        }

        System.out.println("Saham tidak ditemukan.");
    }

    public static void main(String[] args) {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.viewMenu();
    }
}

