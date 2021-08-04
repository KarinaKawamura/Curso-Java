package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double peso = 0;
		double altura = 0;

		System.out.println("Este programa tem como objetivo informar "
				+ "o índice de massa corporal e a situação em que se "
				+ "encaixa, segundo os dados inseridos.");
		
		System.out.println("\nInsira o peso em kg: ");
		peso = entrada.nextDouble();
		
		System.out.println("\nInsira a altura em metros: ");
		altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);

		System.out.printf("\nIMC: %.2f \n", imc);
		
		if (imc < 16) {
			System.out.println("Situação: Subpeso severo");
		} else if (imc >= 16 && imc <= 19.9) {
			System.out.println("Situação: Subpeso");
		} else if (imc >= 20 && imc <= 24.9) {
			System.out.println("Situação: Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Situação: Sobrepeso");
		} else if (imc >= 30 && imc <= 39.9) {
			System.out.println("Situação: Obeso");
		} else if (imc >= 40) {
			System.out.println("Situação: Obeso mórbido");
		}
				
		entrada.close();
		
	}

}
