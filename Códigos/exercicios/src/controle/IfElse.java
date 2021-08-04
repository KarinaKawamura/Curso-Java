package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:"); //abre caixa Java 
		int numero = Integer.parseInt(valor); //transforma string em num
		
		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");			
		}

	}

}
 