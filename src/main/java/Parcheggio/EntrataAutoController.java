package Parcheggio;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntrataAutoController {
    @FXML
    private TextField targa;
    @FXML
    private ChoiceBox<String> categoria;
    @FXML
    private DatePicker ora_in;

    private Parcheggio p = new Parcheggio("Brin", "Via Brin 1, Napoli", 500);

    public void ingresso(){
        p.entraVettura(targa.getText(), categoria.getValue(), ora_in.getValue().toString());
    }


}
