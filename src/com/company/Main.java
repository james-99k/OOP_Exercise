package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
		//bikeClass();
		//personClass();
		inputRelationship();
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
		boyClass.setfName(boyInput.next());

		System.out.print("Enter a girl's name: ");
		Scanner girlInput = new Scanner(System.in);
		Girl girlClass = new Girl();
		girlClass.setfName(girlInput.next());

		System.out.print("Enter their relationship: ");
		Scanner relationInput = new Scanner(System.in);
		Relationship relClass = new Relationship();
		relClass.setType( relationInput.next());
		System.out.println();

		System.out.println(boyClass.getfName() + " is " + boyClass.getAge() + " and likes " + boyClass.getHobby());
		System.out.println(girlClass.getfName() + " is " + girlClass.getAge() + " and likes " + girlClass.getHobby());
    	System.out.println(boyClass.getfName() + " " + relClass.getType() + " " +girlClass.getAge());
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
