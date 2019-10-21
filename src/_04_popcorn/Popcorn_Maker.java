package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Maker {
	public static void main(String[] args) {
			String flavor = JOptionPane.showInputDialog("what is your favorite flavor?");
			String cook = JOptionPane.showInputDialog("How many minutes should the popcorn be cooked?");
			int bake = Integer.parseInt(cook);
			Popcorn bag = new Popcorn(flavor);
			Microwave wave = new Microwave();
			wave. putInMicrowave(bag);
			wave. setTime(bake);
			wave. startMicrowave();
			bag. eat();
	}
}
/* Your mission and you have to accept it:
 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
 * The main method should create a bag of Popcorn and cook it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 * Don't change the existing methods.
 */