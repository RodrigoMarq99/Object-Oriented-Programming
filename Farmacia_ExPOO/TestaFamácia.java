package Farmacia_ExPOO;

import java.util.Scanner;

public class TestaFamácia {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		Farmacia loja = new Farmacia("Drogaria Paulinho", "Santos", 1200, "Todas as necessidades atendidas!", 58000.00f);
		
		Farmacia loja2 = new Farmacia("ABC Remédios", "Ana Rosa", 789, "Os melhores remédios do Brasil!", 356664.94f);
		
		Farmacia loja3 = new Farmacia();
		System.out.println("Digite a marca: ");
		loja3.setMarca(ler.nextLine());
		System.out.println("Digite a localidade: ");
		loja3.setLocal(ler.nextLine());
		System.out.println("Digite a quantidade de clientes em média por mês: ");
		loja3.setAlunos(ler.nextInt());
		ler.nextLine(); // Consumir a nova linha pendente após nextInt()
		System.out.println("Digite o slogan da marca: ");
		loja3.setSlogan(ler.nextLine());
		System.out.println("Digite o saldo da unidade: ");
		loja3.setSaldo(ler.nextFloat());
		
		loja.visualizar();
		loja2.visualizar();
		loja3.visualizar();

		ler.close();
	}

}
