package classe.desafios;

import java.util.Scanner;

public class DesafioMCVsITeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		DesafioMCVsI produto1 = new DesafioMCVsI("Caneta", 7.5);
		DesafioMCVsI produto2 = new DesafioMCVsI("Corretivo", 17);
		DesafioMCVsI produto3 = new DesafioMCVsI("Lapiseira", 49.90);
		DesafioMCVsI produto4 = new DesafioMCVsI("Borracha", 8.75);
		DesafioMCVsI produto5 = new DesafioMCVsI("Fichario", 149.99);
		DesafioMCVsI produto6 = new DesafioMCVsI("Bloco fichario", 12.85);
		
		System.out.println("Ao inserir o deconto siga o exemplo: 10% = 0,10\n\nDigite o valor do desconto:");
		DesafioMCVsI.desconto = entrada.nextDouble();
		
		System.out.println("\n\nProdutos sem desconto\n");
		System.out.println(produto1.produto + ": R$" + produto1.preco);
		System.out.println(produto2.produto + ": R$" + produto2.preco);
		System.out.println(produto3.produto + ": R$" + produto3.preco);
		System.out.println(produto4.produto + ": R$" + produto4.preco);
		System.out.println(produto5.produto + ": R$" + produto5.preco);
		System.out.println(produto6.produto + ": R$" + produto6.preco);
		
		double somaCarrinho = produto1.preco + produto2.preco + produto3.preco + 
				produto4.preco + produto5.preco + produto6.preco;
		System.out.println("\nCarrinho sem desconto: R$" + somaCarrinho);
				
		System.out.println("\n\nProdutos com desconto\n");
		System.out.println(produto1.produto + ": R$" + produto1.precoComDescontoDesafio());
		System.out.println(produto2.produto + ": R$" + produto2.precoComDescontoDesafio());
		System.out.println(produto3.produto + ": R$" + produto3.precoComDescontoDesafio());
		System.out.println(produto4.produto + ": R$" + produto4.precoComDescontoDesafio());
		System.out.println(produto5.produto + ": R$" + produto5.precoComDescontoDesafio());
		System.out.println(produto6.produto + ": R$" + produto6.precoComDescontoDesafio());
		
		double somaCarrinhoDesconto = produto1.precoComDescontoDesafio() + produto2.precoComDescontoDesafio() 
				+ produto3.precoComDescontoDesafio() + produto4.precoComDescontoDesafio() +
				produto5.precoComDescontoDesafio() + produto6.precoComDescontoDesafio();
		System.out.println("\nCarrinho com desconto: R$" + somaCarrinhoDesconto);
		
		double totalDesconto = somaCarrinho - somaCarrinhoDesconto;
		System.out.println("\n\nValor total dos descontos aplicados nos produtos: R$" + totalDesconto);

		entrada.close();
		
	}

}
