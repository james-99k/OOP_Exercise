package com.company;

import java.util.Random;

public class Girl {
    String fName;
    String hobby = "Volley ball";
    int age = 10;

    public static void randomFemaleName(){
        String[] names = { "Olivia", "Emma", "Ava", "Sophia", "Isabelle", "Charlotte" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
