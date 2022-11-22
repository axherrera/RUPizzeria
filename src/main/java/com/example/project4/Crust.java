package com.example.project4;

public enum Crust {
    DEEPDISH("Chicago - Deep Dish"),
    PAN("Chicago - Pan"),
    STUFFED("Chicago - Stuffed"),
    BROOKLYN("New York - Brooklyn"),
    THIN("New York - Thin"),
    HANDTOSSED("New York - Hand Tossed");

    private final String crust;

    Crust(String crust){
        this.crust = crust;
    }

    @Override
    public String toString(){
        return this.crust;
    }
}
