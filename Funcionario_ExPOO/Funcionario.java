package Funcionario_ExPOO;

public class Funcionario {

	private String nome;
	private String localNascimento;
	private String sexo;
	private int idade;
	private String cargo;
	
	public void visualizar() {
		System.out.println("----------------------\nDados do(a) Funcionário: ");
		System.out.println("Nome: " + nome);
		System.out.println("Local de Nascimento: " + localNascimento);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Cargo: " + cargo);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}