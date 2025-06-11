package data;

public class Item {
    private String nama;
    private String pelapor;

    public Item(String nama, String pelapor) {
        this.nama = nama;
        this.pelapor = pelapor;
    }

    public String getNama() {
        return nama;
    }

    public String getPelapor() {
        return pelapor;
    }
}

