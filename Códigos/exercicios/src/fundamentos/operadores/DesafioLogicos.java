package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);
				
		boolean dia1 = true;
		boolean dia2 = true;
		
		boolean comprouTV50 = dia1 && dia2;
		boolean comprouTV32 = dia1 ^ dia2;
		boolean comprouSorvete = dia1 || dia2;
		
		//Operador unário
		boolean maisSaudavel = !comprouSorvete;                                                                                        
		
		System.out.println("Comprou TV50\"? " + comprouTV50);
		System.out.println("Comprou TV32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		

	}

}
