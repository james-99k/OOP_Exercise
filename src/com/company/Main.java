package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		//bikeClass();
		//relationship();
		randomRelationshipDisplay();
    }
    public static void bikeClass(){
		Bike newBike = new Bike();

		newBike.name = "bikey";
		newBike.owner = "James";

		System.out.println(newBike.name);
		System.out.println(newBike.owner);

		newBike.onOffice();
	}

	public static void relationship(){
    	System.out.print("Enter a boy's name: ");
		Scanner boyInput = new Scanner(System.in);
		Boy boyClass = new Boy();
		boyClass.fName = boyInput.next();

		System.out.print("Enter a girl's name: ");
		Scanner girlInput = new Scanner(System.in);
		Girl girlClass = new Girl();
		girlClass.fName = girlInput.next();

		System.out.print("Enter their relationship: ");
		Scanner relationInput = new Scanner(System.in);
		Relationship relClass = new Relationship();
		relClass.type = relationInput.next();
		System.out.println();

		System.out.println(boyClass.fName + " is " + boyClass.age + " and likes " + boyClass.hobby);
		System.out.println(girlClass.fName + " is " + girlClass.age + " and likes " + girlClass.hobby);
    	System.out.println(boyClass.fName + " " + relClass.type + " " +girlClass.fName);

	}

	public static void randomRelationshipDisplay(){
		Boy boyClass = new Boy();
		boyClass.randomMaleName();

		Girl girlClass = new Girl();
		girlClass.randomFemaleName();

		Relationship relClass = new Relationship();
		relClass.randomRelationship();
	}
}
