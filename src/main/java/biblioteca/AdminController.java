package biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
   private GestioneDB DB = new GestioneDB();
    @FXML
    private TextField nome;

    @FXML
    private TextField cognome;
    @FXML
    private ChoiceBox<String> biblio;
    @FXML
    private PasswordField pwd;
    @FXML
    private DatePicker dataNascita;
    @FXML
    private Label msg;


    public void CreaBibliotecario(){
     String[] biblioteca = biblio.getValue().split(" ");


     String pwdMD5 = DB.getMd5Hash(pwd.getText()); //Codifico la password in MD5

     //SQL INSERT = INSERT INTO bibliotecari VALUES(inserie secondo l'ordine delle colonne)
     String query = "INSERT INTO bibliotecari VALUES (null, '"+DB.formattaTesto(nome.getText())+"', '"+DB.formattaTesto(cognome.getText())+"', '"+pwdMD5+"', '"+dataNascita.getValue()+"', '"+biblioteca[0]+"')";

     if(DB.qUpdateInsert(query)){
      msg.setText("Bibliotecario inserito con successo");
     }else{
      msg.setText("Errore inserimento");
     }

    }

    public void FormattaData(){
     //IMPORTANTE: le date nel DataBase vanno inserite in formato AMERICANO
     System.out.println(dataNascita.getValue());
     //Convertire la data nel formato italiano
     //Trasformo il valore del DatePicker in una variabile LocalDate
     LocalDate myDate = dataNascita.getValue();
     //Creo la formattazzione in formato Italiano
     String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
     System.out.println(myFormattedDate); //Stampo il risultato
    }


 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  ResultSet rs = DB.qSelect("SELECT id, nome FROM biblioteche");

  //scelta.getItems().add(0, "-- Seleziona Biblioteca --");
  try {
   while (rs.next()) {
    System.out.println(rs.getInt("id"));
    biblio.getItems().add(rs.getString("id") + " - " + rs.getString("nome") );
   }
  }catch (SQLException e){
   throw new RuntimeException(e);
  }
 }
}
