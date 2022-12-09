package biblioteca;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BibliotecarioAdminController {

    private GestioneDB DB = new GestioneDB();
    private Bibliotecario bb;

    @FXML
    private Label welcome;

    public void getID(String id){
        int id_int = Integer.parseInt(id);
        String nome = "";
        String cognome = "";
        String dataNascita = "";
        int biblio = 0;
        System.out.println("Id passato: " + id);
        ResultSet rs = DB.qSelect("SELECT * FROM bibliotecari WHERE matricola = '"+id+"'");

        try{
            while (rs.next()){
                nome = rs.getNString("nome");
                cognome = rs.getString("cognome");
                dataNascita = rs.getString("dataNascita");
                biblio = rs.getInt("id_biblio");
            }
            bb = new Bibliotecario(nome,cognome,dataNascita, id_int, biblio);

            System.out.println(bb);
            welcome.setText("Ciao");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
