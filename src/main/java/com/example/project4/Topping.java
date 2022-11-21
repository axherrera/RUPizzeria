package com.example.project4;

import java.util.ArrayList;
import java.util.Arrays;

public enum Topping {
    SAUSAGE("Sausage"),
    PEPPERONI("Pepperoni"),
    GREENPEPPER("Green Pepper"),
    ONION("Onion"),
    MUSHROOM("Mushroom"),
    BBQCHICKEN("BBQ Chicken"),
    PROVOLONE("Provolone"),
    CHEDDAR("Cheddar"),
    BEEF("Beef"),
    HAM("Ham"),
    PINEAPPLE("Pineapple"),
    BACON("Bacon"),
    OLIVES("Olives");

    private final String topping;

    Topping(String topping){
        this.topping = topping;
    }

    public String getTopping(){
        return topping;
    }

    public static ArrayList<Topping> getAll(){
        return new ArrayList<>(Arrays.asList(
                SAUSAGE, PROVOLONE, PEPPERONI, PINEAPPLE, GREENPEPPER, OLIVES, ONION, CHEDDAR, MUSHROOM, BEEF, HAM,
                BACON, BBQCHICKEN
        ));
    }

    public static ArrayList<Topping> getDeluxe(){
        return new ArrayList<>(Arrays.asList(
                SAUSAGE, PEPPERONI, GREENPEPPER, ONION, MUSHROOM
        ));
    }

    public static ArrayList<Topping> getBBQ(){
        return new ArrayList<>(Arrays.asList(
                BBQCHICKEN, GREENPEPPER, PROVOLONE, CHEDDAR
        ));
    }

    public static ArrayList<Topping> getMeatzza(){
        return new ArrayList<>(Arrays.asList(
                SAUSAGE, PEPPERONI, BEEF, HAM
        ));
    }


}
