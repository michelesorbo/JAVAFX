package ConfrontoDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConfrontoDateController {

    @FXML
    private DatePicker dataScelta;
    @FXML
    private DatePicker dataScelta2;
    @FXML
    private Label risultato;

    public void differenza(){


        LocalDate d1 = LocalDate.parse(dataScelta.getValue().toString(), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse(dataScelta2.getValue().toString(), DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff_d = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());

        if(diff_d.isNegative()){
            risultato.setText("Devono trascorre ancora: " + diff_d.toDays() + " La data " + dataScelta.getValue() + " è maggiore");
        }else{
            risultato.setText("Sono trascorsi: " + diff_d.toDays() + " La data " + dataScelta2.getValue() + " è maggiore");
        }



    }
}
