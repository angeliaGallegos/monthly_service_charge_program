/* 
Angelia
09-22-2018
CSCI 1015
Programming Assignment 4
The program's purpose is to take the user's input of 
types of service packages and provide monthly charges.
*/


import javax.swing.JOptionPane;

public class LovelandPass4
{
	public static void main(String[] args)
	{
		String in; //Initial input from user
		String up; //Store uppercase of string in
		char pt; //Package type being used 
		final double packageA = 9.95; //Price for package A per month
		final double hoursA = 10; //Hours of access for package A
		final double overagesA = 2.00; //Overage charges for package A
		final double packageB = 13.95; //Price for package B per month
		final double hoursB = 20; //Hours of access for package B
		final double overagesB = 1.00; //Overage charges for package B
		final double packageC = 19.95; //Price for package C 
	   double hoursused; //Hours packages are used 
		double total = 0; //Total amount owed
	
		//Prompt user to enter the type of package
		in = JOptionPane.showInputDialog("Enter the the type of package?(A,B, or C):");
									 
		up = in.toUpperCase();
		pt = up.charAt(0);
      
      //Message if user chooses anything other then A, B, or C
      if(pt != 'A' && pt != 'B' && pt != 'C')
      {
         JOptionPane.showMessageDialog(null,"Please restart this program and enter either: \n"
                                          + "A, B, or C");
         
         System.exit(0);
      }
		
		//Prompt user for hours used
		in = JOptionPane.showInputDialog("How many hours did you use this product?");
		hoursused = Double.parseDouble(in);
		
		//Calculate and display amount owed for package A
		if(pt == 'A')
		{
			if(hoursused > hoursA)
			{
				total = ((hoursused - hoursA) * overagesA + packageA);
			}
			else if (hoursused <= hoursA)
			{
				total = packageA;
			}
			JOptionPane.showMessageDialog(null,"The total amount owed is: \n"
         + "$"+total);
		}
		
      //Calculate and display amount owed for package B
		else if(pt == 'B')
		{
			if(hoursused > hoursB)
			{
				total = ((hoursused - hoursB) * overagesB + packageB);
			}
			else if (hoursused <= hoursB)
			{
				total = packageB;
			}
			JOptionPane.showMessageDialog(null,"The total amount owed is: \n"
         + "$"+total);
		}
		
      //Calculate and display amount owed for package C
		else if(pt == 'C')
		{
			total = packageC;
         JOptionPane.showMessageDialog(null,"The total amount owed is: \n"
         + "$"
         +total);
		}
		System.exit(0);
	}
}