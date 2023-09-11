package Cliente_ExPOO;

public class Cliente {

	private String nome;
	private String sexo;
	private int idade;
	private String tipoDeConta;
	private float saldo;

	// métodos acessores da classe Cliente
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void visualizar() {
		System.out.println("----------------------\nDados do(a) Cliente: ");
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Tipo da conta: " + tipoDeConta);
		System.out.println("Saldo: R$" + saldo);
		
	}
}