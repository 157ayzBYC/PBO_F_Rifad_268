public class Barang {
    private String namaBarang;
    private String lokasi;
    private String keterangan;

    public Barang(String namaBarang, String lokasi, String keterangan) {
        this.namaBarang = namaBarang;
        this.lokasi = lokasi;
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return "Nama: " + namaBarang + " | Lokasi: " + lokasi + " | Keterangan: " + keterangan;
    }
}
