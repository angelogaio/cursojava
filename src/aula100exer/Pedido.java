package aula100exer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private Date dtatual;
	private StatusPedido status;
	
	// Ligação com Cliente
	private Cliente cliente;
	//Ligação com Produto / varios itens
	private List<ItensPedido> itensPed = new ArrayList<>();
		
	public Pedido() {
	}	
	public Pedido(Date dtatual, StatusPedido status) {
		this.dtatual = dtatual;
		this.status = status;
	}
	
	public Date getDtatual() {
		return dtatual;
	}
	public void setDtatual(Date dtatual) {
		this.dtatual = dtatual;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public List<ItensPedido> getItensPed() {
		return itensPed;
	}
		
	//Adicionar itens na Lista
	public void addItensPed(ItensPedido itensPedido) {
		itensPed.add(itensPedido);
	}
		
	//Remover itens da Lista
	public void removeItensPed(Produto itensPedido) {
		itensPed.remove(itensPedido);
	}
	
	public double total() {
		double sum = 0.0;
		for (ItensPedido itensPed : itensPed) {
			sum += itensPed.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data do Pedido: ");
		sb.append(sdf.format(dtatual) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido:\n");
		for (ItensPedido itensPed : itensPed) {
			sb.append(itensPed + "\n");
		}
		sb.append("Preco Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
