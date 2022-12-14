package ControlloWindow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainWindowControll {

    @FXML
    private BorderPane bPane;
    public void scenaUno() throws IOException {
        bPane.setCenter(FXMLLoader.load(getClass().getResource("uno.fxml")));
    }

    public void scenaDue() throws IOException{
        //bPane.setCenter(FXMLLoader.load(getClass().getResource("due.fxml")));
        DueApplication due = new DueApplication();
    }
}
