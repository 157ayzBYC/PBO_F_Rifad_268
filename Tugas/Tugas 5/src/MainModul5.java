import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainModul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Array Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        daftarMahasiswa[0] = new Mahasiswa("Rifadz", "202410370110268");
        daftarMahasiswa[1] = new Mahasiswa("bimo setiawan", "202410370110234");
        daftarMahasiswa[2] = new Mahasiswa("Dwi yoga ", "202410370110237");

        // 2. ArrayList Barang
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        int menu = -1;
        while (menu != 0) {
            System.out.println("\n=== MENU SISTEM BARANG HILANG ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tambah Laporan Barang");
            System.out.println("3. Tampilkan Daftar Barang (Iterator)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                menu = input.nextInt();
                input.nextLine(); // clear buffer

                switch (menu) {
                    case 1:
                        System.out.println("\nDaftar Mahasiswa:");
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            System.out.println("- " + mhs);
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Nama Barang: ");
                            String nama = input.nextLine();
                            System.out.print("Lokasi: ");
                            String lokasi = input.nextLine();
                            System.out.print("Keterangan: ");
                            String ket = input.nextLine();

                            if (nama.isEmpty() || lokasi.isEmpty() || ket.isEmpty()) {
                                throw new Exception("Data barang tidak boleh kosong!");
                            }

                            Barang barang = new Barang(nama, lokasi, ket);
                            daftarBarang.add(barang);
                            System.out.println("Laporan barang berhasil ditambahkan.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Belum ada laporan barang.");
                        } else {
                            System.out.println("\nDaftar Barang (Iterator):");
                            Iterator<Barang> it = daftarBarang.iterator();
                            int no = 1;
                            while (it.hasNext()) {
                                System.out.println(no++ + ". " + it.next());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Terima kasih!");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); //untuk clear buffer
            }
        }

        input.close();
    }
}
