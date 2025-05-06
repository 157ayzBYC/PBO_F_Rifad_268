package perpustakaan;

public class fiksi extends buku {

    public fiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Buku Fiksi ===");
        System.out.println("Judul  : " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
