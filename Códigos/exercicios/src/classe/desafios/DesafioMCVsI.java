package classe.desafios;

public class DesafioMCVsI {

	String produto;
	double preco;
	static double desconto = 0.25;
	
	DesafioMCVsI(String nomeInicial, double precoInicial){
		produto = nomeInicial;
		preco = precoInicial;
	}
		
	double precoComDescontoDesafio() {
		return preco * (1 - desconto);
	}
	
	
}
