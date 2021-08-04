package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
	
		//FIFO
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferença: o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");   //retorna false 
		fila.offer("Daniel"); //lança uma exceção (erro)
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o próximo elemento da fila (não remove)
		//Diferença: o comportamento quando a fila está vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());    //retorna null
		System.out.println(fila.element()); //lança uma exceção (erro)
		System.out.println(fila.element());
		
		//imprime na ordem de inclusão (FIFO)
		for(String candidato: fila) {
			System.out.println(candidato);
		}
		
		//Poll e Remove -> obter o próximo elemento (remove)
		//Diferença: o comportamento quando a fila está vazia!
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //lança uma exceção (erro)
		System.out.println(fila.poll());   //retorna false
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();  -> tamanho
		//fila.clear(); -> apaga
		//fila.isEmpty();  -> verifica se está vazio
		//fila.contains(); -> verifica a existência do que foi informado
		
	}

}
