## FoodTruckProject


# Overview
This is a project that has two parts. In the first part, the user is prompted to enter the name, type of food, and rating of a food truck. The program creates a type of object called a FoodTruck, then uses setters to store the users input in the relevant fields. The program also assigns each truck a unique truck ID. The objects are then stored in an array, with space for up to five trucks. If the user enters in information for five trucks, the program will automatically move on to the second part, however they are also able to enter "done" at any point to enter less than five trucks. In the second part of the program, the user is given a menu of four choices, and can input their choice. The menu section runs in a while loop, allowing the user to keep making new selections until the choose to exit the program. 

#Technologies used
Java-OOP, Eclipse IDE, GitHub, Sublime

#Lessons learned
The first and biggest lesson learned is in relation to the scanner. When scanning for a string, after scanning for an int or double, the scanner will have some issues. The scanner will skip the next String input and continue on, without waiting for a user to give it input. This is fixed relatively easily, by putting a "dummy" string scanner, after the int/double scanner. This dummy scanner wont actually be used for anything, but will make it so the program is able to accept a string after accpeting an int or double. The second lesson learned is that the .length operator isn't always the best choice. When calculating average ratings, I was originally dividing by the array.length, which worked when the array was full, but caused issues if the user entered less than five trucks. This shows its important to know when you want to get the value of the whole array length, or just the length of the array that has actual objects in it. 