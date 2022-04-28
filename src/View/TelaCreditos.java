package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import Model.Jogo;

public class TelaCreditos extends Telageral{

	private JButton voltar = new JButton("Voltar");
	private JPanel panel = new JPanel();
	public TelaCreditos() {
		
		super();
		
		voltar.setBackground(Color.LIGHT_GRAY);
		
		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(BorderFactory.createEmptyBorder());
		panel.setLayout(new BorderLayout());
		panel.setSize(1400, 400);
		setLayout(null);
		add(voltar).setBounds(655, 400, 100, 50);
		add(panel);
	}

	public JButton getVoltar() {
		return voltar;
	}



		

	
}
