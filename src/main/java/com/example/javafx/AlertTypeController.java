package com.example.javafx;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AlertTypeController {

    //Vado a dichiarare un oggetto alert e lo inizializzo a nulla (Nessun tipo di alert)
    Alert a = new Alert(Alert.AlertType.NONE);

    public void ConfirmAlert(){
        a.setAlertType(Alert.AlertType.CONFIRMATION);
        a.setTitle("Titolo della finestra");
        //Inserisco il testo nella finestra di dialogo
        a.setContentText("Sei sicuro di voler confermare le modifiche?");

        //Vedo quale pulsante ha cliccato
        Optional<ButtonType> result = a.showAndWait();
        if(result.get() == ButtonType.OK){
            System.out.println("Hai premuto OK");
            AlertMSG(2,"Ora sono informazione");
        }else {
            System.out.println("Ho annullato l'operazione");
        }
    }

    public void ErrorAlert(){
        a.setAlertType(Alert.AlertType.ERROR);
        a.setContentText("Attenzione errore nel programma");
        a.show();
        System.out.println(a.getButtonTypes().get(0));
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

    public void AlertMSG(int tipo, String msg){
        if(tipo == 1){
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText(msg);
            a.showAndWait();
        } else if (tipo == 2) {
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText(msg);
            a.showAndWait();
        }
    }

}
