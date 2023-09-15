package Ex02_InterfaceEClasseAbstrata;

public class Vendedor extends FuncionarioAbstrato{
	
	private String nome;
	private String localNascimento;
	private String sexo;
	private int idade;
	private String cpf;
	private float vendasNoMes;
	private int comissao;
	
	public Vendedor(String nome, String localNascimento, String sexo, int idade, String cpf, float vendasNoMes, int comissao) {
		this.nome = nome;
        this.localNascimento = localNascimento;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
		this.vendasNoMes = vendasNoMes;
		this.comissao = comissao;
		}
	
	@Override
	public void visualizar() {
		System.out.println("\n----------------------");
		System.out.println("ESTA PESSOA É VENDEDORA!");
		System.out.println("----------------------");
		System.out.println("O lucro obtido das vendas dela no mês atual é R$" + vendasNoMes + ".");
		System.out.println("Esta pessoa recebe " + comissao + "% de comissão.");
		System.out.println("* * * Informações Adicionais do Funcionário * * *");
		System.out.println("Nome: " + nome);
		System.out.println("Local de Nascimento: " + localNascimento);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("O CPF: " + cpf);
	}

	public float getVendasNoMes() {
		return vendasNoMes;
	}

	public void setVendasNoMes(float vendasNoMes) {
		this.vendasNoMes = vendasNoMes;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
