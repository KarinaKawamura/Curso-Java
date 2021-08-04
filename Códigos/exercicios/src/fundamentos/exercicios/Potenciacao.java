package fundamentos.exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double base = 0;
		double expoente = 0;
		
		System.out.println("Este programa tem como objetivo calcular uma "
				+ "potenciação, conforme os números inseridos.");
				
		//inserir o num separado por ,
		System.out.println("\nInsira o valor da base: ");
		base = entrada.nextDouble();
		
		System.out.println("Insira o valor do expoente: ");
		expoente = entrada.nextDouble();
		
		double resultado = Math.pow(base, expoente);
		System.out.println("O resultado da potenciação é " + resultado);
				
		entrada.close();
	}

}
