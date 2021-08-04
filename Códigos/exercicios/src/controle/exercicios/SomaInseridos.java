package controle.exercicios;

import java.util.Scanner;

public class SomaInseridos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		double num = 0;

		while (num != -1000000) {

			System.out.printf("Soma atual = %d\n", total);
			System.out.printf("Digite um numero: \n\n");
			num = entrada.nextDouble();

			if (num > 0) {
				total += num;
			} else {
				break;
			}

		}

		System.out.printf("\n\nSoma total = %d\n", total);

		entrada.close();

	}
}
