package oo.composicao.umParaMuitos;

public class TesteCompra {

	public static void main(String[] args) {
		
		Compra compra1= new Compra();
		
		compra1.cliente = "Karina Kawamura";
		compra1.itens.add(new Item("Caneta", 20, 7.47));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 20.87));
		
		System.out.println("Quantidade de itens no carrinho: " + compra1.itens.size());
		System.out.println("\nValor total da compra: R$" + compra1.obterValorTotal());
		
	}

}
