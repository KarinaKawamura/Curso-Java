package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Digite qualquer numero inteiro: ");
		
		
		//primitivo  ->  Wrapper
		//byte       ->  Byte
 		//short      ->  Short
		//int        ->  Integer
		//long       ->  Long (Coloca o L ao final do num)
		//boolean    ->  Boolean	
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//transforma o num em String
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //int			
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		
		//transforma o num em String 
		System.out.println(s.toString());
		
		//operações
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Transforma em String
		Character c = '#'; // char
		System.out.println(c + "...");
		
		entrada.close();	
		
	}

}
