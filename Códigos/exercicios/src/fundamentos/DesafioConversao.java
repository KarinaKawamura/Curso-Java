package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		String mes1;
		String mes2;
		String mes3;
		
		System.out.println("Digite o valor do primeiro salário: ");
		mes1 = salario.nextLine();
		
		System.out.println("\n\nDigite o valor do segundo salário: ");
		mes2 = salario.nextLine();
		
		System.out.println("\n\nDigite o valor do terceiro salário: ");
		mes3 = salario.nextLine();
		
		//System.out.println(mes1);
		//System.out.println(mes2);
		//System.out.println(mes3);
		
		salario.close();
				
		String xmes1 = mes1.replaceAll(",", ".");
		String xmes2 = mes2.replaceAll(",", ".");
		String xmes3 = mes3.replaceAll(",", ".");
						
		double salario1 = Double.parseDouble(xmes1);
		double salario2 = Double.parseDouble(xmes2);
		double salario3 = Double.parseDouble(xmes3);
		
		//System.out.println(salario1);
		//System.out.println(salario2);
		//System.out.println(salario3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		System.out.println("\n\nA soma dos 3 salários é igual a R$" + soma + "\n");
		System.out.println("\n\nA média dos 3 salários é igual a R$" + media + "\n");
		
		
		//Resposta
		/*Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro salário: ");
		String mes1 = salario.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do primeiro salário: ");
		String mes2 = salario.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do primeiro salário: ");
		String mes3 = salario.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(mes1);
		double salario2 = Double.parseDouble(mes2);
		double salario3 = Double.parseDouble(mes3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("\n\nA média dos 3 salários é igual a R$" + media + "\n");*/
		
		
	}

}
