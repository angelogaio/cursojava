package course;

import java.util.Locale;
import java.util.Scanner;

public class M3E3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota nota = new Nota();
		
		System.out.print("Nome: ");
		nota.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		nota.t1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		nota.t2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		nota.t3 = sc.nextDouble();
		
		System.out.println(nota);
		
		if (nota.calculo() > 60.00) {
			System.out.println("PASS");	
			}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60.00 - nota.calculo())+ " POINTS");
		}
		sc.close();
		
	}
}


