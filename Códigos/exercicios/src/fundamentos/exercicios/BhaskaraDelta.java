package fundamentos.exercicios;

import java.util.Scanner;

public class BhaskaraDelta {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;		
		double delta = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este programa tem como objetivo calcular "
				+ "o delta e a fórmula de bhaskara.\n");
		
		System.out.println("Equação: ax² + bx + c = 0\n");
		
		System.out.println("informe o valor de ax²: ");
		a = entrada.nextDouble();
		
		System.out.println("informe o valor de bx: ");
		b = entrada.nextDouble();
		
		System.out.println("informe o valor de c: ");
		c = entrada.nextDouble();
		
		System.out.printf("\nEquação: %.2fx² + %.2fx + %.2f = 0\n", a, b, c);
		
		System.out.print("\n\nDelta = ");
		
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);	
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		entrada.close();
		
	}

}
