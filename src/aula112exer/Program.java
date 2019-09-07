package aula112exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de Contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Taxas a pagar #" + i + " Funcionario: ");
			System.out.print("Pessoa Fisica ou Juridica(f/j)?");
			char f = sc.next().charAt(0);
			if (f == 'f') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Rendimento Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gasto com Saude: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				}
			else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Rendimento Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Quantidade de Funcionarios: ");
				double funcionarios = sc.nextDouble();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXAS A PAGAR:");
		
		for (Contribuinte contrib : list) {
			Double imposto = contrib.imposto();
			System.out.println(contrib.getNome()+ ": $" + String.format("%.2f",contrib.imposto()));
			sum += imposto;
		}
			
		System.out.println();
		System.out.println("TOTAL TAXAS: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
