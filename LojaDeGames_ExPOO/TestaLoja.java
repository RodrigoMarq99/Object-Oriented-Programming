package LojaDeGames_ExPOO;

public class TestaLoja {

	public static void main(String[] args) {
		
		lojaDeGames loja = new lojaDeGames("System Games", "Diadema", 5, "Jorge", 200.34f);
		loja.visualizar();
		
		lojaDeGames loja2 = new lojaDeGames("Aninha Jogos", "Vila Mariana", 7, "Ana da Silva", 3230.94f);
		loja2.visualizar();
		
	}
}