package biblioteca;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminController {
   private GestioneDB DB = new GestioneDB();
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
     System.out.println(nome.getText());
     System.out.println(cognome.getText());
     System.out.println(pwd.getText());
     System.out.println(biblio.getText());
     System.out.println(biblio.getText());

     String pwdMD5 = DB.getMd5Hash(pwd.getText()); //Codifico la password in MD5

     //SQL INSERT = INSERT INTO bibliotecari VALUES(inserie secondo l'ordine delle colonne)
     String query = "INSERT INTO bibliotecari VALUES (null, '"+nome.getText()+"', '"+cognome.getText()+"', '"+pwdMD5+"', '"+dataNascita.getValue()+"', '"+biblio.getText()+"')";

     if(DB.qUpdateInsert(query)){
      System.out.println("Inserito con successo");
     }else{
      System.out.println("Errore inserimento");
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
}
