/* StudyDialog.java by Steven Conyers
   Created: 1/21/2022
   Updated: 3/6/2024 */

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

	System.exit(0); //Ends Program
  }
}
