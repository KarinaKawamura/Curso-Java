package controle;

public class Continue {

	public static void main(String[] args) {
		
		//interrompe apenas aquela repetição
		
		//exemplo 1 - mostrar apenas os pares
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n\n");
		
		//exemplo 2 - mostrar os numeros != do 5
		for (int i = 0; i <= 10; i++) {
			if(i == 5 ) {
				System.out.println("");
				continue;
			}
			System.out.println(i);
		}
				
	}

}
