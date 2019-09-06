package aula109exer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	ProdutoUsado(){
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.sdf = sdf;
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public void setnome (String nome) {
		super.setNome(nome + "used");
	}
	
	@Override
	public String etiqueta() {
		return super.etiqueta() + "(Data de Fabricação: " + sdf.format(dataFabricacao);
	}
	
}
