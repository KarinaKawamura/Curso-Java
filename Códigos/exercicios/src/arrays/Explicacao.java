package arrays;

import java.util.Arrays;

public class Explicacao {

	public static void main(String[] args) {
		
		//Exemplo 1 
		System.out.println("Exemplo 1\n");
		
		double[] notasAlunoA = new double[4]; //anatomia
		
		System.out.println(Arrays.toString(notasAlunoA) + "\n");
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.8;
		notasAlunoA[3] = 9.7;
		
		System.out.println("Notas: " + Arrays.toString(notasAlunoA));
		
		double mediaAlunoA = 0;		
		for(int i = 0; i < notasAlunoA.length; i++) {
			mediaAlunoA += notasAlunoA[i];
		}
		
		System.out.println("Média: " + mediaAlunoA / notasAlunoA.length + "\n");
		
		System.out.println("Nota 1: " + notasAlunoA[0]);
		System.out.println("Nota 4: " + notasAlunoA[notasAlunoA.length - 1]);
		//System.out.println(notasAlunoA[4]); ERRO!
		
		//Exemplo 2
		System.out.println("\n\nExemplo 2\n");
		
		double notaArmazenada = 5.9;
		double [] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; //declaração
		
		double mediaAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			mediaAlunoB += notasAlunoB[i];
		}
		
		System.out.println(mediaAlunoB / notasAlunoB.length);
				
	}

}
