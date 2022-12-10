package biblioteca;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class sceltaController extends AnchorPane implements Initializable {

    @FXML
    private ChoiceBox<String> scelta;

    public sceltaController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("scelta.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


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
