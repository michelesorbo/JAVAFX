package biblioteca;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class sceltaController implements Initializable {

    @FXML
    private ChoiceBox<String> scelta;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Inserisco elementi nella Choise Box
        scelta.getItems().add("Roma");
        scelta.getItems().add("Napoli");
        scelta.getItems().add("Milano");
        //scelta.setOnAction(this::getScelta);
    }

    //Gestire la scelta
    public void getScelta(ActionEvent event){
        String miaScelta = scelta.getValue();
        System.out.println(miaScelta);
    }

}
