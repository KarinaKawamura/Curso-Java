package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int divisor;
		int primo = 1;
		
		System.out.println("Este programa tem como finalidade intenfificar se o número informado é ou não um número primo."
				+ "\n\nDigite um número:");
		numero = entrada.nextInt();
		
		for(divisor = 2; divisor < numero; divisor++) {
			if(numero % divisor == 0) {
				primo = 0;
			}
		}
		if(primo == 1) {
			System.out.printf("O número %d é primo.", numero);
		} else {
			System.out.printf("O número %d não é primo.", numero);
		}
				
		entrada.close();
		
	}

}
