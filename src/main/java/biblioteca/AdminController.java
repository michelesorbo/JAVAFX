package biblioteca;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AdminController {
   // GestioneDB DB = new GestioneDB();
    @FXML
    private TextField nome;

    @FXML
    private TextField cognome;
    @FXML
    private TextField biblio;
    @FXML
    private PasswordField pwd;
    @FXML
    private DatePicker dataNascita;

    public void CreaBibliotecario(){
        System.out.println("Ciao");
    }
}
