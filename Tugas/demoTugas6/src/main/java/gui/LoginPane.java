package gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.demotugas6.LoginSystem;

public class LoginPane {
    private VBox pane;

    public LoginPane(Stage stage) {
        Label lblNama = new Label("Nama:");
        TextField tfNama = new TextField();

        Label lblId = new Label("NIM/ID:");
        TextField tfId = new TextField();

        Button btnLogin = new Button("Login");
        Button btnsetting = new Button("setting");



        pane = new VBox(10, lblNama, tfNama, lblId, tfId, btnLogin);
        pane.setPadding(new Insets(20));


        btnLogin.setOnAction(e -> {
            String nama = tfNama.getText();
            String id = tfId.getText();

            LoginSystem.login(stage, nama, id);
        });
    }

    public VBox getPane() {
        return pane;
    }
}
