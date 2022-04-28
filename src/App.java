


import Controler.Controller;
import Model.Fase1;
import Model.Inimigo;
import Model.Jogador;
import Model.Nave;
import View.Carregar;
import View.InventarioPainel;
import View.PainelMissao;
import View.PainelTelaEntrada;
import View.TelaAjuda;
import View.TelaCreditos;
import View.TelaEntrada;
import View.Telageral;


public class App {

	public static void main(String[] args) {
		
		Carregar g=new Carregar();
		TelaAjuda telaajuda = new TelaAjuda();
		g.getProgresso().setValue(10);
		TelaCreditos telacreditos = new TelaCreditos();
		g.getProgresso().setValue(40);
		Fase1 fase1 =new Fase1();
		g.getProgresso().setValue(70);
		InventarioPainel inventarioPainel = new InventarioPainel();
		g.getProgresso().setValue(90);
		PainelTelaEntrada painelTelaEntrada = new PainelTelaEntrada();
		PainelMissao painelMissao = new PainelMissao();
		TelaEntrada telaEntrada = new TelaEntrada(painelTelaEntrada,painelMissao);
		g.getProgresso().setValue(100);
		Jogador jogadoR = new Jogador();
		Controller control = new Controller(telaEntrada, inventarioPainel, fase1,telaajuda,telacreditos);
		g.dispose();
	}

}
