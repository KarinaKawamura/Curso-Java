package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		//exemplo 1
		Scanner entrada = new Scanner (System.in);
		String media;
		
		System.out.println("Digite a média do aluno: ");
		media = entrada.nextLine();
				
		media = media.replaceAll(",", ".");
		double mediaNumerica = Double.parseDouble(media);
		
		String resultadoRecuperacao = mediaNumerica >= 5.0 ? "em recuperação." : "reprovado.";
		String resultado = mediaNumerica >= 7.0 ? "aprovado." : resultadoRecuperacao;
			
		System.out.println("O aluno está " + resultado);
		
		//exemplo 2
		double nota = 8.8;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto= bomComportamento && passouPorMedia;
		String desconto = temDesconto ? "Sim" : "Não";
		
		System.out.println("\nTem direito à desconto? " + desconto);
		
		entrada.close();
		
	}

}
