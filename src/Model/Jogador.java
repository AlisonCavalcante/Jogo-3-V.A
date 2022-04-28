package Model;

public class Jogador {

	private static String nome;
	private  int score;
	private int life;
	private static int erros, acertos;
	
	public Jogador(String nome) {
		this.nome = nome;
		
		
	}

	public Jogador(){
		
	}
	
	public Jogador(int score){
		this.score=score;
	}

	public static String getNome() {
		return nome;
	}



	public static void setNome(String nome) {
		Jogador.nome = nome;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score += score;
	}



	public static int getAcertos() {
		return acertos;
	}



	public static void setAcertos(int acertos) {
		Jogador.acertos += acertos;
	}



	public static int getErros() {
		return erros;
	}



	public static void setErros(int erros) {
		Jogador.erros += erros;
	}



	
	
	
	
}
