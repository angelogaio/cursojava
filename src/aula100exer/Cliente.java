package aula100exer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dtniver;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date dtniver) {
		this.nome = nome;
		this.email = email;
		this.dtniver = dtniver;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtniver() {
		return dtniver;
	}

	public void setDtniver(Date dtniver) {
		this.dtniver = dtniver;
	}
	
	@Override
	public String toString() {
		return nome + " (" + sdf.format(dtniver) + ") - " + email;
 	}
	
	

}
