package Ex02_InterfaceEClasseAbstrata;

public class Gerente extends FuncionarioAbstrato{
	
	private String nome;
	private String localNascimento;
	private String sexo;
	private int idade;
	private String cpf;
	private float salario;
	private int tempoDeCasa;
	
	public Gerente(String nome, String localNascimento, String sexo, int idade, String cpf, float salario, int tempoDeCasa) {
		this.nome = nome;
        this.localNascimento = localNascimento;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.tempoDeCasa = tempoDeCasa;
		}
	
	@Override
	public void visualizar() {
		System.out.println("\n----------------------");
		System.out.println("ESTA PESSOA É GERENTE!");
		System.out.println("----------------------");
		System.out.println("O salário dele é R$" + salario + ".");
		System.out.println("Esta pessoa está na empresa há " + tempoDeCasa + " meses.");
		System.out.println("* * * Informações Adicionais do Funcionário * * *");
		System.out.println("Nome: " + nome);
		System.out.println("Local de Nascimento: " + localNascimento);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("O CPF: " + cpf);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getTempoDeCasa() {
		return tempoDeCasa;
	}
	public void setTempoDeCasa(int tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
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
