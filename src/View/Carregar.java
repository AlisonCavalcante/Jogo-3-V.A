package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Carregar extends JFrame {
	
	private  JProgressBar progresso;
	private  JLabel labelCarregando;
	
	public Carregar(){
			super("Tela de carregar");
			setResizable(true);
			setSize(500, 500);
			setLocationRelativeTo(null);
			setLayout(null);
			
			setUndecorated(true);
			
			labelCarregando = new JLabel("Carregando....");
			labelCarregando.setFont(new Font("Arial", Font.BOLD, 40));
			labelCarregando.setBounds(150, 200, 400, 70);
			
			progresso = new JProgressBar();
			progresso.setBounds(2,450,475,10);
			progresso.setForeground(Color.GREEN);
			
			add(progresso);
			add(labelCarregando);
			
			setVisible(true);
	}

	public JProgressBar getProgresso() {
		return progresso;
	}

	public void setProgresso(JProgressBar progresso) {
		this.progresso = progresso;
	}

	public JLabel getLabelCarregando() {
		return labelCarregando;
	}

	public void setLabelCarregando(JLabel labelCarregando) {
		this.labelCarregando = labelCarregando;
	}	

	
	
}