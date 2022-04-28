package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Nave extends Elemento implements KeyListener {

	public BufferedImage imagem;
	Tiro tiro;
	ArrayList<Tiro> tiros;
	
	public Nave(int x, int y, int altura, int largura) {
		super(x, y, altura, largura);
		
		try {
			imagem = ImageIO.read(getClass().getClassLoader().getResourceAsStream("naveSprite.png"));
			setLargura(imagem.getWidth());
			setAltura(imagem.getHeight());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tiros = new ArrayList<Tiro>();
		tiros.add(new Tiro());
		tiros.add(new Tiro());
		tiros.add(new Tiro());
		tiros.add(new Tiro());
		tiros.add(new Tiro());
		
		
//		tiro = new Tiro();
	}

	
	
	public Nave(int x, int y, String nomeImagem){
		super(x,y);

		
	}
	
	
	public Nave(){
		
	}



	@Override
	public void keyPressed(KeyEvent event) {

	
	}	
	



	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void draw(Graphics g) {
	
		g.drawImage(imagem,getX(), getY(), null);
		
		for(Tiro t:tiros){
			if(t.istiroAtivo()){
			t.draw(g);
			}
		}

	}

	public void atirar(){
		
		for(Tiro t: tiros){
			if(t.istiroAtivo()== false){
				t.atirar(getX()+getLargura()/4, getY());
				break;
			}
		}
		
	}

	
	@Override
	public void tick() {
		
		for(Tiro t : tiros){
			if(t.istiroAtivo()){
				t.tick();
			}
		}
	}
	
	
	public boolean colisao(Rectangle rec){
		
		for(Tiro t: tiros){
			if(t.istiroAtivo()){
				if(t.colisao(rec)){
					t.resetarTiro();
				return true;
				}
			}
		}
				
		return false;
	}

	
	
	
}


