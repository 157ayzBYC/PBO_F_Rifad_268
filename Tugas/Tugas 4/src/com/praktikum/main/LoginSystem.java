package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin", "000000", "admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Rifadz Maulana Herianto Putra", "268");

        System.out.println("Pilih jenis login: 1. Admin | 2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        User user = null;

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
                user = admin;
            } else {
                System.out.println("Login Admin gagal!");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                user = mahasiswa;
            } else {
                System.out.println("Login Mahasiswa gagal!");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        if (user != null) {
            user.displayAppMenu();
        }

        scanner.close();
    }
}
