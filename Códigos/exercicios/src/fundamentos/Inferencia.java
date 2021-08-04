package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
	
		//exemplo 1
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//exemplo 2
		double b = 4.5; //alterar para var
		System.out.println(b);
		
		String c = "Texto"; //alterar para var
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//exemplo 3 (esse método não funciona com o var, pois este deve ser declarado e inicializado numa mesma linha para que o compilador identifique o tipo da variável)
		double d;             //declarada
		d = 123.45;           //inicializada
		System.out.println(d);//usada
		
	}

}