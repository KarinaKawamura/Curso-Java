package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		//Objeto
		String exemplo = new String("Texto").toUpperCase();
		System.out.println(exemplo);
		//.toUpperCase() é um comportamento do objeto "exemplo"
		
		
		//Primitivo
		int numero = 123;
		System.out.println(numero);
		
		//Wrappers são a versão objeto dos tipos primitivos
		
	}

}
