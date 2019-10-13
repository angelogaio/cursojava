package aula179;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\teste").mkdir();
		System.out.println("Diretorio criado com sucesso: " + success);
		
		sc.close();
	}

}
