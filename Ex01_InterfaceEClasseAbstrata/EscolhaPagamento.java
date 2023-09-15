package Ex01_InterfaceEClasseAbstrata;

public class EscolhaPagamento extends Cliente implements Pagamentos, Credito, Debito{
	
	public EscolhaPagamento(String nome, String sexo, int idade, String tipoDeConta, float saldo) {
		super(nome, sexo, idade, tipoDeConta, saldo);
	}
	
	@Override
	public void pagar() {
		System.out.println("Como será feito o pagamento?");
		if(getSaldo() < 1000f) {
			credito();
		}else {
			debito();
		}
	}
	@Override
	public void credito() {
		System.out.println("Será feito no crédito.");
	}
	@Override
	public void debito() {
		System.out.println("Será feito no débito.");
	}
	
	public void visualizar() {
		System.out.println("----------------------\nDados do(a) Cliente");
		System.out.println("Nome: " + getNome());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Idade: " + getIdade());
		System.out.println("Tipo da conta: " + getTipoDeConta());
		System.out.println("Saldo: R$" + getSaldo());
		
	}
}
