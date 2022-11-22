package com.example.project4;

public class ChicagoPizza implements PizzaFactory{

    @Override
    public Pizza createDeluxe() {
        Deluxe p = new Deluxe();
        p.setCrust(Crust.DEEPDISH);
        return p;
    }

    @Override
    public Pizza createMeatzza() {
        Meatzza p = new Meatzza();
        p.setCrust(Crust.STUFFED);
        return p;
    }

    @Override
    public Pizza createBBQChicken() {
        BBQ p = new BBQ();
        p.setCrust(Crust.PAN);
        return p;
    }

    @Override
    public Pizza createBuildYourOwn() {
        BYO p = new BYO();
        p.setCrust(Crust.PAN);
        return p;
    }
}
