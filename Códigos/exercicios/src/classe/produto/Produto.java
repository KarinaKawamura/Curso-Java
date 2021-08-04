package classe.produto;

public class Produto {
	
	String produto;
	double preco;
	static double desconto = 0.25;
	
	//CONSTRUTORES
	//1 - construtor padrão explicito 
	Produto (){
		
	}
	
	//2 - consrtrutor com parâmetros 
	Produto(String nomeInicial, double precoInicial){
		produto = nomeInicial;
		preco = precoInicial;
	}
	
	//MÉTODOS
	//1 - método que não recebe parêmetro
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	//2 - método que recebe parâmetro
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	
}
