package com.company;

public class Main {

    public static void main(String[] args) {
		//bikeClass();
		relationship();
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
    	Boy boyClass = new Boy();
    	Girl girlClass = new Girl();
    	Relationship relClass = new Relationship();

		System.out.println(boyClass.fName + " " + boyClass.lName + " is " + boyClass.age);
		System.out.println(girlClass.fName + " " + girlClass.lName + " is " + girlClass.age);
    	System.out.println(boyClass.fName + " " + relClass.good + " " +girlClass.fName);

	}
}
