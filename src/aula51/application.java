package aula51;

import java.util.Locale;
import java.util.Scanner;
import aula51.Calculator;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o Raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunference(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}


}

