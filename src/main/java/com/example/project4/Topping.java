package com.example.project4;

public enum Topping {
    SAUSAGE("Sausage"),
    PEPPERONI("Pepperoni"),
    GREENPEPPER("Green Pepper"),
    ONION("Onion"),
    MUSHROOM("Mushroom"),
    BBQCHICKEN("BBQ Chicken"),
    PROVALONE("Provalone"),
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
}
