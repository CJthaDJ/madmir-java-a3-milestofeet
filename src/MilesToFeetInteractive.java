import java.util.Scanner;
import javax.swing.JOptionPane;

public class MilesToFeetInteractive {

	public static void main(String[] args) {
		//Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		
		//Declare and initialize Scanner
		float uncleMiles, uncleFeet;
		Scanner kbrd = new Scanner(System.in);
		
		//User Input
		System.out.print("Please Enter the distance in miles" + "to your uncle's house: ");
		uncleMiles = kbrd.nextFloat();
		
		//Convert miles to feet
		uncleFeet = uncleMiles *FEET_PER_MILE;
		
		//Display Output
		JOptionPane.showMessageDialog(null, "The distance to your uncle's" + "house is" + uncleMiles + "miles. That's" + uncleFeet + "feet");
		
	}

}