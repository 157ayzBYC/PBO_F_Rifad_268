import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Pensil", 20));
        daftarBarang.add(new Barang("Buku", 15));

        boolean jalanTerus = true;

        while (jalanTerus) {
            System.out.println("\n=== MENU MANAJEMEN STOK ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Nama barang: ");
                        String nama = scanner.nextLine();

                        System.out.print("Stok awal: ");
                        int stok = scanner.nextInt();
                        scanner.nextLine();

                        daftarBarang.add(new Barang(nama, stok));
                        System.out.println("Barang berhasil ditambahkan!");
                    }

                    case 2 -> {
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Stok barang kosong.");
                        } else {
                            System.out.println("== Daftar Barang ==");
                            for (int i = 0; i < daftarBarang.size(); i++) {
                                Barang b = daftarBarang.get(i);
                                System.out.println(i + ". " + b.getNama() + " - Stok: " + b.getStok());
                            }
                        }
                    }

                    case 3 -> {
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Belum ada barang dalam stok.");
                            continue;
                        }

                        System.out.println("== Pilih Barang ==");
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            System.out.println(i + ". " + daftarBarang.get(i).getNama() + " (Stok: " + daftarBarang.get(i).getStok() + ")");
                        }

                        System.out.print("Masukkan indeks barang: ");
                        int indeks = scanner.nextInt();
                        scanner.nextLine();

                        Barang barang = daftarBarang.get(indeks);

                        System.out.print("Jumlah stok yang dikurangi: ");
                        int jumlah = scanner.nextInt();
                        scanner.nextLine();

                        if (jumlah > barang.getStok()) {
                            throw new StokTidakCukupException("Stok untuk " + barang.getNama() + "tersisa " + barang.getStok());
                        }

                        barang.setStok(barang.getStok() - jumlah);
                        System.out.println("Stok berhasil dikurangi.");
                    }

                    case 0 -> {
                        jalanTerus = false;
                        System.out.println("Terima kasih!");
                    }

                    default -> System.out.println("Pilihan tidak valid.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Indeks tidak ditemukan.");
            } catch (StokTidakCukupException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Mohon Maaf Terjadi Kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
