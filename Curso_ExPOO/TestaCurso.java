package Curso_ExPOO;

import java.util.Scanner;

public class TestaCurso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Curso loja = new Curso("Cursinho Legal", "Ibirapuera", 567, "Venha conhecer!", 580000.00f);
		
		Curso loja2 = new Curso("ABC cursos", "Vila Madalena", 79, "O melhor curso do Brasil!", 356664.94f);
		
		Curso loja3 = new Curso();
		System.out.println("Digite a marca: ");
		loja3.setMarca(ler.nextLine());
		System.out.println("Digite a localidade: ");
		loja3.setLocal(ler.nextLine());
		System.out.println("Digite a quantidade de alunos da escola: ");
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
