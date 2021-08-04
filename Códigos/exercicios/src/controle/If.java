package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno: ");
		double media = entrada.nextDouble();
		
		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if (media >= 4 && media < 7) {
			System.out.println("Recuperação!");
		}
		
		if (media >= 0 && media < 4) {
			System.out.println("Reprovado!");
		}
		
		entrada.close();

	}

}
