package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TombolaApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //BorderPane root = new BorderPane(FXMLLoader.load(getClass().getResource("tombola.fxml")));

        Parent root = FXMLLoader.load(getClass().getResource("tombola.fxml"));
        GridPane grid = new GridPane();

        //Creiamo i controlli per la grid
        Label lblFirst = new Label("PRimo");

        grid.add(lblFirst,0,0,1,1);

        grid.setHgap(10);
        grid.setVgap(5);
        grid.setPadding(new Insets(10));

        //root.setCenter(grid);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Prima Scena");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
