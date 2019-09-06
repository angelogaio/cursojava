package aula100exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Aniversário: ");
		Date dtniver = sdf.parse(sc.next());
		//Estanciar clientes
		Cliente clientes = new Cliente(nome, email, dtniver);
		
		System.out.println("Entre com os dados do Pedido:");
		System.out.print("Status: ");
		StatusPedido statusped = StatusPedido.valueOf(sc.next());
		// Estanciar pedido
		Pedido pedido = new Pedido(new Date(), statusped);
		
		
		System.out.print("Quantos produtos terá o Pedido? ");
		int qtdade = sc.nextInt();
		for (int i=1; i<=qtdade; i++) {
			System.out.println("Entre com o item #" + i + ":" );
			System.out.print("Nome do Produto: ");
			String nomepro = sc.next();
			System.out.print("Preco do Produto: ");
			Double precoped = sc.nextDouble();
			// Estanciar produto
			Produto produto = new Produto(nomepro, precoped);
			
			System.out.println("Quantidade: ");
			Integer qtdadepro = sc.nextInt();
			// Estanciar ItensPedido
			ItensPedido itenspedido = new ItensPedido(qtdadepro, precoped, produto);
			pedido.addItensPed(itenspedido);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(pedido);
		
		
		sc.close();
	}

	private static String now() {
		return null;
	}

}
