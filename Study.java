//Study.java by Steven Conyers - 1/19/2022
//This application gets user information, calculates and prints it on the screen

import java.util.Scanner; //Imports Scanner class

public class Study

{
  public static void main(String[] args)
  {
    Scanner myInput = new Scanner(System.in);	//Creates Scanner object
	
	//User input
	System.out.print("How many credits is this course?: ");
	int credits = myInput.nextInt();
	
	myInput.nextLine();	//Line skip
	
	System.out.print("What course are you taking?: ");
	String course = myInput.nextLine();
	
	System.out.println();	//Blank line for cleaner output
	
	//Calculation
	int studyHrs = credits * 3;
	
	//Output of user input data
	System.out.println("You should expect to spend " + studyHrs
					   + " hours each week studying for "
					   + course + ", plan ahead.");
   }
}