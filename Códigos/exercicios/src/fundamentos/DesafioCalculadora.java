package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o primeiro número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String operacao = entrada.next();
		
		//lógica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
			
		System.out.println(num1 + " " + operacao + " " + num2 + " " + "= " + resultado);

		entrada.close();
		
	}

}
