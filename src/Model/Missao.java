package Model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import View.InventarioPainel;

public class Missao {

	private static int resulTadoFinal;
	private int resultTemporario, resultTemporario2;
	private static int cont=1;
	private static int alter=0;
	private Random random;
	private int indiceInimigo=0;
	private static boolean acertou=false; 
	
	public Missao(){
	
		random = new Random();
	}


	
//	public ArrayList<Integer> gerarMissao(){
//	
//		ArrayList<Integer> temp = new ArrayList<Integer>();
//		
//		Random random = new Random();
//		Random random2 = new Random();
//		
//		int i;
//		int j;
//		
//		i  = random.nextInt(4)+1;
//		j = random2.nextInt(4)+1;
//		
//		for()
//		
//		
//		
//		return temp;
//	}
	
	

	
	public boolean adicao(int temp) {
		
		if(cont!=2){
		if(temp==resulTadoFinal ){
			JOptionPane.showMessageDialog(null, "ACERTOU!!"+temp);
			return true;
			}
		}
		this.resultTemporario += temp;
		
		if(cont == 2){
			 
			if(this.resultTemporario == resulTadoFinal){
				JOptionPane.showMessageDialog(null, "ACERTOU!!"+resultTemporario);
				return true;
			}else
			this.resultTemporario=0;
			cont =0;
		
		}
		cont++;
		System.out.println(this.resultTemporario);
		System.out.println(cont);
		return false;
		
	}
	
	public boolean subtracao(int temp) {
		
//		if(InventarioPainel.getResultromano1()-temp==InventarioPainel.getResultado()){
//			return true;
//		}
		if(cont!=2){
		if(temp==resulTadoFinal ){
			JOptionPane.showMessageDialog(null, "ACERTOU!!"+temp);
			
			temp = 0;
			return true;
			}
		this.resultTemporario += temp;
		temp=0;
		}
		
		
		if(cont == 2){
			 this.resultTemporario-=temp;
			if(this.resultTemporario == resulTadoFinal){
				JOptionPane.showMessageDialog(null, "ACERTOU!!"+resultTemporario);
				return true;
			}
			this.resultTemporario=0;
			cont =0;
		
		}
		cont++;
		
		return false;
		
//	return false;	
}
	public void resgatarIndice(int indiceInimigo){
		this.indiceInimigo=indiceInimigo;
		
	}
	
	
	public void GerarMissao(){
		int aleatorio1 = random.nextInt(10)+1;
		int result =random.nextInt(10)+1;
		
		resultTemporario=aleatorio1;
		resultTemporario2=result;
		if(result<aleatorio1 && result!=0 && aleatorio1!=0){
			InventarioPainel.setResultromano1(aleatorio1);
			InventarioPainel.setResultado(result);;		
		}else if(result>aleatorio1 && result!=0 && aleatorio1!=0){ 
			InventarioPainel.setResultromano1(result);
			InventarioPainel.setResultado(aleatorio1);
		}
		
	}
	
	public boolean checarMissao(){
		if(resultTemporario-indiceInimigo ==resultTemporario2){
			return true;
		}if(resultTemporario2-indiceInimigo==resultTemporario){
			return true;
		}
		
		return false;
	}
	
	
	public int getResultTemporario() {
		return resultTemporario;
	}
	

	public static int getAlter() {
		return alter;
	}

	public static void setAlter(int alter) {
		Missao.alter = alter;
	}

	public static int getResulTadoFinal() {
		return resulTadoFinal;
	}

	public static void setResulTadoFinal(int resulTadoFinal) {
		Missao.resulTadoFinal = resulTadoFinal;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Missao.cont = cont;
	}

	public static boolean isAcertou() {
		return acertou;
	}

	public static void setAcertou(boolean acertou) {
		Missao.acertou = acertou;
	}

	
	
}
