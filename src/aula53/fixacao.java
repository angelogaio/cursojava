package aula53;

import java.util.Locale;
import java.util.Scanner;

public class fixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação?: ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos Dollares?: ");
		double dollar = sc.nextDouble();
		double total = cotacao * dollar;
		
		System.out.printf("Total a ser pago: " + "%.2f%n",Conversao.converte(total));
		
		sc.close();
	}
}
