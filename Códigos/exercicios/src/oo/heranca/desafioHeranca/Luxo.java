package oo.heranca.desafioHeranca;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
	
}
