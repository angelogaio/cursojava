package aula141exer;

import aula119.DomainException;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	private double limiteSaque;
	
	Conta(){
	}

	public Conta(int numero, String titular, double saldo, double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(double saque) {
		if (limiteSaque < saque) {
			throw new LimitException("Erro no Saque, valor excede o limite de saque");
		}
		if (getSaldo() < saque) {
			throw new LimitException("Erro no Saque, sem saldo");
		}
		this.saldo -= saque; 
	}

	public void deposito(double deposito) {
		this.saldo += deposito; 
	}
	
	@Override
	public String toString() {
		return 
				"Novo Saldo: "
				+ String.format("%.2f", getSaldo());
	}
}
