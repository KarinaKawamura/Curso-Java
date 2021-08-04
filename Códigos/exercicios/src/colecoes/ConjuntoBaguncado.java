package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		//Exemplo 1 - autobox: converte primitivo em wrapper
		System.out.println("Exemplo 1");
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolena -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		//Exemplo 2
		System.out.println("\n\nExemplo 2");
		conjunto.add("Teste"); //não permite repetiçoes
		conjunto.add("x");
		System.out.println("Tamanho é: " + conjunto.size());
		
		//Exemplo 3 - remove itens
		System.out.println("\n\nExemplo 3");
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é: " + conjunto.size());
		
		//Exemplo 4 - Verifica se o item existe
		System.out.println("\n\nExemplo 4");
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		@SuppressWarnings("rawtypes")
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println("\n\nImpressão conjuntos");
		System.out.println(numeros);
		System.out.println(conjunto);
		
		//Exemplo 5 - união de conjuntos //não segue a ordem pois não é indexado
		System.out.println("\n\nExemplo 5");
		conjunto.retainAll(numeros);
		System.out.println(conjunto);
		
		//Exemplo 6 - limpeza total conjunto
		System.out.println("\n\nExemplo 6");
		conjunto.clear();
		System.out.println(conjunto);
	
	}

}
