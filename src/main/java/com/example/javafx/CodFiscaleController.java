package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class CodFiscaleController {

    @FXML
    private TextField nome;
    @FXML
    private TextField cognome;

    private Alert a = new Alert(Alert.AlertType.NONE);
    public void CodFis(){

        String cognome = lavoroNomeCognome(this.cognome.getText());
        String nome = lavoroNomeCognome(this.nome.getText());

        a.setAlertType(Alert.AlertType.INFORMATION);
        a.setContentText(cognome + nome);
        a.show();
    }

    public String lavoroNomeCognome(String str){
        str = str.trim();
        str = str.toUpperCase();
        str = str.replaceAll("[AEIOU]", "");
        return str.substring(0,3);
    }
}
