package com.example.project4;

import java.util.ArrayList;

public abstract class Pizza implements Customizable{

    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    Meatzza meatzza = new Meatzza();
    public Pizza() {

    }

    public abstract double price();

    public Pizza(Crust crust, Size size) {
        this.crust = crust;
        this.size = size;
    }

    public Meatzza getMeatzza() {
        return meatzza;
    }

    public void setMeatzza(Meatzza meatzza) {
        this.meatzza = meatzza;
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

    @Override
    public String toString() {
        return meatzza + "(" + crust + ")" + ", " + toppings + " , " + size + ", " + price();
    }


}
