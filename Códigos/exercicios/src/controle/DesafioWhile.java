package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		System.out.println("Digite -1 para finalizar o cálculo");
		
		while (nota != -1) {
			System.out.println("\nDigite a nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
				
			} else if (nota != -1) {
				System.out.println("Nota inválida!");
			}
		}
		
		//Cálculo da média
		double media = total / quantidadeDeNotas;
		System.out.printf("A média da turma é de: " + media);
		
		entrada.close();
		
	}

}
