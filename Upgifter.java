import javax.swing.*;

/*
	Vad? Inläsning från dialogruta.
	Vem? Felix
	När? 09/18
*/

public class Upgifter{
	public static void main(String[]args){

		String firstName, lastName, answer;

		firstName = JOptionPane.showInputDialog("Namn?");
		lastName = JOptionPane.showInputDialog("Efternamn?");
		answer = JOptionPane.showMessageDialog (null, firstName + lastName);



	}
}
