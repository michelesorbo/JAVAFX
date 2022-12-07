package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchWindowController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToIntroCSS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("introCSS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Intro CSS");
        stage.show();
    }

    public void switchToWinCSS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("winCSS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("CSS");
        stage.show();
    }
}
