package com.company;

import java.util.Random;

public class Boy {
    private String fName;
    private String hobby = "Basket ball";
    private int age = 12;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void randomMaleName(){
        String[] names = { "Liam", "Noah", "Oliver", "William", "Elijah", "Benjamin" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
