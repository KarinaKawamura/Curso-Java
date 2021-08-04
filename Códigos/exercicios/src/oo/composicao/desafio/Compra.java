package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Itens> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Itens(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		//var produto = new Produto(nome, preco);
		this.itens.add(new Itens(new Produto(nome, preco), qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Itens item: itens) {
			total+= item.quantidade * item.produto.preco;
		}
		
		return total;
		
	}
	
}
	
	
	
	

