package course;

import java.util.Locale;
import java.util.Scanner;

public class M3E1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Entre com altura e largura do retangulo");
		x.altura = sc.nextDouble();
		x.largura = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		System.out.printf("AREA = %.2f%n",area);
		System.out.printf("PERIMETRO = %.2f%n", perimetro);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);		
		sc.close();
	}

}
