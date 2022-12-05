package com.example.project4;

public enum Style {
    DELUXE("Deluxe"),
    MEATZZA("Meatzza"),
    BYO("Build Your Own"),
    BBQ("BBQ Chicken");

    private final String style;

    Style (String style){
        this.style = style;
    }

    public String getStyle(){
        return style;
    }
}
