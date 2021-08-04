package classe.desafioModulo;

public class Pessoa {

	//Pessoas
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	void Comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
		 
	}
	
}

