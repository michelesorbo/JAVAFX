package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchWindowApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("winCSS.fxml"));
        Scene scene = new Scene(root, 800,600);
        String css = this.getClass().getResource("winCSS.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("CSS Stage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
