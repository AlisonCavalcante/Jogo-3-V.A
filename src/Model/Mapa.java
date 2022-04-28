package Model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

public class Mapa {

	private final int numeroColunas= 25;
	private final int numeroLinhas= 35;
	private final int colunasTileSet=16;
	private final int tileSize=32;
	
	private int camada [][];
	private int mapaLargura = numeroColunas*tileSize;
	private int mapaAltura = numeroLinhas *tileSize;
	
	private BufferedImage tileSet;
	private BufferedImage mapa = new BufferedImage(mapaAltura, mapaLargura, BufferedImage.TYPE_4BYTE_ABGR);
	
	
private Graphics2D db = mapa.createGraphics();
	
	
	public Mapa (String nomeTileset,String nomeMapaMatriz){
		
		try {
			tileSet = ImageIO.read(getClass().getClassLoader().getResourceAsStream(nomeTileset));
		} catch (IOException e) {
			System.out.println("Não conseguir carregar o tile");
			e.printStackTrace();
		}
		
		camada=carregarMatriz(nomeMapaMatriz);
	}
	
	public void montarMapa (){
		mapa.createGraphics();
		
		int tile;
		int tileRow;
		int tileCol;
		
		for(int i = 0; i< numeroLinhas;i++){
		   for(int j=0; j<numeroColunas;j++){
			   tile = (camada[i][j]); // se não tiver igual o arquivo gerado ao lido tirar o -1
			   tileRow =( tile/ colunasTileSet) | 0;
			   tileCol =(tile%colunasTileSet)|0;
			   db.drawImage(tileSet,(j*tileSize),(i*tileSize),(j*tileSize)+tileSize,
					   (i*tileSize)+tileSize,(tileCol * tileSize),(tileRow * tileSize),
					   (tileCol * tileSize)+tileSize,(tileRow * tileSize)+tileSize,null);
		   }	
			
		}
		
	}
	
	public int[][] carregarMatriz (String nomeMapa){
		int [][] mat = new int [numeroLinhas][numeroColunas];
			
		InputStream input = getClass().getClassLoader().getResourceAsStream(nomeMapa);
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		
		ArrayList<String> linhas = new ArrayList<>();
		
		String linha="";
		
		try {
			while((linha=br.readLine())!= null)
			
			linhas.add(linha);	
			
			int coluna=0;
			for (int i =0; i<linhas.size();i++){
				StringTokenizer token = new StringTokenizer(linhas.get(i), ",");
				
				while(token.hasMoreElements()){
					mat[i][coluna] = Integer.parseInt(token.nextToken());
					coluna++;
				}
				coluna=0;
			}	
				
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Não carregou a Matriz!!");
			e.printStackTrace();
		}
		
		return mat;
	}
	
	
	
	
	
	
}
