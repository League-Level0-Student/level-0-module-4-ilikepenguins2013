package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog("how many nickels do you have");
		//Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickels = Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("how many dimes do you have");
		int dimes = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("how many quarters do you have");
		int quarters = Integer.parseInt(q);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double money = (0.05*nickels)+(0.10*dimes)+(0.25*quarters);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null,"you have $"+money);

	}
}

