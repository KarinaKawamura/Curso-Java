package fundamentos;

public class NotacaoPonto {
	

	public static void main(String[] args) {

		//exemplo 1
		String frase = "Bom dia X";
		frase = frase.replace("X", "Senhora"); // substitui
		frase = frase.toUpperCase();           // todas as letras maiúsculas
		frase = frase.concat("!");             // concatena (soma)
		System.out.println(frase);

		//exemplo 2
		String metodo = "Karina".toUpperCase();
		System.out.println(metodo);
		
		//exemplo 3
		String metodoAlternativo = "Bom dia X"
				.replace("X", "Karina")
				.toUpperCase()
				.concat("!");
		System.out.println(metodoAlternativo);
		
		//exemplo 4
		String metodoAlternativo2 = "Bom dia X".replace("X", "Karina").toUpperCase().concat("!");
		System.out.println(metodoAlternativo2);
		
		//Tipos primitivos não possuem o operador "."
		int exemplo = 3;
		System.out.println(exemplo);
				
	}
	
}
