package com.example.project4;

import java.util.ArrayList;

public class Meatzza extends Pizza{

    private final ArrayList<Topping> toppings = Topping.getMeatzza();

    public Meatzza() {
        super();
        for (Topping t : toppings)
            this.add(t);
    }

    @Override
    public double price() {
        switch (getSize()){
            case SMALL -> {
                return 15.99;
            }
            case MEDIUM -> {
                return 17.99;
            }
            case LARGE -> {
                return 19.99;
            }
            default -> {
                return 0.00;
            }
        }
    }
}
