package com.company;

import java.util.Random;

public class Relationship {
    private String good = "Love";
    private String bad = "Hate";
    private String type;

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void randomRelationship(){
        String[] names = { "Loves", "Hates", "Likes", "is mad with", "is angry with", "sympathizes with" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
