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
        return 0;
    }
}
