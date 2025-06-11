package gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import users.Admin;

public class AdminDashboard {
    private VBox pane;

    public AdminDashboard(Stage stage, Admin admin) {
        Label welcome = new Label("Selamat datang Admin, " + admin.getNama());
        Button btnKelola = new Button("Kelola Data");
        Button btnLogout = new Button("Logout");
        Button profile = new Button("profile");


        btnKelola.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Fitur kelola data belum tersedia.", ButtonType.OK);
            alert.showAndWait();
        });

        btnLogout.setOnAction(e -> {
            LoginPane loginPane = new LoginPane(stage);
            stage.setScene(new Scene(loginPane.getPane(), 400, 250));
        });

        pane = new VBox(15, welcome, btnKelola, btnLogout);
        pane.setPadding(new Insets(20));
    }

    public VBox getPane() {
        return pane;
    }
}
