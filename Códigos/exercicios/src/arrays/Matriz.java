package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos são? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		
		double soma = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n, a);
				System.out.println();
				notasDaTurma[a][n] = entrada.nextDouble();
				soma += notasDaTurma[a][n];
			}
			
		}
		
		double media = soma / (qtdAlunos * qtdNotas);
		System.out.println("\n\nA média da turma é " + media);
		
		entrada.close();

	}

}
