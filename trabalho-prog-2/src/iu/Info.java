package iu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Info{
	private JTextField txt_linha;
	private JTextField txt_coluna;
	private JTextField txt_jogador;
	public static void main(String[] args) {
		new Info();
	}

	public Info() {
		
		JFrame frame = new JFrame("INFORMAÇÃO");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(null);
		
		JLabel jogador = new JLabel("Jogador:");
		jogador.setBounds(82, 227, 56, 16);
		panel.add(jogador);
		
		JLabel linha = new JLabel("Linha:");
		linha.setBounds(82, 262, 56, 16);
		panel.add(linha);
		
		JLabel coluna = new JLabel("Coluna:");
		coluna.setBounds(82, 302, 56, 16);
		panel.add(coluna);
		
		JButton btnConcluir = new JButton("INICIAR");

		frame.getContentPane().add(btnConcluir);
		btnConcluir.addActionListener(new Gamer());
		btnConcluir.setBounds(184, 353, 97, 25);
		panel.add(btnConcluir);
		
		
		txt_linha = new JTextField();
		txt_linha.setBounds(150, 259, 178, 22);
		panel.add(txt_linha);
		txt_linha.setColumns(10);
		
		txt_coluna = new JTextField();
		txt_coluna.setBounds(150, 299, 178, 22);
		panel.add(txt_coluna);
		txt_coluna.setColumns(10);
		
		txt_jogador = new JTextField();
		txt_jogador.setBounds(150, 224, 178, 22);
		panel.add(txt_jogador);
		txt_jogador.setColumns(10);

		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}
}
