package classe.produto;

public class ProdutoTeste {

	public static void main(String[] args) {
	
		
		//construtor 2
		Produto p1 = new Produto("Notebook",4356.89);
				
		//construtor 1
		//var p2 = new Produto();
		Produto p2 = new Produto();
		p2.produto = "Caneta Preta";
		p2.preco = 12.56;
		
		//Produto.desconto = 0.6;//altera o valor do desconto
			
		System.out.println(p1.produto);
		System.out.println(p2.produto);
		System.out.println();
		
		//método 1
		double precoFinal1 = p1.precoComDesconto();
		System.out.print(p1.produto + " com desconto: ");
		System.out.printf("%.2f\n", precoFinal1);
		
		//método 2
		double precoFinal2 = p2.precoComDesconto(0.15);
		System.out.print(p2.produto + " com desconto: ");
		System.out.printf("%.2f\n", precoFinal2);

		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("\nA média do carrinho = R$%.2f", mediaCarrinho);
		
		
	}

}
