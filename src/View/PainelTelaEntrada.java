package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelTelaEntrada extends JPanel {

	BufferedImage imagemTelaEntrada;
	Graphics2D g;
	public PainelTelaEntrada(){
		imagemTelaEntrada= new BufferedImage(900, 700, BufferedImage.TYPE_INT_RGB);
		g=(Graphics2D)imagemTelaEntrada.getGraphics();
		try {
			imagemTelaEntrada = ImageIO.read(getClass().getClassLoader().getResourceAsStream("telaOriginal.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBackground(Color.orange);

		setSize(1400, 700);
		setVisible(false);
	}

	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		g.setColor(new Color( 187, 190, 20 ));
		g.fillRoundRect(2,2, 1350, 650, 50,50);
		
		
		g.drawImage(imagemTelaEntrada, getX(), getY(), null);
		
		
//		g.setColor(Color.white);
//		g.fillRect(550, 200,300, 450);
//		
//		
//		
//		g.setColor(Color.darkGray);
//		g.drawRect(550, 200,298, 450);
//		g.drawRect(551, 199,297, 451);
		
		
		g.setColor(Color.green);
		g.fillRoundRect(655, 300,111, 47, 40, 40);
		g.fillRoundRect(655, 400,111, 47, 40, 40);
		g.fillRoundRect(655, 500,140, 47, 40, 40);
		
		
		g.setColor(Color.RED);
		g.fillRoundRect(655, 600,111, 43, 40, 40);
		
		
		g.setColor(Color.BLACK);
		g.drawRoundRect(655, 300,111, 47, 40, 40);
		g.drawRoundRect(656, 300,111, 47, 40, 40);
		g.drawRoundRect(655, 400,111, 47, 40, 40);
		g.drawRoundRect(656, 400,111, 47, 40, 40);
		g.drawRoundRect(655, 500,140, 47, 40, 40);
		g.drawRoundRect(656, 500,140, 47, 40, 40);
		g.drawRoundRect(655, 600,111, 43, 40, 40);
		g.drawRoundRect(656, 600,111, 43, 40, 40);
		
//		g.setColor(Color.red); 
//		for (int i = 0; i < 100; i += 3) 
//		g.drawOval(100, 100, i, i); 
		} 
	
	
}
