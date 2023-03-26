package com.skilldistillery.FoodTruck.entities;

public class FoodTruck {
	private String name;
	private String fType;
	private double rating;
	private int id;
	
	//ctors
	public FoodTruck() {		
	}
	
	public FoodTruck(String name, String fType, double rating, double id) {
		name = this.name;
		fType = this.fType;
		rating = this.rating;
		id = this.id;
	}

	
	
	
	//gets and sets
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getfType() {
		return fType;
	}
	
	public void setfType(String fType) {
		this.fType = fType;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FoodTruck name: " + name + "\t Type of Food: " + fType + "\t Rating: " + rating + "\t Truck ID: " + id + "\n";
	}
	
	//toString method

}
