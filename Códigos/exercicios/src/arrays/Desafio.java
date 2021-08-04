package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double soma = 0;
		int i;
		
		System.out.println("Quantas notas você deseja inserir?");
		quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double [quantidadeDeNotas];
		
		for(i = 0; i < quantidadeDeNotas; i++) {
			System.out.printf("\nDigite a nota %d: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
				
		double media = 0;
		
		for(double nota: notas) {
			 soma += nota;			
		}
		
		media = soma / quantidadeDeNotas;
		
		System.out.println("\nMédia: " + media);
		
		entrada.close();
		 
	}

}
