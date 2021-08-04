package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana_private;

public class Pedro_heranca extends Ana_private {

	//Ana_private mae = new Ana_private();
	
	//como se trata de herança não se faz necessário instanciar a Ana
	
	void acessos() {
		//System.out.println(segredo);
		//System.out.println(fazEmCasa);
		System.out.println(herancaFamilia); 
		System.out.println(todosSabem);
	}
	
}
