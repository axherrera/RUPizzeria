package com.example.project4;

import java.util.ArrayList;

public class StoreOrder implements Customizable{

    private ArrayList<Order> orders;

    /* TODO Methods
//    -implement the add and remove for adding and removing orders from arraylist

    - export method which saves all orders into a file
        - lookup how to create and write into a file java
     */

    @Override
    public boolean add(Object obj) {
        boolean flag = false;
        if( !orders.contains(obj)){
            orders.add((Order) obj);
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean remove(Object obj) {
        return orders.remove((Order) obj);
    }
}
