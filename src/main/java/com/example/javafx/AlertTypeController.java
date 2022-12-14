package com.example.javafx;

import javafx.scene.control.Alert;

public class AlertTypeController {

    //Vado a dichiarare un oggetto alert e lo inizializzo a nulla (Nessun tipo di alert)
    Alert a = new Alert(Alert.AlertType.NONE);

    public void ConfirmAlert(){
        a.setAlertType(Alert.AlertType.CONFIRMATION);
        //Inserisco il testo nella finestra di dialogo
        a.setContentText("Sei sicuro di voler confermare le modifiche?");
        a.show();
    }

    public void ErrorAlert(){
        a.setAlertType(Alert.AlertType.ERROR);
        a.setContentText("Attenzione errore nel programma");
        a.show();
    }

    public void InformationAlert(){
        a.setAlertType(Alert.AlertType.INFORMATION);
        a.setContentText("Informazione da mostrare");
        a.show();
    }

    public void WarningAlert(){
        a.setAlertType(Alert.AlertType.WARNING);
        a.setContentText("Possibile pericolo");
        a.show();
    }

}
