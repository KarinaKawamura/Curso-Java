package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		//exemplo 1 - faixas karatê
		Scanner entrada = new Scanner(System.in);
		String faixa = "";
		
		System.out.println("Qual é a cor da sua faixa no Karatê?");
		faixa = entrada.next();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("\nSabe o Bassai-Dai;");
		case "marrom":
			System.out.println("\nSabe o Tekki Shodan;");
		case "roxa":
			System.out.println("\nSabe o Heian Godan;");
		case "verde":
			System.out.println("\nSabe o Heian Yodan;");
		case "laranja":
			System.out.println("\nSabe o Heian Sandan;");
		case "vermelha":
			System.out.println("\nSabe o Heian Nidan;");
		case "amarela":
			System.out.println("\nSabe o Heian Shodan.");
			break;
		default:
			System.out.println("\nEstá aprendendo!");
		}
		
		//exemplo 2 - idade
		int idade = 0;
		
		System.out.println("\n\n\nQual é a idade do bebê?");
		idade = entrada.nextInt();
		
		switch (idade) {
		case 3:
			System.out.println("Sabe comer sozinho;");
		case 2:
			System.out.println("Sabe falar;");
		case 1:
			System.out.println("Sabe andar;");
		case 0:
			System.out.println("Sabe brincar.");
		}
		
		entrada.close();	
		
	}

}
