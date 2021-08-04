package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		int nota = 0;
		
		System.out.println("Informe a nota: ");
		nota = entrada.nextInt();
				
		switch (nota) {
		case 10: case 9:
			conceito = "MB - Muito Bom";
			break;
		case 8: case 7:
			conceito = "B - Bom";
			break;
		case 6: case 5:
			conceito = "R - Regular";
			break;
		case 4: 
		case 3:
		case 2:
		case 1:
		case 0:
			conceito = "I - Insuficiente";
			break;
		default:
			conceito = "Nota inválida, conceito não identificado!";
			//break; (como é o último case, o break não se faz necessário)			
		}
		
		//System.out.printf("O conceito equivalente a nota %d é %s!", nota, conceito);
		System.out.printf("\nNota %d: %s", nota, conceito);
				
		entrada.close();
		
	}

}
