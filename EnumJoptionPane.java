import javax.swing.JOptionPane;
/**
 * @author Md Amin Khan 
 ** Prof. Kanes Kanchanawanchai
 * March 26, 2017
 * purpose of the program: 
 * To Demonstrate the use of Enum & JOptionPane Combo box with while loop and use of switch case
 */
public class EnumJoptionPane {

	enum monthselection {
		January, February, March, April, May, June, July, August, September, October, November, December
	}

	public static void main(String[] args) {
		String[] choices = { "January", "February", "March", "April", " May", "June", "July", "August", "September",
				"October", "November", "December" };
		String input = (String) JOptionPane.showInputDialog(null, "Select Your Month", "Month Type",
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);

		// String input = JOptionPane.INPUT_VALUE_PROPERTY;

		while (input != null) {

			switch (input) {
			case ("January"):
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case ("February"):
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case ("March"):
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case ("April"):
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case ("May"):
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case ("June"):
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case ("July"):
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case ("August"):
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case ("September"):
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case ("October"):
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case ("November"):
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;

			case ("December"):
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");

				break;
			}
			input = (String) JOptionPane.showInputDialog(null, "Select Your Month", "Month Type",
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);

		}

	}
}
