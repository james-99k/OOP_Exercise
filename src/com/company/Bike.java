package com.company;

public class Bike {
    String name;
    String owner;
    int speed;
    String color;

    static boolean office = false;
    static boolean trail = false;

    public static void onOffice(){
        System.out.println("On our way to the office");
    }

    public static void ofTrail(){
        System.out.print(" ");
    }
}
