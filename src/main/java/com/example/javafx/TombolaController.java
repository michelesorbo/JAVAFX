package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class TombolaController {
    @FXML
    private BorderPane root = new BorderPane();

    public void CreateCenter(){

        for (int i = 1; i < 91; i++) {
            root.setCenter(new Button(String.valueOf(i)));
        }
    }
}
