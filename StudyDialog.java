//StudyDialog.java by Steven Conyers - 1/21/2022
//This program uses dialog boxes to get input, calculates and outputs using dialog boxes

import javax.swing.JOptionPane; //Calls to accept user input

public class StudyDialog

{
  public static void main(String[] args)
  {
	
	int credits;	//The number of credits
	int studyHrs;	//The number of study hours needed
	String myInput;	//For reading input
	String course;	//For reading input
	
	//Get user credits
	myInput = JOptionPane.showInputDialog("How many credits is this course?: ");
	credits = Integer.parseInt(myInput);	//Converts input to an int
	
	//Get user course
	course = JOptionPane.showInputDialog("What course are you taking?: ");
	
	//Calulation
	studyHrs = credits * 3;
	
	//Output of user input data
	JOptionPane.showMessageDialog(null, "You should expect to spend " + studyHrs
					   + " hours each week studying for "
					   + course + ", plan ahead.");
					   
	//Ends program
	System.exit(0);
  }
}