package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String id) {
        super(nama, id);
    }

    @Override
    public boolean login(String nama, String nim) {
        return this.nama.equals(nama) && this.id.equals(nim);
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println(">> Barang berhasil dilaporkan. Terima kasih!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> reportItem();
                case 2 -> viewReportedItems();
                case 0 -> System.out.println("Logout...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }
}
