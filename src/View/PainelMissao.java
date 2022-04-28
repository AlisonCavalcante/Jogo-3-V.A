package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

import Model.Jogo;

public class PainelMissao extends JPanel{

	BufferedImage imagemTelaEntrada;
	Graphics2D g;
	public PainelMissao() {
		super();
		
		imagemTelaEntrada= new BufferedImage(900, 700, BufferedImage.TYPE_INT_RGB);
		g=(Graphics2D)imagemTelaEntrada.getGraphics();
		try {
			imagemTelaEntrada = ImageIO.read(getClass().getClassLoader().getResourceAsStream("telaOriginal.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setLayout(null);
		
		setBounds(0, 0, 1400, 700);
		
	
		
		setVisible(false);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagemTelaEntrada, getX(), getY(), null);
		g.setColor(Color.gray);
		g.fillRoundRect(400,200, 560, 300, 50, 50);
		g.setColor(Color.white);
		g.drawRoundRect(400, 200, 560, 300, 50, 50);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("ESCOLHA A MODALIDADE", 480, 250);
	}
	
	
}
