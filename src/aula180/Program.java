package aula180;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getPasta: " + path.getParent());
		System.out.println("getCaminho: " + path.getPath());
		
		
		sc.close();
	}

}
