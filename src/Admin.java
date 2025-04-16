package src;

import java.util.*;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    // Menampilkan dan menjalankan menu admin setelah login
    @Override
    public void showMenu() {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.viewMenu();
    }

    // Menambahkan produk SBN
    public void addSBN(SBN sbn) {
        InvestmentData.addSBN(sbn);
        System.out.println("SBN " + sbn.getName() + " berhasil ditambahkan!");
    }

    // Menghapus produk SBN
    public void removeSBN(String name) {
        InvestmentData.removeSBN(name);
        System.out.println("SBN " + name + " berhasil dihapus.");
    }

    // Menambahkan produk Saham
    public void addSaham(Saham saham) {
        InvestmentData.addSaham(saham);
        System.out.println("Saham " + saham.getCompanyName() + " berhasil ditambahkan!");
    }

    // Menghapus produk Saham
    public void removeSaham(String kode) {
        InvestmentData.removeSaham(kode);
        System.out.println("Saham dengan kode " + kode + " berhasil dihapus.");
    }

    // Menampilkan seluruh produk investasi
    public void viewInvestmentProducts() {
        System.out.println("=== Daftar Produk SBN ===");
        for (SBN sbn : InvestmentData.getSBNList()) {
            System.out.println(sbn);
        }

        System.out.println("\n=== Daftar Saham ===");
        for (Saham saham : InvestmentData.getSahamList()) {
            System.out.println(saham);
        }
    }
}
