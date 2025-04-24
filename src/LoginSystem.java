package src;

import java.util.*;

public class LoginSystem {
    private List<User> users;

    public LoginSystem() {
        users = new ArrayList<>();

        // Menambahkan beberapa pengguna untuk demonstrasi
        users.add(new Admin("admin", "admin123"));
        users.add(new Customer("customer", "customer123"));
    }

    public User login(String username, String password) {
        for (User  user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("+----------------+");
            System.out.println("|     Login      |");
            System.out.println("+----------------+");
            System.out.print("| Username: ");
            String username = scanner.nextLine();
            System.out.print("| Password: ");
            String password = scanner.nextLine();
            System.out.println("+----------------+");


            User user = loginSystem.login(username, password);
            if (user != null) {
                System.out.println("\nLogin berhasil!\n");
                user.showMenu(); // Menampilkan menu sesuai tipe pengguna
            } else {
                System.out.println("\nLogin gagal. Username atau password salah.\n");
            }
        }
    }
}