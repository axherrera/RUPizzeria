package com.example.project4;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    Size(String size){
        this.size = size;
    }

    public static Size idSize(String s){
        s = s.toLowerCase();
        return switch (s) {
            case "small" -> Size.SMALL;
            case "medium" -> Size.MEDIUM;
            case "large" -> Size.LARGE;
            default -> Size.MEDIUM;
        };
    }
    public String getSize(){
        return size;
    }
}
