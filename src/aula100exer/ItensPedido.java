package aula100exer;

public class ItensPedido {
	
	private Integer qtdade;
	
	//Ligação com produto
	private Double preco;
	
	private Produto produto;

	public ItensPedido(Integer qtdade, Double preco, Produto produto) {
		this.qtdade = qtdade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQtdade() {
		return qtdade;
	}

	public void setQtdade(Integer qtdade) {
		this.qtdade = qtdade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduct() {
		return produto;
	}

	public void setProduct(Produto produto) {
		this.produto = produto;
	}
	
	
	
	public double subTotal() {
		return preco * qtdade;
	}
	
	@Override
	public String toString() {
		return produto.getNomepro()
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantity: " 
				+ qtdade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

}
