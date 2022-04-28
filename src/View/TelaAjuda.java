package View;

import java.awt.Color;

import javax.swing.JButton;

import Model.Jogo;

public class TelaAjuda extends Telageral {

	private JButton voltar = new JButton("Voltar");
	
	public TelaAjuda() {
		super();
		
		voltar.setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		add(voltar).setBounds(650, 400, 100, 50);
		
		
	}

	public JButton getVoltar() {
		return voltar;
	}


	
}
