package course;

import java.util.Locale;
import java.util.Scanner;

public class M3E2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome, salario bruto e o imposto");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Empregado: " 
							+ funcionario.nome 
							+ ", $ " 
							+ String.format("%.2f",funcionario.salarioLiquido()));
		
		System.out.println();
		System.out.println("Deseja aumentar o salario em quantos %?");
		
		double imposto = sc.nextDouble();
		funcionario.addSalario(imposto);
		
		System.out.println("Salario atualizado: " 
							+ funcionario.nome 
							+ ", $ " 
							+ String.format("%.2f",funcionario.salarioLiquido()));
		
		
		
		sc.close();
		

	}

}
