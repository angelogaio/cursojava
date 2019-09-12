package aula141exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula119.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		try {
		double saldoInicial = 0.00;
		
		System.out.println("Entre com os Dados da Conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		String titular = sc.next();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite para Saque: ");
		double limiteSaque = sc.nextDouble();
		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		
		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		System.out.println(conta);
		}
		catch (LimitException e) {
			System.out.println(e.getMessage());	}
		
		
		
		sc.close();

	}

}
