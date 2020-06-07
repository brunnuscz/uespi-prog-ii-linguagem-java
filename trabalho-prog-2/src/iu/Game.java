package iu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Game {
	public static void main(String[] args) {
		new Game();
	}

	public Game() {

		JFrame frame = new JFrame("INFORMAÇÃO");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel game = new JPanel(null);
		
		JButton btnRevelar = new JButton("REVELAR");
		btnRevelar.setBounds(47, 386, 110, 25);
		game.add(btnRevelar);
		
		JButton btnMarcar = new JButton("MARCAR");
		btnMarcar.setBounds(176, 386, 97, 25);
		game.add(btnMarcar);
		
		JButton btnDesmarcar = new JButton("DESMARCAR");
		btnDesmarcar.setBounds(290, 386, 118, 25);
		game.add(btnDesmarcar);

		frame.getContentPane().add(game);
		
		frame.setVisible(true);
	}
}
