package Ex02_InterfaceEClasseAbstrata;

public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Rodrigo Pedro", "Curitiba - PR", "Masculino", 29, "253.781.113-99", 16000.00f,
				80);
		Vendedor vendedor = new Vendedor("Camila Pedrosa", "Apucarana - PR", "Feminino", 27, "353.751.213-24",
				346000.00f, 5);
		Gerente gerente2 = new Gerente("George Ricardo", "Belém - PA", "Masculino", 39, "213.081.153-95", 19000.00f,
				92);
		Vendedor vendedor2 = new Vendedor("Alessandra Santos", "Rio de Janeiro - RJ", "Feminino", 36, "053.151.213-34",
				946000.00f, 4);

		gerente.visualizar();
		vendedor.visualizar();
		gerente2.visualizar();
		vendedor2.visualizar();
	}

}
