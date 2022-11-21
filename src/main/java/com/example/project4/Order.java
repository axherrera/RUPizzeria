package com.example.project4;

import java.util.ArrayList;

public class Order implements Customizable{

    private ArrayList<Pizza> orders;
    private double orderTotal;
    private int orderNum;
    private double price;

    public Order(int orderNum) {
        this.orders = new ArrayList<>();
        this.orderTotal = 0.00;
        this.orderNum = orderNum;
    }

    /* TODO  Methods to implement
//    -getprice/generate price
//    -getters and setters for instance variables
    -implement add/remove for adding and removing pizzas from order
    -write tostring method
        - will use tostring from pizza
     */
    public ArrayList<Pizza> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Pizza> orders) {
        this.orders = orders;
    }

    public double isOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    @Override
    public boolean add(Object obj) {
        boolean flag = false;
        if( !orders.contains(obj)){
            orders.add((Pizza) obj);
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean remove(Object obj) {
        return orders.remove((Pizza) obj);
    }

    @Override
    public String toString() {
        return   orders + ", " + orderTotal + ", " + orderNum + ", " + price;
    }

}
