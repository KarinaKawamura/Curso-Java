package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int ano = 0;
		
		System.out.println("Este programa tem como finalidade determinar se o ano informado é bissexto ou não.\n\nDigite o ano: ");
		ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O ano é bissexto!");
			} else if (ano % 400 != 0){
				System.out.println("O ano não é bissexto!");
			}
			else {
				System.out.println("O ano é bissexto!");
			}
		} else if (ano % 400 != 0) {
			System.out.println("O ano não é bissexto!");
			} else {
				System.out.println("O ano é bissexto!");
			}
		
		entrada.close();
		
	}

}
