package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaFinestraApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("primaFinestra.fxml")); //Caricare il template grafico creato con Scene Builde con estensione fxml
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Prima Finestra");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
