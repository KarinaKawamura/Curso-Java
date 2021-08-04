package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		//exemplo 1
		System.out.println(2 + 3 + "\n");
		
		//exemplo 2
		double x = 34.56;
		double y = 2.2;
				
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y + "\n");
		
		//exemplo 3
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //ignora os num após a vírgula
		System.out.println(a / (double) b); //CAST
		System.out.println(a / (float) b + "\n");  //CAST
	
		System.out.println(a % b); //operador "módulo" "%", resto da divisão
		System.out.println(8 % 3 + "\n");
		
		//exemplo 4
		System.out.println(x + y - a * b); //executa por precedência
		
		//a * b --> x + y --> - a
		
	}

}
