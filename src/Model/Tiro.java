package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tiro extends Elemento{

	
	public BufferedImage imageTiro;
	double velocidade;
	private boolean tiroAtivo= false;
	
	
	public Tiro(){
		
		try {
			imageTiro = ImageIO.read(getClass().getClassLoader().getResourceAsStream("sprite_tiro.png"));
			setLargura(imageTiro.getWidth());
			setAltura(imageTiro.getHeight());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resetarTiro();
		
	}
	
//	
//	public Tiro(int x, int y, int altura, int largura) {
//		super(x, y, altura, largura);
//		
//		try {
//			imageTiro = ImageIO.read(getClass().getClassLoader().getResourceAsStream("sprite_tiro.png"));
//			setLargura(imageTiro.getWidth());
//			setAltura(imageTiro.getHeight());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		resetarTiro();
//	}
	
	public boolean colisao (Rectangle rec){
		if(rec.intersects(getRectangle()))
			return true;
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(imageTiro, getX(), getY(), null);
	}

	@Override
	public void tick() {
		velocidade += 0.01;
		
		setY((int) (getY()-velocidade));
	}
	
	
	public void resetarTiro(){
		setX(1000);
		setY(1000);
		tiroAtivo=false;
	}
	public void atirar(int x, int y){
		setX(x);
		setY(y);
		tiroAtivo=true;
	}
	
	
	public boolean istiroAtivo() {
		return tiroAtivo;
	}



	public void settiroAtivo(boolean estadoTiro) {
		this.tiroAtivo = estadoTiro;
	}
	
}
