package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {

        buku buku1 = new fiksi("Laskar Pelangi", "Andrea Hirata");
        buku buku2 = new nonFiksi("Atomic Habits", "James Clear");

        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();

        Anggota anggota1 = new Anggota("Rifadz", "2024107110268");
        Anggota anggota2 = new Anggota("Farhan", "2024107110225");

        anggota1.pinjamBuku("Laskar Pelangi");
        anggota2.pinjamBuku("Atomic Habits", 7);

        anggota1.kembalikanBuku("Laskar Pelangi");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
