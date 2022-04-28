package Model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Jogo extends JPanel implements Runnable{

	private boolean loop = true;
	public final int largura=900;
	public final int altura=700;
	BufferedImage image;
	protected Graphics2D g;
	Thread thread;
	
	
	 public Jogo() {
		
		setSize(largura,altura);
		setLayout(null);		 
		requestFocus();
	}
	 public void addNotify() {
		 super.addNotify();
		 if(thread==null){
			 thread= new Thread(this);
			 thread.start();
		 }
		 
	 }
	@Override
	public void run() {
		init();
		requestFocus();
		
		image= new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
		g=(Graphics2D)image.getGraphics();
		
		while(loop){
			
			try {
				
				
				gameDraw();
				gameRender();
				gameUpdate();
				Thread.sleep(50);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
		
	}

	public abstract void gameUpdate();
	public abstract void gameRender();
	public abstract void init();
	private void gameDraw() {
		Graphics2D g2 = (Graphics2D) this.getGraphics();
		g2.drawImage(image, 0,0,null);
		g2.dispose();
	}
	
}
