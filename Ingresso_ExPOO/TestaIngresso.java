package Ingresso_ExPOO;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso();
		ingresso.setTotalDisponivel(5000);
		ingresso.setPreco(70.50f);
		ingresso.setQuantidadeVendido(3056);
		ingresso.setNomeDoLocal("Jabaquara");
		ingresso.setNomeDoCantor("Anderson do Samba");
		
		Ingresso ingresso2 = new Ingresso();
		ingresso2.setTotalDisponivel(200);
		ingresso2.setPreco(2500.00f);
		ingresso2.setQuantidadeVendido(199);
		ingresso2.setNomeDoLocal("Leblon");
		ingresso2.setNomeDoCantor("Senhora do Piano");
		
		
		ingresso.visualizar();
		ingresso2.visualizar();

	}

}
