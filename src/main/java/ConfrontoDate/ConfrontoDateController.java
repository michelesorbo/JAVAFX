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
    private Label risultato;

    public void differenza(){


        LocalDate d1 = LocalDate.parse(dataScelta.getValue().toString(), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse(LocalDate.now().toString(), DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff_d = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());

        System.out.println("La Differenza è: " + diff_d.toDays());

        risultato.setText("La differenza è: " + diff_d.toDays());

    }
}
