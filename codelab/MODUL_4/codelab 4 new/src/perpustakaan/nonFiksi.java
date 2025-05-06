package perpustakaan;

public class nonFiksi extends buku {

    public nonFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Buku Non-Fiksi ===");
        System.out.println("Judul  : " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
