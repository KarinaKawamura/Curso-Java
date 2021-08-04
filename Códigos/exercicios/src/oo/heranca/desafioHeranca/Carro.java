package oo.heranca.desafioHeranca;

public class Carro {

	final int VELOCIDADE_MAXIMA; 
	public int velocidadeAtual = 0;
	private int delta = 5;
	
	Carro(){
		this(150);
	}
	
	protected Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;			
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
		
	}
		
	
	
	
}
