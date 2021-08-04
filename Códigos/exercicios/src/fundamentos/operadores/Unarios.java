package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		// aula 49 (Operadores Unários)
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\nMini Desafio...");
		
		//exexuta o ++a e faz a comparação, depois executa o --b
		System.out.println(++a == b--);
		
		//compação após o decremento de b
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
				
	}

}
