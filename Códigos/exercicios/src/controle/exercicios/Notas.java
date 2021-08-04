package controle.exercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		
		System.out.println("Este programa tem como finalidade calcular a mádia de um aluno e determinar a situação do mesmo."
				+ "\n\nDigite a nota da prova 1:");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a nota da prova 2:");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
			
		System.out.print("\nA média é: " + media + "\nO aluno está: ");
		
		if (media >= 7) {
			System.out.println("APROVADO!");
		} else if (media >=4) {
			System.out.println("de RECUPERAÇÃO!");
		} else {
			System.out.println("REPROVADO!");
		}
		
		entrada.close();
		
	}

}
