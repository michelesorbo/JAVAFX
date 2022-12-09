package biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginBibliotecarioController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private GestioneDB DB = new GestioneDB();
    @FXML
    private TextField matricola;
    @FXML
    private PasswordField pwd;
    @FXML
    private Label errorLabel;

    public void loginBtn(ActionEvent event){
        //errorLabel.setText("Errore Login");
        if(!matricola.getText().isBlank() && !pwd.getText().isBlank()){
            String id = DB.LoginBibliotecario(DB.formattaTesto(matricola.getText()), DB.getMd5Hash(pwd.getText()));
           if(!id.isBlank()){
               try {
                   root = FXMLLoader.load(getClass().getResource("BibliotecarioAdmin.fxml"));

                   //Mi ricordo l'id del bibliotecario nella nuova finestra
                   BibliotecarioAdminController BibioC = new BibliotecarioAdminController();
                   BibioC.getID(id);

                   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                   scene = new Scene(root);
                   stage.setScene(scene);
                   stage.setTitle("Bibliotecario Controller");
                   stage.show();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }else{
               errorLabel.setText("Matricola o password errati");
           }
        }else{
            errorLabel.setText("Compila i campi richiesti");
        }
    }
}
