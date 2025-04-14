package src;

import java.util.*;

public class Admin {
    private List<SBN> sbnList;
    private List<Saham> sahamList;

    public Admin(String username, String password) {
        super(username, password);
        this.daftarSaham = new ArrayList<>();
        this.daftarSBN = new ArrayList<>();
    }

    @Override
    public void showMenu() {
        AdminMenu adminMenu = new AdminMenu(daftarSaham, daftarSBN);
        adminMenu.viewMenu();
    }

    // SBN
    public void addSBN(SBN sbn) {
        sbnList.add(sbn);
        System.out.println("SBN " + sbn.getName() + " berhasil ditambahkan!");
    }

    public void removeSBN(String name) {
        sbnList.removeIf(sbn -> sbn.getName().equals(name));
        System.out.println("SBN " + name  + "berhasil dihapus.");
    }

    public List<SBN> getSBNList() {
        return sbnList;
    }

    // Saham
    public void addSaham(Saham saham) {
        sahamList.add(saham);
        System.out.println("Saham added: " + saham.getCompanyName());
    }

    public void removeSaham(String kode){
        sahamList.removeIf(saham -> saham.getCode().equals(kode));
    }

    public List<Saham> getSahamList() {
        return sahamList;
    }

    // View Product List
    public void viewInvestmentProducts() {
        // List Produk SBN
        System.out.println("SBN List:");
        for (SBN sbn : sbnList) {
            System.out.println(sbn);
        }

        // List Produk Saham
        System.out.println("\nStock List:");
        for (Saham saham : sahamList) {
            System.out.println(saham);
        }
    }

}
