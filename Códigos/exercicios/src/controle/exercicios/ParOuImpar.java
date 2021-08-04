package controle.exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Este programa tem como finalidade identificar se o número indicado é par ou ímpar."
				+ "\n\nDigite um número inteiro: ");
		numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número é par!");
			}
			else {
				System.out.println("O número é ímpar!");
			}
		} else {
			System.out.println("Por favor, digite um número entre 0 e 10.");
		}
		
		entrada.close();
		
	}

}
