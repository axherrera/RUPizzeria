package com.example.project4;

public enum Style {
    CHI("Chicago"),
    NY("New York");

    private final String style;

    Style (String style){
        this.style = style;
    }

    public String getStyle(){
        return style;
    }
}
