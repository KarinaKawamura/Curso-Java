package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a media: ");
		
		double media = entrada.nextDouble();
		
		if (media < 0 || media > 10) {
			System.out.println("Nota inválida!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >=4.5) {
			System.out.println("Recuperação!");
		} else if (media < 4.5) {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
		
	}

}
