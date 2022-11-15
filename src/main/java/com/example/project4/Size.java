package com.example.project4;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    Size(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
