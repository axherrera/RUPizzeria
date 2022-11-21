package com.example.project4;

public class BYO extends Pizza{

    private final double ppt = 1.59;
    public BYO() {
        super();
    }

    @Override
    public double price() {
        switch (getSize()){
            case SMALL -> {
                return 8.99 + (this.getNumToppings()*ppt);
            }
            case MEDIUM -> {
                return 10.99 + (this.getNumToppings()*ppt);
            }
            case LARGE -> {
                return 12.99 + (this.getNumToppings()*ppt);
            }
            default -> {
                return 0.00;
            }
        }
    }
}
