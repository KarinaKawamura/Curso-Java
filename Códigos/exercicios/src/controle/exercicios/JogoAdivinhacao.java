package controle.exercicios;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numSecreto = 97;
		int numInserido = 0;
		int tentativas = 0;
		int tentativasRestantes = 0;
		
		System.out.println("Jogo da adivinhação! Você tem 10 tentativas para acertar o número correto entre 0 e 100.");
		
		while (tentativas < 10) {
			System.out.println("\n\nDigite um número: ");
			numInserido = entrada.nextInt();
			
			if (numInserido > numSecreto) {
				System.out.println("O número secreto é MENOR que o inserido.");
			} else {
				System.out.println("O número secreto é MAIOR que o inserido.");
			}
			
			if (numInserido > 0 && numInserido <= 100) {
				if (numInserido == numSecreto) {
					System.out.println("O número está CORRETO, parabéns!");
					break;
				} else {
					System.out.println("número INCORRETO, tente novamente.");
				}				
			} else {
				System.out.println("Por favor, digite um número entre 0 e 100.");
			}
					
				
		tentativas++;		
			
			tentativasRestantes = 10 - tentativas;
			System.out.printf("Você possui %d tentativas restantes.\n", tentativasRestantes);
		}
		 
		System.out.printf("\n\nSuas tentativas acabaram! \nO número secreto era %d", numSecreto);
		
		entrada.close();
		
	}

}
