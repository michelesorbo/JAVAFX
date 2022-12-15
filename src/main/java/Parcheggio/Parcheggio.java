package Parcheggio;

import javafx.scene.control.DatePicker;

public class Parcheggio {

    private String nome;
    private String indirizzo;
    private int capienza;
    private int autoSosta = 0;

    public Parcheggio(String nome, String indirizzo, int capienza){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.capienza = capienza;
    }

    public String toString(){
        return "Nome: " + nome + " Capienza massima: " + capienza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public void entraVettura(String targa, String categoria, String ora_in){
        //Vado a creare la query per salvare l'ingresso
        if(autoSosta <= capienza){
            System.out.println("Puoi inserire");
        }else{
            System.out.println("Parcheggio al completo");
        }
    }
}
