package Cliente_ExPOO;

public class Testa_Cliente {

	public static void main(String[] args) {
		
		//Recebe a classe e cria um objeto
		Cliente cliente = new Cliente();
		cliente.setNome("Carlos");
		cliente.setSexo("Masculino");
		cliente.setIdade(30);
		cliente.setTipoDeConta("Conta Premium");
		cliente.setSaldo(13030.45f);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ana");
		cliente2.setSexo("Feminino");
		cliente2.setIdade(25);
		cliente2.setTipoDeConta("Conta Padrão");
		cliente2.setSaldo(1034.42f);
		
		//Imprime os dados do objeto
		cliente.visualizar();
		cliente2.visualizar();
		
	}
}