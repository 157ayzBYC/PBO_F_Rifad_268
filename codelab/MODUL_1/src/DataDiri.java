import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String gender;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            gender = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            gender = "Perempuan";
        } else {
            gender = "Tidak Diketahui";
        }

        System.out.println("\n==== Data Diri ====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}