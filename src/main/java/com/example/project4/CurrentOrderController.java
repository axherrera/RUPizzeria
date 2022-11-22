package com.example.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CurrentOrderController implements Initializable {

    private HomePageController homePageController;
    private ObservableList<Pizza> orders;

    @FXML
    private ListView<Pizza> allOrders;

    @FXML
    private TextField orderNumber, orderTotal, salesTax, subtotal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        orderNumber.setEditable(false);
        subtotal.setEditable(false);
        salesTax.setEditable(false);
        orderTotal.setEditable(false);
    }

    public void setHomePageController(HomePageController controller){
        this.homePageController=controller;
    }

    @FXML
    void clearOrder(ActionEvent event) {
        orders.removeAll(orders);
        homePageController.currentOrder.clearOrder();
        subtotal.setText("0");
        salesTax.setText("0");
        orderTotal.setText("0");
    }

    @FXML
    void placeOrder(ActionEvent event) {
        if(orders.size()==0)
            return;
        homePageController.placeOrder();
    }

    @FXML
    void removePizza(ActionEvent event) {
        Pizza selected = allOrders.getSelectionModel().getSelectedItem();
        if(selected == null)
            return;
        orders.remove(selected);
        homePageController.removePizza(selected);
        subtotal.setText("$"+ homePageController.currentOrder.getOrderSubTotal());
        salesTax.setText("$"+ homePageController.currentOrder.getSalesTax());
        orderTotal.setText("$"+ homePageController.currentOrder.getOrderTotal());
    }

    public void populateOrder(Order order){
        orders = FXCollections.observableArrayList();
        orders.addAll(order.getOrders());
        allOrders.setItems(orders);
        orderNumber.setText(Integer.toString(homePageController.currentOrder.getOrderNum()));
        subtotal.setText(Double.toString(homePageController.currentOrder.getOrderSubTotal()));
        salesTax.setText(Double.toString(homePageController.currentOrder.getSalesTax()));
        orderTotal.setText(Double.toString(homePageController.currentOrder.getOrderTotal()));
    }


}
