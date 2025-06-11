package com.example.codelab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
 import javafx.stage.Stage;

import java.util.Random;

public class TebakAngkaApp extends Application {

    private int angkaRahasia;
    private int jumlahTebakan;
    private Label labelFeedback;
    private Label labelJumlahTebakan;
    private TextField inputTebakan;
    private Button tombolTebak;

    @Override
    public void start(Stage primaryStage) {
        generateAngkaBaru();

        labelFeedback = new Label("Masukkan angka tebakan (1-100)");
        labelJumlahTebakan = new Label("Jumlah tebakan: 0");

        inputTebakan = new TextField();
        inputTebakan.setPromptText("Tebak angka...");

        tombolTebak = new Button("Coba Tebak!");
        tombolTebak.setOnAction(e -> prosesTebakan());

        HBox inputBox = new HBox(10, inputTebakan, tombolTebak);
        VBox layout = new VBox(15, labelFeedback, inputBox, labelJumlahTebakan);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 400, 150);
        primaryStage.setTitle("Game Tebak Angka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void prosesTebakan() {
        String teks = inputTebakan.getText();
        try {
            int tebakan = Integer.parseInt(teks);
            jumlahTebakan++;
            if (tebakan < angkaRahasia) {
                labelFeedback.setText("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                labelFeedback.setText("Terlalu besar!");
            } else {
                labelFeedback.setText("Tebakan benar! Angka: " + angkaRahasia);
                tombolTebak.setText("Main Lagi");
                tombolTebak.setOnAction(e -> resetPermainan());
            }
        } catch (NumberFormatException e) {
            labelFeedback.setText("Masukkan angka yang valid!");
        }
        labelJumlahTebakan.setText("Jumlah tebakan: " + jumlahTebakan);
        inputTebakan.clear();
    }

    private void resetPermainan() {
        generateAngkaBaru();
        jumlahTebakan = 0;
        labelFeedback.setText("Masukkan angka tebakan (1-100)");
        labelJumlahTebakan.setText("Jumlah tebakan: 0");
        tombolTebak.setText("Coba Tebak!");
        tombolTebak.setOnAction(e -> prosesTebakan());
    }

    private void generateAngkaBaru() {
        angkaRahasia = new Random().nextInt(100) + 1;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
