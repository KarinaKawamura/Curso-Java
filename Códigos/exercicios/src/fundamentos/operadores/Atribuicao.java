package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;
		
		//atribui sem substituir
		c += b; // c = c + b;
		System.out.println(c); //9
		
		c -= a; // c = c - a;
		System.out.println(c); //6
		
		c *= b; // c = c * b;
		System.out.println(c); //18
		
		c /= a; // c = c / a;
		System.out.println(c); //6
		
		c %= 2; // c = c % 2; 0 == par  1 == ímpar
		System.out.println(c); //0

	}

}
