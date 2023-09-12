package Curso_ExPOO;

public class Curso {
	private String marca;
	private String local;
	private int alunos;
	private String slogan;
	private float saldo;
	
	// Métodos acessor da classe Curso
	public Curso(String marca, String local, int alunos, String slogan, float saldo) {
		this.marca = marca;
		this.local = local;
		this.alunos = alunos;
		this.slogan = slogan;
		this.saldo = saldo;
	}
	// Para aceitar os dados inseridos pelo usuário
	public Curso() {
    }
	
	public void visualizar() {
		System.out.println("----------------------\nDados do Curso: ");
		System.out.println("Nome da Marca: " + marca);
		System.out.println("Local: " + local);
		System.out.println("Quantidade de Alunos: " + alunos);
		System.out.println("O slogan da marca é: " + slogan);
		System.out.println("O lucro/mês do curso é: R$" + saldo);
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getMarca() {
		return marca;
	}
	public String getLocal() {
		return local;
	}
	public int getAlunos() {
		return alunos;
	}
	public String getSlogan() {
		return slogan;
	}
	public float getSaldo() {
		return saldo;
	}
}
