package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//método incomum
		System.out.println("2" == "2");
		
		//comparação métodos
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		//exemplo
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDigite: ");
		
				
		//.nextLine() imterpreta com espaços
		String s2 = entrada.nextLine();
		String karina = entrada.nextLine();
		
		//.next() interpreta desconsiderando espaços
		String s3 = entrada.next();
		String nome = entrada.next();
		System.out.println(s3);
		
		entrada.close();
		
		//.trim() desnconsidera espaços
		System.out.println("2" == s2.trim());
		
		System.out.println("2".equals(s2.trim()));
		System.out.println("Karina".equalsIgnoreCase(karina.trim()));
		System.out.println("Karina".equalsIgnoreCase(nome.trim()));
	}

}
