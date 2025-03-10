
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adminUsername = "Admin010";
        String adminPassword = "password010";
        String studentName = "Rifadz";
        String studentNIM = "202410310710268";

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (choice == 2) {

            System.out.print("Masukkan Nama: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (name.equals(studentName) && nim.equals(studentNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + name);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

