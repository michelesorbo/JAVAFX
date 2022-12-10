package biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BibliotecarioAdminController {
    @FXML
    private BorderPane mainPane;
    @FXML
    private Label welcome;

    private Scanner in = new Scanner(System.in);

    private GestioneDB DB = new GestioneDB();
    private static Bibliotecario bb;


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

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        bb = new Bibliotecario(nome,cognome,dataNascita, id_int, biblio);
        System.out.println(bb);

    }

    public void Saluta(ActionEvent event){
        System.out.println(bb);
//        sceltaController sA = new sceltaController();
//        mainPane.setCenter(sA);
    }

    public void aggLibro(){
        System.out.println(bb.getBiblioteca());
        String scelta;
        String isbn = "";
        String titolo;
        String n_copie;
        String n_copie_db = "";
        String fila;
        String scaffale;

        System.out.println("Inserisci il titolo: ");
        titolo = in.nextLine();

        System.out.println("Inserisci n° copie: ");
        n_copie = in.nextLine();

        System.out.println("inserisci fila: ");
        fila = in.nextLine();

        System.out.println("Inserisci Scaffale: ");
        scaffale = in.nextLine();

        ResultSet rs = DB.qSelect("SELECT isbn, n_copie FROM libri WHERE titolo = '"+DB.formattaTesto(titolo)+"'" );

        try{
            while (rs.next()){
                isbn = rs.getString("isbn");
                n_copie_db = rs.getString("n_copie");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        if(isbn.isBlank()){
            DB.qUpdateInsert("INSERT INTO libri VALUES (null,'"+DB.formattaTesto(titolo)+"', '"+DB.formattaTesto(n_copie)+"', '"+DB.formattaTesto(fila)+"', '"+DB.formattaTesto(scaffale)+"', '"+bb.getBiblioteca()+"')");
            System.out.println("Libro inserito con successo");
        }else {
            System.out.println("libro già presente. Voui aumentare le copie presenti? [si/no]");
            scelta = in.nextLine();

            if(DB.formattaTesto(scelta).equals("si")){
                int copie = Integer.parseInt(DB.formattaTesto(n_copie)) + Integer.parseInt(n_copie_db);
                DB.qUpdateInsert("UPDATE libri SET n_copie = '"+copie+"' WHERE isbn = '"+isbn+"'");
                System.out.println("Le copie attuali sono: " + copie);
            }
        }

    }


}
