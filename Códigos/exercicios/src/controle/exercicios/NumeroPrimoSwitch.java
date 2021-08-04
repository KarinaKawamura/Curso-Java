package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Este programa tem como finalidade identificar se o número informado é ou não um número primo."
				+ "\n\nDigite um número entre 1 e 100: ");
		numero = entrada.nextInt();
		
		if (numero >= 1 && numero <= 100) {
			switch(numero) {
			case(2):
			case(3):
			case(5):
			case(7):
			case(11):
			case(13):
			case(17):
			case(19):
			case(23):
			case(29):
			case(31):
			case(37):
			case(41):
			case(43):
			case(47):
			case(53):
			case(59):
			case(61):
			case(67):
			case(71):
			case(73):
			case(79):
			case(83):
			case(89):
			case(97):
				System.out.printf("O número %d é primo.", numero);
			break;
			default:
				System.out.printf("O número %d não é primo", numero);
			}
		} else {
			System.out.println("Por favor, digite um número entre 1 e 100.");
		}
		 
		entrada.close();

	}

}
