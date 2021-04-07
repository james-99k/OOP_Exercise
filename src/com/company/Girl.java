package com.company;

import java.util.Random;

public class Girl {
    private String fName;
    private String hobby = "Volley ball";
    private int age = 10;

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

    public static void randomFemaleName(){
        String[] names = { "Olivia", "Emma", "Ava", "Sophia", "Isabelle", "Charlotte" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }
}
