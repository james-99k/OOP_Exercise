package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		bikeClass();
		personClass();
		//inputRelationship();
		//randomRelationshipDisplay();
    }
    public static void bikeClass(){
		//with parameter
		Bike newBikePara = new Bike("Bikey", "James", 100, "Blue");

		System.out.println(newBikePara.name);
		System.out.println(newBikePara.owner);
		System.out.println(newBikePara.speed);
		System.out.println(newBikePara.color);

		System.out.println();

		//without parameter
		Bike newBike = new Bike();

		newBike.name = "byk";
		newBike.owner = "bob";
		newBike.speed = 50;
		newBike.color = "red";

		System.out.println(newBike.name);
		System.out.println(newBike.owner);
		System.out.println(newBike.speed);
		System.out.println(newBike.color);
		System.out.println();
	}

	public static void personClass(){
    	Person personName = new Person("James", 12);
    	System.out.println(personName.name + " is " +personName.age +" years old.");
	}

	public static void inputRelationship(){
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

		Relationship relClass = new Relationship();
		relClass.randomRelationship();

		Girl girlClass = new Girl();
		girlClass.randomFemaleName();
	}
}
