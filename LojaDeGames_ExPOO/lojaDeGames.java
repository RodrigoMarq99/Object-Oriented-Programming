package LojaDeGames_ExPOO;

public class lojaDeGames {
	private String nome;
	private String local;
	private int abertura;
	private String proprietario;
	private float saldo;

	// métodos acessor da classe LojaDeGames
	public lojaDeGames(String nome, String local, int abertura, String proprietario, float saldo) {
		this.nome = nome;
		this.local = local;
		this.abertura = abertura;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}

	public void visualizar() {
		System.out.println("----------------------\nDados da Loja de Games: ");
		System.out.println("Nome: " + nome);
		System.out.println("Local: " + local);
		System.out.println("Abre às " + abertura + " horas.");
		System.out.println("O proprietário é: " + proprietario);
		System.out.println("Saldo da Loja: R$" + saldo);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getAbertura() {
		return abertura;
	}

	public void setAbertura(int abertura) {
		this.abertura = abertura;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}