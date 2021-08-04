package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		double maiorNumero = 0;
		int entradas = 0;
		
		System.out.println("Este programa tem como finalidade receber 10 numeros e identificar qual é o maior entre eles.");
		
		while (entradas < 10) {
			System.out.println("Digite um número: ");
			numero = entrada.nextDouble();
						
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}			
			entradas++;
		}
			
		System.out.println("O maior número digitado foi o: " + maiorNumero);
				
		entrada.close();
		
	}

}
