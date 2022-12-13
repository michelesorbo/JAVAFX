package ControlloWindow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UnoController {

    @FXML
    private Label txt;

    public void saluta(){
        txt.setText("Ciao");
    }
}
