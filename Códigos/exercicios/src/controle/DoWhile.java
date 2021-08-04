package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		System.out.println("Você precisa digitar as palavras mágicas para fazer"
				+ "com que o programa pare de se repetir: \n");
		
		do {
			System.out.println("Não foi dessa vez\n");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
	}

}
