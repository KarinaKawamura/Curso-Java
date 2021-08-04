package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		//put == colocar
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(44, "Rebeca");
		
		System.out.println(usuarios.size()); //tamanho
		System.out.println(usuarios.isEmpty()); //verifica se está vazio
		System.out.println();
		
		System.out.println(usuarios.keySet());   //mostra as chaves
		System.out.println(usuarios.values());   //mostra os valores
		System.out.println(usuarios.entrySet()); //mostra ambos
		System.out.println();
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(44));
		System.out.println(usuarios.containsValue("Roberto"));
		System.out.println();
		
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(1));
		System.out.println();
		
		for(Integer chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		
		for(Entry<Integer, String> cadastro: usuarios.entrySet()) {
			System.out.print(cadastro.getKey() + " --> ");
			System.out.println(cadastro.getValue());
		}
			
	}

}
