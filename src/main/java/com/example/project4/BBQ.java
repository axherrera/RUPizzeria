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
        switch (getSize()){
            case SMALL -> {
                return 13.99;
            }
            case MEDIUM -> {
                return 15.99;
            }
            case LARGE -> {
                return 17.99;
            }
            default -> {
                return 0.00;
            }
        }
    }
}
