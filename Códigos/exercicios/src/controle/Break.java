package controle;

public class Break {

	public static void main(String[] args) {
	
		//Interrompe o fluxo natural do código, ou seja, sai do laço quando chega no break
		//Pode ser usado para procurar um item de alguma lista
		
		for (int i = 0; i <= 20; i ++) {
			
			if (i == 11) {
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim");
				
	}

}
