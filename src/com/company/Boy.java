package com.company;

import java.util.Random;

public class Boy {
    String fName;
    String hobby = "Basket ball";
    int age = 12;

    public static void randomMaleName(){
        String[] names = { "Liam", "Noah", "Oliver", "William", "Elijah", "Benjamin" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
