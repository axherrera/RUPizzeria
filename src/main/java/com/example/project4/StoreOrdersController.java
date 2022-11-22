package com.example.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreOrdersController implements Initializable {

    private HomePageController homePageController;

    @FXML
    private ListView<Pizza> allOrders;

    @FXML
    private ComboBox<Integer> orderNum;

    @FXML
    private TextField orderTotal;

    private ObservableList<Pizza> selectedOrder;
    private  ObservableList<Order> orders;

    private ObservableList<Integer> orderNums;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        orderTotal.setText("0");
    }

    public void setHomePageController(HomePageController controller){
        this.homePageController=controller;
    }

    @FXML
    void chooseOrder(ActionEvent event) {
        Integer selection = orderNum.getSelectionModel().getSelectedItem();
        updatePage(selection);
    }

    @FXML
    void cancelOrder(ActionEvent event) {
        homePageController.cancelOrder(
                homePageController.storeOrders.getOrder(
                        orderNum.getSelectionModel().getSelectedItem()
                )
        );
    }

    @FXML
    void exportOrder(ActionEvent event) {
        homePageController.storeOrders.export();
    }

    void updatePage(Integer orderNum){
        Order selected = homePageController.storeOrders.getOrder(orderNum);
        if(selected == null)
            return;
        orderTotal.setText("$"+ selected.getOrderTotal());
        selectedOrder = FXCollections.observableArrayList();
        selectedOrder.addAll(selected.getOrders());
        allOrders.setItems(selectedOrder);
    }

    void populateOrders(StoreOrder storeOrder){
        orders = FXCollections.observableArrayList();
        orders.addAll(storeOrder.getOrders());
        orderNums = FXCollections.observableArrayList();
        for(Order o : storeOrder.getOrders()){
            orderNums.add(o.getOrderNum());
        }
        orderNum.setItems(orderNums);
    }


}
