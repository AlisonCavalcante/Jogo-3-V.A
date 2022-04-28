package Model;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Elemento {

	private int x, y;
	private int altura, largura;

	public Elemento(int x, int y, int altura, int largura) {
		super();
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
	}

	public Elemento(){
		
	}
	
	public Elemento(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract void draw(Graphics g);

	public abstract void tick();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public Rectangle getRectangle() {
		return new Rectangle(getX(), getY(), getLargura(), getAltura());
	}

}
