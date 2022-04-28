package Model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.frequal.romannumerals.Converter;

public class Inimigo extends Elemento{


	
	double velocidade;
	static BufferedImage imageInimigo;
	private int indeciInimigo;
	private static int tipodeInimigo=0;
	
	static {
		try {
			imageInimigo = ImageIO.read(Inimigo.class.getClassLoader().getResourceAsStream("asteroide.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public Inimigo(int x, int y, int altura, int largura) {
		super(x, y, altura, largura);
	
		
		
	}
	public Inimigo(int x, int y, int altura, int largura, int indiceInimigo) {
		super(x, y, altura, largura);
		
		this.indeciInimigo = indiceInimigo;	
	
		
	}	
	
	
	

	@Override
	public void draw(Graphics g) {

		g.drawImage(imageInimigo, getX(), getY(), null);
		g.setFont(new Font("Serif", Font.BOLD, 24));
		if(tipodeInimigo==0){
		g.drawString(""+conversoRomano(), getX()+34, getY()+50);
		}else if(tipodeInimigo==1){
			g.drawString(""+indeciInimigo, getX()+34, getY()+50);
		}
	}

	@Override
	public void tick() {
		velocidade += 0.01;
		setY((int) (getY()+velocidade));

	}

	

	
	public String conversoRomano(){
		
		String retorn;
		
		Converter rom = new Converter();
		
		retorn =rom.toRomanNumerals(indeciInimigo);
		
	
		
		
		
		return retorn;
	}
	
	
	public boolean estadoInimigo(){
		
		
		
		return false;
	}
	
	public int getIndeciInimigo() {
		return indeciInimigo;
	}
	public void setIndeciInimigo(int indeciInimigo) {
		this.indeciInimigo = indeciInimigo;
	}
	public static int getTipodeInimigo() {
		return tipodeInimigo;
	}
	public static void setTipodeInimigo(int tipodeInimigo) {
		Inimigo.tipodeInimigo = tipodeInimigo;
	}
	
	
	
}
