package iu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Inicio {
	public static void main(String[] args) {
		new Inicio();
	}

	public Inicio() {
		// TAMANHO JANELA
		JFrame frame = new JFrame("JOGO");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// PANEL
		JPanel game = new JPanel(null);

		// TITULO
		JLabel tituloAdiciona = new JLabel("CAMPO MINADO");
		game.add(tituloAdiciona);
		tituloAdiciona.setBounds(165, 141, 158, 45);
		tituloAdiciona.setFont(new Font("Dialog", Font.PLAIN, 20));

		// BOTÃO JOGAR
		JButton btnPlay = new JButton("JOGAR");
		btnPlay.setBounds(107, 211, 264, 23);
		frame.getContentPane().add(btnPlay);
		btnPlay.addActionListener(new Informacao());
		
		// BOTÃO SAIR
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(107, 247, 264, 23);
		game.add(btnSair);

		frame.getContentPane().add(game);
		// JANELA VISIVEL
		frame.setVisible(true);

		// AÇÃO DO BOTÃO
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
