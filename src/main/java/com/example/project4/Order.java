package com.example.project4;

import java.util.ArrayList;

public class Order implements Customizable{

    private ArrayList<Pizza> orders;
    private boolean orderTotal;
    private int orderNum;

     /* TODO  Methods to implement
    -getprice/generate price
    -getters and setters for instance variables
    -implement add/remove for adding and removing pizzas from order
    -write tostring method
        - will use tostring from pizza
     */

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }


}
