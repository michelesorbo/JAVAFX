package Parcheggio;

public class Vetture {

    private String targa;
    private String categoria;

    public Vetture(String targa, String categoria){
        this.targa = targa;
        this.categoria = categoria;
    }

    public String toString(){
        return "Targa: " + targa + " Categoria: " +categoria;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
