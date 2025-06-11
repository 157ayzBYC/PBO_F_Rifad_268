package gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import users.Mahasiswa;

public class MahasiswaDashboard {
    private VBox pane;

    public MahasiswaDashboard(Stage stage, Mahasiswa mahasiswa) {
        Label welcome = new Label("Selamat datang, " + mahasiswa.getNama());
        Button btnLaporkan = new Button("Laporkan Barang");
        Button btnLihatLaporan = new Button("Lihat Laporan");
        Button btnZodiak = new Button("Zodiak");
        Button btnLogout = new Button("Logout");

        btnLaporkan.setOnAction(e -> mahasiswa.laporBarang());

        btnLihatLaporan.setOnAction(e -> mahasiswa.lihatLaporan());

        btnZodiak.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Zodiak kamu adalah Capricorn (default).", ButtonType.OK);
            alert.setTitle("Zodiak");
            alert.setHeaderText("Zodiak Mahasiswa");
            alert.showAndWait();
        });

        btnLogout.setOnAction(e -> {
            LoginPane loginPane = new LoginPane(stage);
            stage.setScene(new Scene(loginPane.getPane(), 400, 250));
        });


        pane = new VBox(15, welcome, btnLaporkan, btnLihatLaporan, btnZodiak, btnLogout);
        pane.setPadding(new Insets(20));
    }

    public VBox getPane() {
        return pane;
    }
}
