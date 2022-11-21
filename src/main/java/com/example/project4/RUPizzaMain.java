package com.example.project4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RUPizzaMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent home = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("HomePage.fxml"))));
        Scene homeScene = new Scene(home);
        stage.setTitle("RU Pizzeria");
        stage.setScene(homeScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}