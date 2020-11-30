package edu.mum.cs.cs401.examples.lesson05.factorymethods2;

import edu.mum.cs.cs401.examples.lesson05.factorymethods2.windows.AddressWindow;
import edu.mum.cs.cs401.examples.lesson05.factorymethods2.windows.CustomerProfileWindow;

public class Main {

	public static void main(String[] args) {
		AddressWindow addWin = new AddressWindow();
		addWin.setVisible(true);
		CustomerProfileWindow custWin = new CustomerProfileWindow();
		custWin.setVisible(true);

	}

}
