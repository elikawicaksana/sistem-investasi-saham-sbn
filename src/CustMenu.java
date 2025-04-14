package src;

import java.util.*;

public class CustMenu {
    private List<Saham> daftarSaham;
    private List<SBN> daftarSBN;
    private Customer customer;
    private Scanner scanner;

    public CustMenu(Customer customer) {
        this.customer = customer;
        daftarSaham = new ArrayList<>();
        daftarSBN = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void viewMenu() {
        while (true) {
            System.out.println("\n--- Menu Customer ---");
            System.out.println("1. Beli Saham");
            System.out.println("2. Jual Saham");
            System.out.println("3. Beli SBN");
            System.out.println("4. Simulasi SBN");
            System.out.println("5. Lihat Portofolio");
            System.out.println("6. Logout");
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
                    simulationSBN();
                    break;
                case 5:
                    viewPortfolio();
                    break;
                case 6:
                    System.out.println("Keluar dari sistem customer.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        CustMenu custMenu = new CustMenu(customer);

        custMenu.viewMenu();
    }
}