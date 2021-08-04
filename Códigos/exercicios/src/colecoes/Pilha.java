package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//quando a fila está cheia ...
		livros.add("O Pequeno Príncipe"); //retorna false
		livros.push("Don Quixote");       //lança uma exceção (erro)
		livros.push("O Hobbit");
		
		//obter o próximo elemento da fila (não remove)
		//quando a fila está vazia ...
		System.out.println(livros.peek());    //retorna null
		System.out.println(livros.element()); //lança uma exceção (erro)
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//obter o próximo elemento (remove)
		//quando a fila está vazia ...
		System.out.println(livros.pop());
		System.out.println(livros.poll());  
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());  //retorna false
		System.out.println(livros.pop());   //lança uma exceção (erro)
		//System.out.println(livros.remove());//lança uma exceção (erro)
		
		//livros.size();  -> tamanho
		//livros.clear(); -> apaga
		//livros.contains(); -> verifica a existência do que foi informado
		//livros.isEmpty();  -> verifica se está vazio
		
	}

}
