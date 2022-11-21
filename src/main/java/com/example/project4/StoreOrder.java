package com.example.project4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class StoreOrder implements Customizable{

    private ArrayList<Order> orders;

    /* TODO Methods
//    -implement the add and remove for adding and removing orders from arraylist

    - export method which saves all orders into a file
        - lookup how to create and write into a file java
     */
    public void export(){
        try {
            String s  = "RUPizza";
            String path = "file.txt";
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter filewriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter buffwriter = new BufferedWriter(filewriter);
            buffwriter.write(s);
            buffwriter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
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
