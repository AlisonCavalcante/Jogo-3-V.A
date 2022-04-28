package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;




import Model.Fase1;
import Model.Inimigo;
import Model.Inimigos;
import Model.Jogador;
import Model.Mapa;
import Model.Missao;
import Model.Nave;
import View.InventarioPainel;
import View.TelaAjuda;
import View.TelaCreditos;
import View.TelaEntrada;
import View.Telageral;

public class Controller implements ActionListener, KeyListener {

	TelaEntrada telaEntrada;
	Mapa mapa;
	Nave nave;
	InventarioPainel painelInventario;
	Fase1 fase1;
	TelaAjuda telaAjuda;
	TelaCreditos telaCreditos;
	Jogador jogador;
	
	public Controller(TelaEntrada telaEntrada, InventarioPainel painelinventario, Fase1 faseUm,TelaAjuda telajuda,TelaCreditos telacredito) {
		super();
		this.telaEntrada = telaEntrada;
		this.telaEntrada.getBotao().addActionListener(this);
		this.telaEntrada.getBotao1().addActionListener(this);
		this.telaEntrada.getBotao2().addActionListener(this);
		this.telaEntrada.getBotao3().addActionListener(this);
		this.telaEntrada.getOpcaoRomano().addActionListener(this);
		this.telaEntrada.getOpcaoNumero().addActionListener(this);
		
		painelInventario = painelinventario;
		fase1 = faseUm;
		telaAjuda = telajuda;
		telaCreditos = telacredito;

		
		telaEntrada.setVisible(true);
	}

	public  Controller(Nave nave) {
		this.nave=nave;
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == telaEntrada.getBotao()){
			if(telaEntrada.getNomeField().getText().length()==0){
			JOptionPane.showMessageDialog(null, "Por favor ensira seu nome!!");
		}else if(telaEntrada.getNomeField().getText().length()!=0){
			ConfigurarModalidade();
		}}
		if(e.getSource() == telaEntrada.getBotao1()){
			telaEntrada.setVisible(false);
			telaAjuda.setVisible(true);
			telaAjuda.getVoltar().addActionListener(this);
		}	
			if(e.getSource() ==telaAjuda.getVoltar()){
				telaAjuda.setVisible(false);
				telaEntrada.setVisible(true);
			}
		
		if(e.getSource() == telaEntrada.getBotao2()){
			telaEntrada.setVisible(false);
			telaCreditos.setVisible(true);
			telaCreditos.getVoltar().addActionListener(this);
		}
		if(e.getSource() == telaCreditos.getVoltar()){
			telaCreditos.setVisible(false);
			telaEntrada.setVisible(true);
		}
		
		if(e.getSource()== telaEntrada.getBotao3()){
			System.exit(0);
			}
			
		
		if(e.getSource()==telaEntrada.getOpcaoRomano()){
			Inimigo.setTipodeInimigo(0);
			Telageral telageral= new Telageral();
			telageral.setLayout(null);
			JPanel panelGeral = new JPanel();

			panelGeral.setLayout(null);
			painelInventario.setLayout(null);
			
			jogador.setNome(telaEntrada.getNomeField().getText());
			
			fase1.setBounds(0, 0, 900, 700);
			panelGeral.add(fase1);
			telageral.setVisible(true);
			telageral.add(fase1);
			telageral.add(painelInventario);
			telaEntrada.dispose();	
			fase1.setVisible(true);
		}
		
		if(e.getSource()==telaEntrada.getOpcaoNumero()){
			Inimigo.setTipodeInimigo(1);
			System.out.println("ta entrando");
			Telageral telageral= new Telageral();
			telageral.setLayout(null);
			JPanel panelGeral = new JPanel();

			panelGeral.setLayout(null);
			painelInventario.setLayout(null);
			
			jogador.setNome(telaEntrada.getNomeField().getText());
			
			fase1.setBounds(0, 0, 900, 700);
			panelGeral.add(fase1);
			telageral.setVisible(true);
			telageral.add(fase1);
			telageral.add(painelInventario);
			telaEntrada.dispose();	
			fase1.setVisible(true);
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void ConfigurarModalidade(){
		telaEntrada.getPainelTelaEntrada().setVisible(false);
		telaEntrada.getBotao().setVisible(false);
		telaEntrada.getBotao1().setVisible(false);
		telaEntrada.getBotao2().setVisible(false);
		telaEntrada.getBotao3().setVisible(false);
		telaEntrada.getLabelNome().setVisible(false);
		telaEntrada.getNomeField().setVisible(false);
		telaEntrada.getPainelMissao().setVisible(true);
		telaEntrada.getOpcaoNumero().setVisible(true);
		telaEntrada.getOpcaoRomano().setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int tecla = e.getKeyCode();
		switch(tecla){
		case KeyEvent.VK_LEFT:
			if(nave.getX() > 10)
				nave.setX(nave.getX()-10);

			break;
			
		case KeyEvent.VK_RIGHT:
			if(nave.getX() < 790)
				nave.setX(nave.getX()+10);
						
			break;
		case KeyEvent.VK_SPACE:	
			nave.atirar();
			
			break;
			
		case KeyEvent.VK_UP:
			if(nave.getY() > -13)
				nave.setY(nave.getY()-10);
	
			break;
				
		case KeyEvent.VK_DOWN:
			System.out.println(nave.getY());
			if(nave.getY() < 547)
			nave.setY(nave.getY()+10);
			
			break;
			
		default:
			break;
		}
			
	}

}
