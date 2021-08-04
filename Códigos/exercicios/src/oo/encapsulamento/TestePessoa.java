package oo.encapsulamento;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1= new Pessoa("Karina", -20);
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println();
		
		pessoa1.setNome("Kawamura");
		pessoa1.setIdade(100);
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		
		pessoa1.setIdade(200);// não irá alterar pq não está dentro das condições
		System.out.println(pessoa1.getIdade());
		
		pessoa1.setIdade(-200);// não irá alterar pq não está dentro das condições
		System.out.println(pessoa1.getIdade());
		
		
		
		
	}

}
