package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku \"" + judul + "\".");
    }

    // Overloading method
    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku(String judul) {  // Pastikan 'k' kecil
        System.out.println(nama + " (ID: " + idAnggota + ") mengembalikan buku \"" + judul + "\".");
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}