package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo extends Jogador {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10, 10);
		//monstro.x = 10;
		//monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		//heroi.x = 10;
		//heroi.y = 11;
		
		System.out.println("Início do Jogo");
		System.out.println("Jogador 1: vida " + monstro.vida + "%");
		System.out.println("Jogador 2: vida " + heroi.vida + "%");
		
		System.out.println("\nPrimeiro Combate:");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Jogador 1: vida " + monstro.vida + "%");
		System.out.println("Jogador 2: vida " + heroi.vida + "%");
		
		System.out.println("\nSegundo Combate:");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Jogador 1: vida " + monstro.vida + "%");
		System.out.println("Jogador 2: vida " + heroi.vida + "%");
		
		System.out.println("\nTerceiro Combate:");
		
		monstro.andar(Direcao.OESTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
				
		System.out.println("Jogador 1: vida " + monstro.vida + "%");
		System.out.println("Jogador 2: vida " + heroi.vida + "%");
				
		/*
		jogador1.andar(Direcao.NORTE);
		jogador1.andar(Direcao.LESTE);
		jogador1.andar(Direcao.NORTE);
		jogador1.andar(Direcao.LESTE);
				
		System.out.println(jogador1.x);
		System.out.println(jogador1.y);
		*/		
				
	}
	
}
