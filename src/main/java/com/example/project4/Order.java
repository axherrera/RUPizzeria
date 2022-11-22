package com.example.project4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Order implements Customizable{

    private ArrayList<Pizza> orders;
    private double orderTotal;
    private int orderNum;

    private double salesTax = .06625;

    public Order(int orderNum) {
        this.orders = new ArrayList<>();
        this.orderNum = orderNum;
    }

    @Override
    public boolean add(Object obj) {
        boolean flag = false;
        if( !orders.contains(obj)){
            orders.add((Pizza) obj);
            flag = true;
            orderTotal+=((Pizza) obj).price();
        }
        return flag;
    }

    @Override
    public boolean remove(Object obj) {
        if (orders.remove((Pizza) obj)){
            orderTotal-=((Pizza) obj).price();
            return true;
        }
        return false;
    }

    public void clearOrder(){
        this.orderTotal = 0;
        this.orders = new ArrayList<>();
    }
    public ArrayList<Pizza> getOrders() {
        if(orders ==null)
            orders = new ArrayList<>();
        return orders;
    }

    public void setOrders(ArrayList<Pizza> orders) {
        this.orders = orders;
    }

    private void updatePrice(){
        orderTotal=0;
        for(Pizza p : orders){
            orderTotal+=p.price();
        }
    }

    public double getOrderSubTotal(){
        BigDecimal b = new BigDecimal(orderTotal).setScale(2, RoundingMode.DOWN);
        return b.doubleValue();
    }

    public double getSalesTax(){
        BigDecimal b = new BigDecimal(orderTotal*salesTax).setScale(2, RoundingMode.DOWN);
        return b.doubleValue();
    }

    public double getOrderTotal(){
        BigDecimal b = new BigDecimal(orderTotal+(orderTotal*salesTax)).setScale(2, RoundingMode.DOWN);
        return b.doubleValue();
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return   orders + ", " + orderTotal + ", " + orderNum + ", ";
    }

}
