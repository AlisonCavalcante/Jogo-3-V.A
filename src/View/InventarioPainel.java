package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Model.Inimigos;
import Model.Jogador;
import Model.Jogo;
import Model.Missao;
import Model.Nave;

public class InventarioPainel  extends Jogo{

	JButton buttonMenu;
	public static int alter; 
	private static String romanoConversor1="";
	private static int resultromano1,resultroamano2,resultado;
	private Missao missao;
	private static  int scoreJogador;
	private static boolean acertou=false;
	Jogador jogador;
	public InventarioPainel(){
		
		buttonMenu = new JButton("MENU");
//		missao=new Missao();
		jogador=new Jogador();
		
		setBackground(Color.gray);
		setBounds(900, 0, 500, 700);
		setBorder(BorderFactory.createEtchedBorder(WIDTH));

		buttonMenu.setContentAreaFilled(false);
		buttonMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonMenu.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 20));
		buttonMenu.setForeground(Color.BLACK);
		buttonMenu.setBorderPainted(false);
		
		buttonMenu.setBounds(45, 600, 100, 50);
		buttonMenu.setVisible(true);
		
		add(buttonMenu);	
			
		
		
		setVisible(true);
	}
	


@Override
public void gameUpdate() {
	// TODO Auto-generated method stub
	
}

@Override
public void gameRender() {
	 // Informações do jogador 
	g.setColor(Color.LIGHT_GRAY);
	g.fillRect(0, 0, getWidth(), getHeight());
	
	 g.setColor(Color.black);
	 
	 g.setFont(new Font("Arial", Font.BOLD, 40));
	 g.drawString("Inventario", 150, 30);
	
	 g.setFont(new Font("Arial", Font.BOLD, 30)); 
	 g.drawString("Jogador:"+Jogador.getNome(),20 , 80);
	 g.drawString("Vida:", 20, 130);
	 g.setColor(Color.green);
	 g.fillRoundRect(100, 100, 200, 40, 20,20);
	 g.setColor(Color.black);
	 g.drawRoundRect(100, 100, 200, 40, 20,20);
	 g.drawRoundRect(99, 99, 201, 41, 20,20);
	 g.setColor(Color.BLACK);
	 
	 g.drawString("Pontos:"+scoreJogador,20 ,180 );
	 
	 g.drawString("Tipo da Missão: ", 20, 230);
	 g.drawString("Modalidade:", 20, 280);
	 //
	 
	 
	 // Conversor do inventário:
	 
	 g.setColor(Color.GRAY );
	 g.fillRoundRect(50, 290,400 , 100, 30,20);
	 
	 Pintaracerto(acertou);
	 Repintar();
	 g.setColor(Color.GRAY );
	 g.fillRoundRect(50, 290,400 , 100, 30,20);
	 g.setColor(Color.white);
	 g.drawRoundRect(50,290, 400, 100, 30, 20);
	 
	 g.setColor(Color.WHITE);
	 g.drawString("Missão:", 170, 320);
	 g.drawString(""+romanoConversor1, 100, 380);
	 g.drawString("-", 200, 380);
	 g.drawString(""+resultromano1, 135,380 );
	 g.drawString("?", 240, 380);
	 g.drawString("", 280,380 );
	 g.drawString("="+resultado,380 ,380 );
	//Placar 
	 
	 
	 
	 g.setColor(Color.GRAY );
	 g.fillRoundRect(50, 420,400 ,100 , 30,20);
	 
	 g.setColor(Color.white);
	 g.drawRoundRect(50, 420, 400, 100, 30, 20);
	 
	 g.setColor(Color.white);
	 g.drawString("Placar:", 190, 450);
	 g.drawString("Acertos:"+jogador.getAcertos(), 90, 500);
	 g.drawString("Erros:"+jogador.getErros(), 300,500 );
	 //
	
	 
	 g.setColor(Color.green);
	 g.fillRoundRect(45, 600, 100, 50, 45,45);
	 
	 
	 g.setColor(Color.black);
	 g.drawRoundRect(45, 600, 100, 50, 45,45);
	 g.drawRoundRect(44, 599, 101, 51, 45,45);
	
}
//public int resultadoConversor(){
//	int retorno;
//	retorno=resultromano1-resultroamano2;
//	
//	
//	return retorno;
//}

public void Pintaracerto(boolean acertou){
	if(acertou){
		g.setColor(Color.green);
		 g.fillRoundRect(50, 290,400 , 100, 30,20);
		 }acertou=false;
}
public void Repintar(){
	g.setColor(Color.gray);
	 g.fillRoundRect(50, 290,400 , 100, 30,20);
}

//public void atualizarPlacar(Jogador jogador){
//	g.drawString("Erros:"+jogador.getErros(), 100, 500);
//	 g.drawString("Acertos:"+jogador.getAcertos(), 280,500 );
//}


public static int getAlter() {
	return alter;
}



public static void setAlter(int alter) {
	InventarioPainel.alter = alter;
}



public static boolean isAcertou() {
	return acertou;
}



public static void setAcertou(boolean acertou) {
	InventarioPainel.acertou = acertou;
}



public static String getRomanoConversor1() {
	return romanoConversor1;
}



public static void setRomanoConversor1(String romanoConversor1) {
	InventarioPainel.romanoConversor1 = romanoConversor1;
}







@Override
public void init() {
	// TODO Auto-generated method stub
	
}



public static int getResultromano1() {
	return resultromano1;
}



public static void setResultromano1(int resultromano1) {
	InventarioPainel.resultromano1 = resultromano1;
}



public static int getResultroamano2() {
	return resultroamano2;
	
	
}



public static void setResultroamano2(int resultroamano2) {
	InventarioPainel.resultroamano2 = resultroamano2;
}



public static int getScoreJogador() {
	return scoreJogador;
}



public static void setScoreJogador(int scoreJogador) {
	InventarioPainel.scoreJogador+= scoreJogador;
}



public static int getResultado() {
	return resultado;
}



public static void setResultado(int resultado) {
	InventarioPainel.resultado = resultado;
}	
 



}
