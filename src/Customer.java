package src;

public class Customer {
    // melakukan investasi dan melihat porto
    private Portofolio portofolio;

    public Customer() {
        this.portofolio = new Portofolio();
    }

    public void investSaham(Saham saham, int quantity) {
        portofolio.addSaham(saham, quantity);
        System.out.println("Invested in stock: " + saham.getCompanyName());
    }

    public void investSBN(SBN sbn, double amount) {
        portofolio.addSBN(sbn, amount);
        System.out.println("Invested in SBN: " + sbn.getName());
    }
    public void viewPortofolio() {
        portofolio.viewPortofolio();
    }

}
