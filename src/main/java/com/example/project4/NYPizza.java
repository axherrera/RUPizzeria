package com.example.project4;

public class NYPizza implements PizzaFactory{
    @Override
    public Pizza createDeluxe() {
        Deluxe p = new Deluxe();
        p.setCrust(Crust.BROOKLYN);
        return p;
    }

    @Override
    public Pizza createMeatzza() {
        Meatzza p = new Meatzza();
        p.setCrust(Crust.HANDTOSSED);
        return p;
    }

    @Override
    public Pizza createBBQChicken() {
        BBQ p = new BBQ();
        p.setCrust(Crust.THIN);
        return p;
    }

    @Override
    public Pizza createBuildYourOwn() {
        BYO p = new BYO();
        p.setCrust(Crust.HANDTOSSED);
        return p;
    }
}
