package src;

public class Customer extends User {
    // melakukan investasi dan melihat porto
    private Portofolio portofolio;

    public Customer(String username, String password) {
        super(username, password);
        this.portofolio = new Portofolio();
    }

    public Portofolio getPortofolio() {
        return portofolio;
    }

    @Override
    public void showMenu() {
        CustMenu custMenu = new CustMenu(this);
        custMenu.viewMenu();
    }

    public void investSaham(Saham saham, int quantity) {
        portofolio.addSaham(saham, quantity);
        System.out.println("Berinvestasi pada saham: " + saham.getCompanyName());
    }

    public void investSBN(SBN sbn, double amount) {
        portofolio.addSBN(sbn, amount);
        System.out.println("Berinvestasi pada SBN: " + sbn.getName());
    }
    public void viewPortofolio() {
        portofolio.viewPortofolio();
    }

}
