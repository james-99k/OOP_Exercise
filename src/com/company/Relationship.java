package com.company;

import java.util.Random;

public class Relationship {
    String good = "Love";
    String bad = "Hate";
    String type;

    public static void randomRelationship(){
        String[] names = { "Loves", "Hates", "Likes", "is mad with", "is angry with", "sympathizes with" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
