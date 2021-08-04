package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFahrenheutsCelsius {
	
	public static void main(String[] args) {

		//inicialização
		double fahrenheit = 0;
		double celsius = 0;
		final double AJUSTE = 32; // ajuste da fórmula
		final double FATOR = 5 / 9.0;
		Scanner entrada = new Scanner(System.in);

		//apresentação
		System.out.println("Este programa tem como objetivo converter a temperatura "
				+ "informada em graus Fahrenheits para graus Celsius.");
		
		
		//entrada
		System.out.println("Insira a temperatura em Fahrenheit: ");
		fahrenheit = entrada.nextInt();

		//processamento
		celsius = (fahrenheit - AJUSTE) * FATOR;

		//saída
		System.out.println("\n" + fahrenheit + " graus" + " Fahrenheits é igual a " + celsius + " graus Celsius");

		entrada.close();
		
	}

}
