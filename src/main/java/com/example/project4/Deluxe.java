package com.example.project4;

public class Deluxe extends Pizza{

    private final Topping[] toppings = {Topping.SAUSAGE, Topping.GREENPEPPER, Topping.MUSHROOM, Topping.ONION, Topping.PEPPERONI};

    public Deluxe(){
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
