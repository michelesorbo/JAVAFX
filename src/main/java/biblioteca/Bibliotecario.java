package biblioteca;

public class Bibliotecario extends Persona{

    private int matricola;
    private int biblioteca;

    public Bibliotecario(String nome, String cognome, String dataNascita, int matricola, int biblioteca) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
        this.biblioteca = biblioteca;
    }
}
