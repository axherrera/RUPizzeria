package com.example.project4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BYO extends Pizza{

    private final double ppt = 1.59;
    public BYO() {
        super();
    }

    @Override
    public double price() {
        switch (getSize()){
            case SMALL -> {
               return BigDecimal.valueOf(
                       8.99 + (this.getNumToppings() * ppt)).setScale(
                               2, RoundingMode.DOWN)
                       .doubleValue();

            }
            case MEDIUM -> {
                return BigDecimal.valueOf(
                                10.99 + (this.getNumToppings()*ppt)).setScale(
                                2, RoundingMode.DOWN)
                        .doubleValue();
            }
            case LARGE -> {
                return BigDecimal.valueOf(
                                12.99 + (this.getNumToppings()*ppt)).setScale(
                                2, RoundingMode.DOWN)
                        .doubleValue();
            }
            default -> {
                return 0.00;
            }
        }
    }
}
