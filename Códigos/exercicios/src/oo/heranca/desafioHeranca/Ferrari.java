package oo.heranca.desafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	
	
	public Ferrari(){
		this(300);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	public void acelerarFerrari() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	public void frearFerrari() {
		super.frear();		
		super.frear();		
		super.frear();		
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	
	public void desligarTurbo() {
		ligarTurbo = false;		
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
	
}
