package com.skilldistillery.FoodTruck.app;

import java.util.Scanner;

import com.skilldistillery.FoodTruck.entities.FoodTruck;

public class FoodTruckApp {
		//foodtruckarray
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[5];
		
		
		
				
		for (int i = 0; i < foodTrucks.length; i++) {
			foodTrucks[i] = new FoodTruck();
		}
		
		
		for (int i = 0; i < foodTrucks.length; i++) {
			
			System.out.println("Please enter the name of the truck number: " + (i+1) + ", or type done.");
			String resultName;
			resultName = sc.nextLine();
			
			
			if (resultName.equalsIgnoreCase("done")) { 
				break;
			}
			foodTrucks[i].setName(resultName);
			
			
				
			System.out.println("Please enter the type of food the truck sells");
			String resultType;
			resultType = sc.nextLine();
			foodTrucks[i].setfType(resultType);
				
			System.out.println("Please enter the rating for this truck");
			double resultRating = 0;
			resultRating = sc.nextDouble();
			foodTrucks[i].setRating(resultRating);
			
			sc.nextLine();
				
			foodTrucks[i].setId(i + 1);			
			
		}
	
			
			
			
		boolean keepGoing = true;
					
		while (keepGoing) {
			
			
			System.out.println(
					"Please chose an option \n" +
					"1: List Trucks \n" +
					"2: See average rating of trucks \n" +
					"3: Show highest rated Truck \n" + 
					"4: Quit");
					
			int choice = sc.nextInt();
			
			
			
			if (choice == 4) {
				System.out.println("Thanks for using my app, Goodbye!!!");
				keepGoing = false;
				break;
			}
			
			
			
			else if (choice == 1) {
				for (int i2 = 0; i2 < foodTrucks.length; i2 ++) {
					
					if (foodTrucks[i2].getName() == null) {
						break;
					}
						else {
							System.out.println(foodTrucks[i2].toString());
					}	
				}	
			}
			
			
			
			else if (choice == 2) {
				double totalRating = 0;
				double averageRating = 0;
				
				for(int i3 = 0; i3 < foodTrucks.length; i3++) {
					
					if (foodTrucks[i3].getRating() == 0.0) {
						break;
					}else {
						
				double rating = foodTrucks[i3].getRating();
				totalRating += rating;
				averageRating = (totalRating / (i3 + 1));
				
					}
				}
				System.out.println("The average rating is: " + averageRating + "\n");
			}
			
			
			
			else if (choice == 3) {
				double highestRating = 0;
				String winner = null;
				
				for (int i4 = 0; i4 < foodTrucks.length; i4++) {
						if (foodTrucks[i4].getRating() > highestRating) {
							highestRating = foodTrucks[i4].getRating();
							winner = foodTrucks[i4].toString();
						}
				}
				System.out.println("The highest rated truck is :\n" + winner);
			}
					
					
			}
		sc.close();
	}
}
