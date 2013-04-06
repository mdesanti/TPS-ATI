package gui;

import gui.tp0.Tp0;
import gui.tp1.Tp1;
import gui.tp2.Tp2;

import javax.swing.JMenuBar;

public class Menu extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public Menu() {

		// Menu for TP0
		this.add(new Tp0());

		// Menu for TP1
		this.add(new Tp1());

		// Menu for TP2
		this.add(new Tp2());
	}

}
