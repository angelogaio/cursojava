package aula109exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite o numero de Produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++){
			System.out.println("Produto Numero #" + i + " :");
			System.out.print("Comuns, Usado ou Importado (c,u,i)?");
			char tipo = sc.next().charAt(0);
			if (tipo == 'c') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				list.add(new Produto(nome, preco));
				}
			else if (tipo == 'u') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				System.out.print("Data de Fabricação: ");
				Date dataFabricacao = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				System.out.print("Taxa de Importação: ");
				Double taxaImportacao = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaImportacao));				
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Produto pro : list) {
			System.out.println(pro.etiqueta());
		}

	}

}
