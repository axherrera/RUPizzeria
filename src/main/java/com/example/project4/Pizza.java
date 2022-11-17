package com.example.project4;

import java.util.ArrayList;

public abstract class Pizza implements Customizable{

    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;

    public abstract double price();

    @Override
    public boolean add(Object obj) {
        if(obj instanceof Topping)
            return toppings.add((Topping)obj);
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        if(obj instanceof Topping)
            return toppings.remove(obj);
        return false;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public int getNumToppings(){
        return toppings.size();
    }
}
