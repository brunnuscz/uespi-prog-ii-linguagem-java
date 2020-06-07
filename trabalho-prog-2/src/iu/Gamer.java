package iu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gamer implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		new Game();	
	}
}