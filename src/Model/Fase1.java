package Model;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Controler.Controller;
import View.InventarioPainel;
import View.TelaEntrada;




public class Fase1 extends Jogo {
	private Nave nave;
	JPanel panel;
	BufferedImage fundo;
	public Inimigos inimigos;
    public Jogador jogador;
    public int scorePassado;
    Missao m;
    public InventarioPainel inventarioPainel;
	
	public Fase1() {
		super();
		
		try {
			fundo = ImageIO.read(getClass().getClassLoader().getResourceAsStream("fundoEspaçoNovo.jpg"));
		} catch (IOException e) {
			System.out.println("Imagem não encontrada!! ");
			e.printStackTrace();
		}
		jogador = new Jogador();
		m = new Missao();
		inventarioPainel = new InventarioPainel();
	}

	@Override
	public void gameUpdate() {
		
		nave.tick();
		inimigos.tick();
		//Checando as colisões
		if(inimigos.colisaoInimigos(nave)){
			if(m.checarMissao()){
				inventarioPainel.setAcertou(true);
				JOptionPane.showMessageDialog(null, "Acertou!!");
				m.GerarMissao();
				inventarioPainel.setScoreJogador(10);
				jogador.setAcertos(1);
			}else
				inventarioPainel.setScoreJogador(-5);
				jogador.setErros(1);
				
		}
	}

	@Override
	public void gameRender() {
		g.drawImage(fundo, getX(), getY(), null);
		nave.draw(g);
		inimigos.draw(g);	
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		nave= new Nave(0, 557, 100, 168);
		addKeyListener(new Controller(nave));
		inimigos = new Inimigos(50, 50, 50, 50);
		m.GerarMissao();
		inimigos.setM(m);
		
	}

	public void setarAtributosJogador(){
		
		if(inimigos.colisaoInimigos(nave)==true){
			
		InventarioPainel.setScoreJogador(10);
		}
		
		
	}
	
	public Nave getNave() {
		return nave;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}


	
	
	
	
}
