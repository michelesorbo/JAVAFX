package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AlertTypeApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("alertType.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Finestre di Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
