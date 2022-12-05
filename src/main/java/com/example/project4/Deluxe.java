package com.example.project4;

import java.util.ArrayList;

public class Deluxe extends Pizza{

    private final ArrayList<Topping> toppings = Topping.getDeluxe();

    public Deluxe(){
        super();
        for (Topping t : toppings)
                this.add(t);
    }


    @Override
    public double price() {
        switch (getSize()){
            case SMALL -> {
                return 14.99;
            }
            case MEDIUM -> {
                return 16.99;
            }
            case LARGE -> {
                return 18.99;
            }
            default -> {
                return 0.00;
            }
        }
    }


}
