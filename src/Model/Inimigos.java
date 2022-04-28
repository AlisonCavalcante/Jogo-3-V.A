package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import View.InventarioPainel;



public class Inimigos extends Elemento {

	private ArrayList<Inimigo> inimigos;
	Random random;
	private Missao m;
	ArrayList<Missao> mteste;
	public boolean iscerto = false;
	private int ordemConversor=1;
	Jogador jogador;
	
	public Inimigos(int x, int y, int altura, int largura) {
		super(x, y, altura, largura);
	
		random = new Random();
		inicializaInimigos();
		
	}
	 public Inimigos() {
		
	}

	@Override
	public void draw(Graphics g) {
		
		for(Inimigo inimigo : inimigos){
			inimigo.draw(g);
			inimigo.tick();
		}
		
	}

	
	
	public void setM(Missao m, int valor1, int valor2) {
		this.m = m;
	
	}
	

	public void inicializaInimigos(){
		inimigos = new ArrayList<Inimigo>();
		
		for(int i=0; i<20;i++){
			int ran = random.nextInt(10)+1;
			inimigos.add(new Inimigo(random.nextInt(550)+100, random.nextInt(3500)*-1, 50, 50,ran));
			
		}
		
		
	}
	
//   public void inicializaMissao(){
//	   mteste = new ArrayList<Missao>();
//	   Random random = new Random();
//	      
//	      for(int j=0;j<5;j++){
//			   int i = random.nextInt(2);
//			   System.out.println(i);
//				  setM(m, i, i);
//				 System.out.println("entrou");
//				 break;
//			   
//		   }
//	   
//	   
//   }

	
	
	@Override
	public void tick() {
		
		
		}
			
	public boolean colisaoInimigos(Nave nave){
		
		for(Inimigo inimigo : inimigos){
			if(nave.colisao(inimigo.getRectangle())){	
				inimigo.setX(1000);
				inimigo.setY(1000);
				InventarioPainel.setResultroamano2(inimigo.getIndeciInimigo());
				m.resgatarIndice(inimigo.getIndeciInimigo());
				
				return true;
			}
		}
		return false;
	}	
	
	public Missao getM() {
		return m;
	}
	public void setM(Missao m) {
		this.m = m;
	}
	public ArrayList<Inimigo> getInimigos() {
		return inimigos;
	}
	public void setInimigos(ArrayList<Inimigo> inimigos) {
		this.inimigos = inimigos;
	}		

	
	
}
