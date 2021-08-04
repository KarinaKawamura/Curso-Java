package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCelsiusFahrenheits {

	
	public static void main(String[] args) {

		//inicialização
		double fahrenheit = 0;
		double celsius = 0;
		final double AJUSTE = 32; // ajuste da fórmula
		final double FATOR = 9 / 5.0;
		Scanner entrada = new Scanner(System.in);

		//apresentação
		System.out.println("Este programa tem como objetivo converter a temperatura "
				+ "informada em graus Celsius para graus Fahrenheits.");
	
		
		//entrada
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = entrada.nextInt();

		//processamento
		fahrenheit = (celsius * FATOR) + AJUSTE;

		//saída
		System.out.println("\n" + celsius  + " graus" + " Celsius é igual a " 
				+ fahrenheit  + " graus Fahrenheits");
		
		entrada.close();
		
	}
}
