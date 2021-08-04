package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Exemplo 1 - <Tipo> //Organiza de forma aleatória
		System.out.println("Exemplo 1:\n");
		Set<String> listaDeAprovados = new HashSet<>();		
		listaDeAprovados.add("Ana");
		listaDeAprovados.add("Carlos");
		listaDeAprovados.add("Luca");
		listaDeAprovados.add("Pedro");
		
		for(String candidato: listaDeAprovados) {
			System.out.println(candidato);
		}
		
		
		//Exemplo 2 - SortedSet e TreeSet: organiza do menor p/ o maior
		System.out.println("\n\nExemplo 2:\n");		
		SortedSet<Double> listaDeNotas = new TreeSet <>();
		listaDeNotas.add(976.5);
		listaDeNotas.add(861.9);
		listaDeNotas.add(852.7);
		listaDeNotas.add(689.4);
						
		for(Double notas: listaDeNotas) {
			System.out.println(notas);
		}
		
	}

}
