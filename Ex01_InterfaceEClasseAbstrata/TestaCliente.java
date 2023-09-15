package Ex01_InterfaceEClasseAbstrata;

public class TestaCliente {

public static void main(String[] args) {
	
		PessoaFisica pessoa = new PessoaFisica("Jorge", "Masculino", 30, "Comum", 400.05f, "333.454.323-55", "São Paulo - SP");
		PessoaJuridica empresa = new PessoaJuridica("Loja de Carro", "", 0, "Gold", 254400.05f, "33.454.324/4243-ER", "Santos - SP");
		PessoaFisica pessoa2 = new PessoaFisica("Edson Macarano", "Masculino", 20, "Platinum", 4540.30f, "033.494.303-05", "São Bernardo do Campo - SP");
		PessoaJuridica empresa2 = new PessoaJuridica("Casa da Pamonha", "", 0, "Comum", 14403.22f, "63.404.124/4243-TC", "Aparecida do Norte - SP");
		EscolhaPagamento pessoapaga = new EscolhaPagamento("Jorge", "Masculino", 30, "Comum", 400.05f);
		EscolhaPagamento pessoa2paga = new EscolhaPagamento("Edson Macarano", "Masculino", 20, "Platinum", 4540.30f);
		EscolhaPagamento empresapaga = new EscolhaPagamento("Loja de Carro", "", 0, "Gold", 254400.05f);
		EscolhaPagamento empresa2paga = new EscolhaPagamento("Casa da Pamonha", "", 0, "Comum", 14403.22f);
		
		pessoa.visualizar();
		pessoapaga.pagar();
		
		empresa.visualizar();
		empresapaga.pagar();
		
		pessoa2.visualizar();
		pessoa2paga.pagar();

		empresa2.visualizar();
		empresa2paga.pagar();

	}
}