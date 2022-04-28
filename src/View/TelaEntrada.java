package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.Oneway;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import Model.Audio;
import Model.Fase1;
import Model.Nave;

public class TelaEntrada extends Telageral {
	

private	JButton botao = new JButton("Iniciar");
private	JButton botao1 = new JButton("Ajuda");
private	JButton botao2 = new JButton("Créditos");
private	JButton botao3 = new JButton("Sair");
private JLabel labelNome = new JLabel("Nome:");
private static JTextField nomeField = new JTextField(100);
private JButton opcaoRomano = new JButton("Romanos");
private JButton opcaoNumero = new JButton("Números");

private PainelTelaEntrada painelTelaEntrada;
private PainelMissao painelMissao;
TelaAjuda telaAjuda;
TelaCreditos telaCreditos;
Fase1 fase1;
InventarioPainel paneIventario;

	
	
	public TelaEntrada(PainelTelaEntrada painelTelaEntrada,PainelMissao painelMissao){
		
		this.painelTelaEntrada=painelTelaEntrada;
		this.painelMissao=painelMissao;
		
		labelNome.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		labelNome.setForeground(Color.BLACK);
		labelNome.setBounds(570, 230, 150, 40);
		
		nomeField.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 25));
		nomeField.setBounds(660, 230, 150, 40);
		
		
		botao.setContentAreaFilled(false);
		botao.setHorizontalTextPosition(SwingConstants.CENTER);
		botao.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		botao.setForeground(Color.BLACK);
		botao.setBorderPainted(false);
		
		botao1.setContentAreaFilled(false);
		botao1.setHorizontalTextPosition(SwingConstants.CENTER);
		botao1.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		botao1.setForeground(Color.BLACK);
		botao1.setBorderPainted(false);
		
		botao2.setContentAreaFilled(false);
		botao2.setHorizontalTextPosition(SwingConstants.CENTER);
		botao2.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		botao2.setForeground(Color.BLACK);
		botao2.setBorderPainted(false);
		
		botao3.setContentAreaFilled(false);
		botao3.setHorizontalTextPosition(SwingConstants.CENTER);
		botao3.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		botao3.setForeground(Color.BLACK);
		botao3.setBorderPainted(false);
		
 
		opcaoRomano.setContentAreaFilled(false);
		opcaoRomano.setHorizontalTextPosition(SwingConstants.CENTER);
		opcaoRomano.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		opcaoRomano.setForeground(Color.white);
		opcaoRomano.setBorderPainted(false);
		
		opcaoNumero.setContentAreaFilled(false);
		opcaoNumero.setHorizontalTextPosition(SwingConstants.CENTER);
		opcaoNumero.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		opcaoNumero.setForeground(Color.white);
		opcaoNumero.setBorderPainted(false);
	
		botao.setBorder(BorderFactory.createEtchedBorder(1));
		botao1.setBorder(BorderFactory.createEtchedBorder(1));
		botao2.setBorder(BorderFactory.createEtchedBorder(1));
		botao3.setBorder(BorderFactory.createEtchedBorder(1));
		opcaoRomano.setBorder(BorderFactory.createEtchedBorder(1));
		opcaoNumero.setBorder(BorderFactory.createEtchedBorder(1));
		
		opcaoNumero.setVisible(false);
		opcaoRomano.setVisible(false);
		
		add(labelNome);
		add(nomeField);
		add(botao).setBounds(660,300,100, 50);
		add(botao1).setBounds(660,400, 100, 50);
		add(botao2).setBounds(650,500, 150, 50);
		add(botao3).setBounds(660,600, 100,50);
		add(opcaoRomano).setBounds(400, 350, 200, 100);
		add(opcaoNumero).setBounds(750,350 ,200, 100);
		
		
//		add(new PainelTelaEntrada());
		add(painelTelaEntrada);
		add(painelMissao);
		painelTelaEntrada.setVisible(true);
		setVisible(true);
	}
	
	public TelaAjuda getTelaAjuda() {
		return telaAjuda;
}


	public void setTelaAjuda(TelaAjuda telaAjuda) {
		this.telaAjuda = telaAjuda;
	}


	public TelaCreditos getTelaCreditos() {
		return telaCreditos;
	}


	public void setTelaCreditos(TelaCreditos telaCreditos) {
		this.telaCreditos = telaCreditos;
	}

	
		public JButton getBotao() {
		return botao;
	}


	public JButton getBotao1() {
		return botao1;
	}


	public JButton getBotao2() {
		return botao2;
	}


	public JButton getBotao3() {
		return botao3;
	}

	public static JTextField getNomeField() {
		return nomeField;
	}

	public static void setNomeField(JTextField nomeField) {
		TelaEntrada.nomeField = nomeField;
	}

	public PainelTelaEntrada getPainelTelaEntrada() {
		return painelTelaEntrada;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public PainelMissao getPainelMissao() {
		return painelMissao;
	}

	public void setPainelMissao(PainelMissao painelMissao) {
		this.painelMissao = painelMissao;
	}

	public JButton getOpcaoRomano() {
		return opcaoRomano;
	}

	public void setOpcaoRomano(JButton opcaoRomano) {
		this.opcaoRomano = opcaoRomano;
	}

	public JButton getOpcaoNumero() {
		return opcaoNumero;
	}

	public void setOpcaoNumero(JButton opcaoNumero) {
		this.opcaoNumero = opcaoNumero;
	}	
	
	
	
}
