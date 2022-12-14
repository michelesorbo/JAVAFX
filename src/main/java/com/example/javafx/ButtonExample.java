package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane(Orientation.HORIZONTAL, 5, 5);
        root.setPadding(new Insets(10));

        for (int i = 1; i < 25; i++) {
            root.getChildren().add(new Button(String.valueOf(i)));
        }

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Tombola");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
