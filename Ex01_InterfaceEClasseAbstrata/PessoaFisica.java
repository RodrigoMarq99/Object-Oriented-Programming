package Ex01_InterfaceEClasseAbstrata;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String local;
	
	public PessoaFisica(String nome, String sexo, int idade, String tipoDeConta, float saldo, String cpf,
			String local) {
		super(nome, sexo, idade, tipoDeConta, saldo);
		this.cpf = cpf;
		this.local = local;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("----------------------\nDados do(a) Cliente");
		System.out.println("Nome: " + getNome());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Idade: " + getIdade());
		System.out.println("Tipo da conta: " + getTipoDeConta());
		System.out.println("Saldo: R$" + getSaldo());
		System.out.println("Esta pessoa física tem o CPF número: " + cpf);
		System.out.println("Esta pessoa física tem sua agência matriz em: " + local);
	}
}
