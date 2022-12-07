package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaFinestraController {
    @FXML
    private Label lb1;

    @FXML
    private TextField txt1;

    public void saluta(){
        lb1.setText(txt1.getText());
    }

    public void resetta(){
        lb1.setText("Scrvi qualcosa");
    }
}
