package biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {

    private String nome;

    GestioneDB DB = new GestioneDB();

    public Biblioteca(String nome, String indirizzo){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString(){
        String msg = "";
        ResultSet rs;
        rs = DB.qSelect("SELECT * FROM biblioteche WHERE nome = '" + nome + "'");

        try {
            while (rs.next()){
                msg += "Nome: " + rs.getString("nome");
                msg += " Indirizzo: " + rs.getString("indirizzo");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return msg;
    }

}
