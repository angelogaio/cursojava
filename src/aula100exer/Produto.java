package aula100exer;

public class Produto {
	
	private String nomepro;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nomepro, Double preco) {
		this.nomepro = nomepro;
		this.preco = preco;
	}

	public String getNomepro() {
		return nomepro;
	}

	public void setNomepro(String nomepro) {
		this.nomepro = nomepro;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
