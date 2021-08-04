package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		//bloco 1
		//double bloco1 = (1-5) * (2-7) / 2;
		//bloco1 = Math.pow(bloco1 , 2);
		double bloco1 = Math.pow((1-5) * (2-7) / 2, 2);
		//System.out.println(bloco1);
		
		//bloco 2
		//double bloco2 = 6 * (3+2);
		//bloco2 = Math.pow(bloco2, 2)
		double bloco2 = Math.pow(6 * (3+2), 2);
		bloco2 = bloco2 / (3 * 2);
		//System.out.println(bloco2);
		
		//bloco 3
		//double bloco3 = (bloco2 - bloco1);
		//bloco3 = Math.pow(bloco3), 3);
		double bloco3 = Math.pow((bloco2 - bloco1), 3);
		//double divisor = 10;
		//divisor = Math.pow(divisor, 3);
		double divisor = Math.pow(10, 3);
		bloco3 = bloco3 / divisor;
		System.out.println(bloco3);
	}

}
