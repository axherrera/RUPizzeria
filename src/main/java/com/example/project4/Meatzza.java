package com.example.project4;

public class Meatzza extends Pizza{
    public Meatzza(Crust crust, Size size) {
        super(crust, size);
    }

    public Meatzza() {
        super();
    }

    @Override
    public double price() {
        return 0;
    }
}
