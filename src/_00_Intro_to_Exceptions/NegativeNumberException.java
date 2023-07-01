package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {

	public static void ScaryPopup() {
		JOptionPane.showMessageDialog(null, "ALERT! You have been infected with [55] viruses. "
				+ "By getting [55] viruses, you have "
				+ "triggered a CRITICAL ERROR");
	}
}
