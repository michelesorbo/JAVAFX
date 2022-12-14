package Stringhe;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField str1;
    @FXML
    private TextField str2;

    Alert alert = new Alert(Alert.AlertType.NONE);

    private Character[] vocali = {'a','e','i', 'o','u'};

    private Character[] alfabeto = {'a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z','x','y','k','j','w'};
    public void es1(){
        int conta = 0;

        String str = str1.getText().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                conta++;
            }
        }

        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setContentText("Il numero di vocali presenti nella frase è: " + conta);
        alert.showAndWait();

    }

    public void es2(){
        String str_rev = "";

        for (int i = str1.getText().length() - 1; i >= 0 ; i--) {
            str_rev += "" + str1.getText().charAt(i);
        }

        alert.setAlertType(Alert.AlertType.INFORMATION);

        if(str1.getText().equals(str_rev)){
            alert.setContentText("La frase è palindroma: " + str_rev);
            alert.showAndWait();
        }else {
            alert.setContentText("La frase non è palindroma: " + str_rev);
            alert.showAndWait();
        }



    }

    public void es3(){
        String[] parola = str1.getText().split(" ");

        if(parola.length > 1){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Puoi inserire solo una parola");
            alert.showAndWait();
        }else{
            //Faccio il reverse
            String reverse = "";
            for (int i = parola[0].length() - 1; i >= 0 ; i--) {
                reverse += parola[0].charAt(i);
            }
            alert.setAlertType(Alert.AlertType.INFORMATION);
            if(parola[0].equals(reverse)){
                alert.setContentText("La parola è palindroma");
                alert.showAndWait();
            }else {
                alert.setContentText("La parola non è palindroma");
                alert.showAndWait();
            }
        }
    }

    public void es4(){
        String[] parola = str1.getText().split(" ");
        String str_finale = "";
        for (int i = 0; i < parola.length; i++) {
            str_finale += parola[i].substring(0,1).toUpperCase() + parola[i].substring(1) + " ";
        }

        str_finale = str_finale.trim();
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setContentText("Risultatoè: " + str_finale);
        alert.showAndWait();
    }

    public void es5(){

        int max = 0, conta = 0;
        char max_c = 'a';

        for (int i = 0; i < alfabeto.length; i++) {
            for (int j = 0; j < str1.getText().length(); j++) {
                if(alfabeto[i] == str1.getText().charAt(j)){
                    conta++;
                }
            }
            if(conta > max){
                max = conta; //Nuovo max
                max_c = alfabeto[i]; //Ricordo il carattere più scritto
            }
            conta = 0;
        }

        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setContentText("Carattere più scritto : " + max_c + " digitato " + max + " volte");
        alert.showAndWait();


    }

    public void es6(){

    }

    public void es7(){

    }
}
