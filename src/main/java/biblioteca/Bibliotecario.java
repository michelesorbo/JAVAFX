package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bibliotecario extends Persona{

    private int matricola;
    private int biblioteca;

    public Bibliotecario(String nome, String cognome, String dataNascita, int matricola, int biblioteca) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
        this.biblioteca = biblioteca;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setBiblioteca(int biblioteca) {
        this.biblioteca = biblioteca;
    }

    public int getBiblioteca() {
        return biblioteca;
    }

    public String toString(){
        LocalDate dNascita = LocalDate.parse(getDataNascita());
        String myFormattedDate = dNascita.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return "Nome: " + getNome() + " Cognome: " + getCognome() + " Data di nascita: " + myFormattedDate;
    }
}
