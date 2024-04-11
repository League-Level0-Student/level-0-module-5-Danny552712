package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		//Get the number
		String user = JOptionPane.showInputDialog("Choose a random number.");
		int userNumber = Integer.parseInt(user);
		
		//Counter for amount of factors
		int count = 0;
		for(int i = 2; i < userNumber; i ++) {
			if((userNumber%i) == 0) {
				count++;
			}
		}
		
		//Check if the number had any other factors
		if(count > 0) {
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		} else {
			JOptionPane.showMessageDialog(null, "Your number is a prime number");
		}
	}
}