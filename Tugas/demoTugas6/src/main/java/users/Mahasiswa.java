package users;

import actions.MahasiswaActions;
import data.DataStore;
import data.Item;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ButtonType;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String id) {
        super(nama, id);
    }

    public boolean login(String inputNama, String inputNim) {
        return this.nama.equalsIgnoreCase(inputNama) && this.id.equals(inputNim);
    }

    public String getNama() {
        return this.nama;
    }

    @Override
    public void laporBarang() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Lapor Barang");
        dialog.setHeaderText("Masukkan nama barang yang ingin dilaporkan:");
        dialog.setContentText("Nama Barang:");

        dialog.showAndWait().ifPresent(namaBarang -> {
            Item item = new Item(namaBarang, this.nama);
            DataStore.addItem(item);

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Barang berhasil dilaporkan.", ButtonType.OK);
            alert.showAndWait();
        });
    }

    @Override
    public void lihatLaporan() {
        StringBuilder laporan = new StringBuilder();
        for (Item item : DataStore.getItems()) {
            laporan.append("- ")
                    .append(item.getNama())
                    .append(" (oleh: ")
                    .append(item.getPelapor())
                    .append(")\n");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION,
                laporan.length() > 0 ? laporan.toString() : "Belum ada laporan.",
                ButtonType.OK);
        alert.setTitle("Daftar Laporan");
        alert.setHeaderText("Laporan Barang");
        alert.showAndWait();
    }
}
