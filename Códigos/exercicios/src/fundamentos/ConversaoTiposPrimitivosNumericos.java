package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		
		//conv. implicita
		double a = 1;
		System.out.println(a);
		
		
		//conv. explícita (CAST), após o dígito 8 o programa trunca o número sem aproximar
		float b = (float) 1.12345678912; 
		System.out.println(b);
		
		//conv. explícita (CAST)
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		
		//conv. explícita (CAST), não arredonda
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
		

	}

}
