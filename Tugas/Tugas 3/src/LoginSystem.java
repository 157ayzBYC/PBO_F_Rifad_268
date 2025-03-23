import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String namaInput, String nimInput) {
        return nama.equals(namaInput) && nim.equals(nimInput);
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}

class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Admin", "000000", "admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Rifadz maulana herianto putra", "202410370110268");

        System.out.println("Pilih jenis login: 1. Admin | 2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil! Anda bisa mengelola sistem.");
            } else {
                System.out.println("Login Admin gagal! Cek kembali username atau password.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal! Cek kembali nama atau NIM.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
