package com.example.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

    Order currentOrder;
    StoreOrder storeOrders;
    int orderNums;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        orderNums = 1;
        currentOrder = new Order(orderNums++);
        storeOrders = new StoreOrder();
    }

    @FXML
    void selectCO(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CurrentOrder.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("New York Style Pizza");
        stage.show();
    }

    @FXML
    void selectChiStyle(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ChicagoPizza.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("New York Style Pizza");
        stage.show();
    }

    @FXML
    void selectNYS(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NewYorkPizza.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("New York Style Pizza");
        stage.show();
    }

    @FXML
    void selectSO(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StoreOrders.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("New York Style Pizza");
        stage.show();
    }

    public void addToOrder(Pizza pizza){

    }



}
