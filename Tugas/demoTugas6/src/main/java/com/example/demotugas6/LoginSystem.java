package com.example.demotugas6;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import users.Admin;
import users.Mahasiswa;
import gui.AdminDashboard;
import gui.MahasiswaDashboard;

public class LoginSystem {
    public static void login(Stage stage, String nama, String id) {
        if (nama.equalsIgnoreCase("admin")) {
            Admin admin = new Admin("admin", "admin123");
            if (admin.login(nama, id)) {
                AdminDashboard dashboard = new AdminDashboard(stage, admin);
                stage.setScene(new Scene(dashboard.getPane(), 400, 300));
            } else {
                showAlert("ID Admin salah.");
            }
        } else {
            Mahasiswa mhs = new Mahasiswa("Rifadz", "202410370110268");
            if (mhs.login(nama, id)) {
                MahasiswaDashboard dashboard = new MahasiswaDashboard(stage, mhs);
                stage.setScene(new Scene(dashboard.getPane(), 400, 300));
            } else {
                showAlert("Nama atau NIM salah.");
            }
        }
    }


    private static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }
}
