package com.example.project4;

import java.util.ArrayList;

public class BBQ extends Pizza{

    private final ArrayList<Topping> toppings = Topping.getBBQ();
    public BBQ() {
        super();
        for (Topping t : toppings)
            this.add(t);
    }

    @Override
    public double price() {
        return 0;
    }
}
