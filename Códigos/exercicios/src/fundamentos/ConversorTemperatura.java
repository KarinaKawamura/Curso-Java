package fundamentos;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {

		//inicialização
		double fahrenheit = 0;
		double celsius = 0;
		final double AJUSTE = 32; // ajuste da fórmula
		final double FATOR = 5 / 9.0;
		Scanner entrada = new Scanner(System.in);

		//entrada
		System.out.println("Insira a temperatura em fahrenheit: \n");
		fahrenheit = entrada.nextInt();

		//processamento
		celsius = (fahrenheit - AJUSTE) * FATOR;

		//saída
		System.out.println(fahrenheit + " Fahrenheits é igual a " + celsius + " graus Celsius");

		entrada.close();
				
	}
}
