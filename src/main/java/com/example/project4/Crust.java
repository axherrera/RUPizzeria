package com.example.project4;

public enum Crust {
    DEEPDISH("Deep Dish"),
    PAN("Pan"),
    STUFFED("Stuffed"),
    BROOKLYN("Brooklyn"),
    THIN("Thin"),
    HANDTOSSED("Hand Tossed");

    private final String crust;

    Crust(String crust){
        this.crust = crust;
    }

    public String getCrust(){
        return this.crust;
    }
}
