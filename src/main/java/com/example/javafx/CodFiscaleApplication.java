package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CodFiscaleApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("CodFiscale.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Calcolo codice fiscale");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
