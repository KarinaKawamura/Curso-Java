package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		//print  - matém a próxima impressão na mesma linha
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		//println  - quabra a linha ao final da impressão
		System.out.println("Boa");
		System.out.println("tarde! \n\n");
		
		//printf  - imprime como na ling C, a notação %n é uma quebra de linha
		/*System.out.println("Megasena: %d %d %d %d %d %d %d %n", 1 2 3 4 5 6);
		
		System.out.printf("Salário: %.2f %n", 1234.56789);
		
		System.out.printf("Nome: %s %n", "Karina");*/
		
		//entrada manual  - entrada == nome da variável
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		String idade = entrada.nextLine();
		
		System.out.printf("\n\n%s %s tem %s anos. %n", nome, sobrenome, idade);
		
		//encerra o comando
		entrada.close();
	}

}
