package oo.heranca.teste;

import oo.heranca.desafioHeranca.Carro;
import oo.heranca.desafioHeranca.Ferrari;
import oo.heranca.desafioHeranca.Fusca;

public class TesteCarros extends Carro{

	TesteCarros() {
		super(150);
	}

	public static void main(String[] args) {
		
		Fusca fusca = new Fusca(/*declara a velocidade máxima aqui*/);
		
		System.out.println("Teste Fusca\n");
		System.out.println("Velocidade inicial: " + fusca.velocidadeAtual + "km/h");
		
		//System.out.println("Teste velocidade máxima: ");
							
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();

		System.out.println("Velocidade após aceleração: " + fusca.velocidadeAtual + "km/h");
		
		fusca.frear();		
		fusca.frear();		
		fusca.frear();		
				
		System.out.println("Velocidade após frenamento: " + fusca.velocidadeAtual + "km/h");
		
		
		
		Ferrari ferrari = new Ferrari(500/*declara a velocidade máxima aqui*/);
		
		System.out.println("\n\nTeste Ferrari\n");
		System.out.println("Velocidade inicial: " + ferrari.velocidadeAtual + "km/h");
		
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();
		ferrari.acelerarFerrari();

		System.out.println("Velocidade após aceleração: " + ferrari.velocidadeAtual + " km/h");
		
		ferrari.frearFerrari();
		ferrari.frearFerrari();
		ferrari.frearFerrari();
		ferrari.frearFerrari();
				
		System.out.println("Velocidade após frenamento: " + ferrari.velocidadeAtual + "km/h");
	
		ferrari.ligarTurbo();
		
		System.out.println("Velocidade após ligar o turbo: " + ferrari.velocidadeAtual + "km/h");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
