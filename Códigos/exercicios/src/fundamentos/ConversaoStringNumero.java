package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		//JOptionPane == janela
		//showInputDialog == mensagem que aparece na janela
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		System.out.println(valor1 + valor2);
		
		//parseDouble == string -> número tipo double 
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
			

		//BigDecimal == Precisão no resultado das operações
	}

}
