package com.example.project4;

import java.util.ArrayList;

public abstract class Pizza implements Customizable{

    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;

    public abstract double price();

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }
}
