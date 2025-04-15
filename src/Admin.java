package src;

import java.util.*;

public class Admin extends User {
    private List<SBN> listSBN;
    private List<Saham> listSaham;

    public Admin(String username, String password) {
        super(username, password);
        this.listSaham = new ArrayList<>();
        this.listSBN = new ArrayList<>();
    }

    //  Menampilkan dan menjalankan menu admin setelah admin berhasil login.
    @Override // Override method dari superclass User
    public void showMenu() {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.viewMenu();
    }

    // SBN
    public void addSBN(SBN sbn) {
        listSBN.add(sbn);
        System.out.println("SBN " + sbn.getName() + " berhasil ditambahkan!");
    }

    public void removeSBN(String name) {
        listSBN.removeIf(sbn -> sbn.getName().equals(name));
        System.out.println("SBN " + name  + "berhasil dihapus.");
    }

    public List<SBN> getSBNList() {
        return listSBN;
    }

    // Saham
    public void addSaham(Saham saham) {
        listSaham.add(saham);
        System.out.println("Saham added: " + saham.getCompanyName());
    }

    public void removeSaham(String kode){
        listSaham.removeIf(saham -> saham.getCode().equals(kode));
    }

    public List<Saham> getSahamList() {
        return listSaham;
    }

    // View Product List
    public void viewInvestmentProducts() {
        // List Produk SBN
        System.out.println("SBN List:");
        for (SBN sbn : listSBN) {
            System.out.println(sbn);
        }

        // List Produk Saham
        System.out.println("\nStock List:");
        for (Saham saham : listSaham) {
            System.out.println(saham);
        }
    }

}
