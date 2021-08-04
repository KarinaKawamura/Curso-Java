package controle.exercicios;

import java.util.Scanner;

public class Soletrando {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		int repeticoes = 0;
		int i1 = 0;
		int i2 = 1;
		
		System.out.println("Este programa tem como finalidade soletrar a palavra inserida");
		System.out.println("\nDigite uma palavra: ");
		palavra = entrada.next();
		
		int indice = palavra.length();
				
		while (repeticoes < indice) {
			System.out.println(palavra.subSequence(i1, i2));
			
			repeticoes++;
			i1++;
			i2++;
		}
		
		entrada.close();
	}

}
