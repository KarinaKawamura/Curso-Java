package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz arroz = new Arroz(0.2);
		Feijão feijão = new Feijão(0.1);
		//Comida comida = new Comida(0.2); //não é possivel criar uma comida generica
		                                   //uma vez que a classe é abstrata
		
		System.out.println("Peso antes do jantar: " + convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijão);
		System.out.println("Peso após o prato principal: " + convidado.getPeso());
				
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.println("Peso após a sobremesa: " + convidado.getPeso());
		
		

	}

}
