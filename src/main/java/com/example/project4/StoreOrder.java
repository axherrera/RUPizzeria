package com.example.project4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class StoreOrder implements Customizable{

    private ArrayList<Order> orders;

    public StoreOrder() {
        this.orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

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

    public Order getOrder(int orderNum){
        for(Order o : orders){
            if (o.getOrderNum() ==orderNum)
                    return o;
        }
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        return orders.remove((Order) obj);
    }
}
