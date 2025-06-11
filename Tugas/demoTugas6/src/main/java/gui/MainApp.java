package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginPane loginPane = new LoginPane(primaryStage);
        primaryStage.setScene(new Scene(loginPane.getPane(), 400, 250));
        primaryStage.setTitle("Sistem Lost and Found");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

