package Funcionario_ExPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Recebe a classe e cria um objeto
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carlos");
		funcionario.setLocalNascimento("Bahia");
		funcionario.setIdade(30);
		funcionario.setSexo("Masculino");
		funcionario.setCargo("Montador");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Clarissa");
		funcionario2.setLocalNascimento("São Paulo");
		funcionario2.setIdade(23);
		funcionario2.setSexo("Feminino");
		funcionario2.setCargo("Engenheira");
		
		//Imprime os dados do objeto
		funcionario.visualizar();
		funcionario2.visualizar();

	}
}