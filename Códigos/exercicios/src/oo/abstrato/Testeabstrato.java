package oo.abstrato;

public class Testeabstrato {

	public static void main(String[] args) {
		
		Mamifero cachorro = new Cachorro();
		
		System.out.println("o cachorro...");
		System.out.println("se move " + cachorro.mover());
		System.out.println("se alimenta " + cachorro.mamar());
		System.out.println("respira " + cachorro.respirar());
		
		
		
	}

}
