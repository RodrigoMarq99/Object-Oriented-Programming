package Ingresso_ExPOO;

public class Ingresso {

	private int totalDisponivel;
	private float preco;
	private int quantidadeVendido;
	private String nomeDoCantor;
	private String nomeDoLocal;

	public int getTotalDisponivel() {
		return totalDisponivel;
	}

	public void setTotalDisponivel(int totalDisponivel) {
		this.totalDisponivel = totalDisponivel;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidadeVendido() {
		return quantidadeVendido;
	}

	public void setQuantidadeVendido(int quantidadeVendido) {
		this.quantidadeVendido = quantidadeVendido;
	}

	public String getNomeDoCantor() {
		return nomeDoCantor;
	}

	public void setNomeDoCantor(String nomeDoCantor) {
		this.nomeDoCantor = nomeDoCantor;
	}

	public String getNomeDoLocal() {
		return nomeDoLocal;
	}

	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}

	public void visualizar() {
		System.out.println("- - - - - - - - - \n" + "Dados do Ingresso");
		System.out.println("O total de ingressos disponíveis é: " + totalDisponivel);
		System.out.println("O preço do ingresso é: R$" + preco);
		System.out.println("A quantidade vendida até o presente momento é: " + quantidadeVendido);
		System.out.println("O nome do artista é: " + nomeDoCantor);
		System.out.println("A apresentação será no local: " + nomeDoLocal);
	}
	
}