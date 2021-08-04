package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		//Exemplo 1 chamada
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		//Exemplo 2 chamada
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));//permite repetição
		
		//imprime por índice
		System.out.println(lista.get(3) + "\n");
		
		//métodos de remoção
		System.out.println(lista.remove(0));
		System.out.println(lista.remove(new Usuario("Bia")));
		
		//métodos verificação
		System.out.println("\n" + lista.contains(u1));
		System.out.println(lista.contains(new Usuario("Lia")) + "\n");
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}

	}

}
