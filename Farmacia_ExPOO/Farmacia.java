package Farmacia_ExPOO;

public class Farmacia {
	private String marca;
	private String local;
	private int clientes;
	private String slogan;
	private float saldo;

	// Métodos acessor da classe Farmacia
	public Farmacia(String marca, String local, int clientes, String slogan, float saldo) {
		this.marca = marca;
		this.local = local;
		this.clientes = clientes;
		this.slogan = slogan;
		this.saldo = saldo;
	}

	// Para aceitar os dados inseridos pelo usuário
	public Farmacia() {
    }

	public void visualizar() {
		System.out.println("----------------------\nDados da Farmácia: ");
		System.out.println("Nome da Farmácia: " + marca);
		System.out.println("Local da Farmácia: " + local);
		System.out.println("Média de clientes por mês: " + clientes);
		System.out.println("O slogan da Farmácia é: " + slogan);
		System.out.println("A média do lucro/mês da unidade é: R$" + saldo);
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void setAlunos(int clientes) {
		this.clientes = clientes;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

	public String getMarca() {
		return marca;
	}

	public String getLocal() {
		return local;
	}

	public String getSlogan() {
		return slogan;
	}

	public float getSaldo() {
		return saldo;
	}
}
