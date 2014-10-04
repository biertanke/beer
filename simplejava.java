/*
 * Beispielprogramm 1
 * Copyright by biertanke
*/

/**
 * Gibt nur einen Text aus
 *
 *
 * @author biertanke
 * @version 1.0
 * @see java.lang.System
 */


import javax.swing.JFrame;

public class simplejava {
	/**
	* main method
	* @param args (siehe spaeter)
	*/
	public static void main(String args[]) {
		JFrame myFrame = new JFrame();
		String myTitle = "Blank Frame";

		myFrame.setTitle(myTitle);
		myFrame.setSize(300,200);
		myFrame.setDefaultCloseOperation
			(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);


		int amountOfMoney;
		amountOfMoney = 50;
		System.out.println(amountOfMoney);
	}
}
