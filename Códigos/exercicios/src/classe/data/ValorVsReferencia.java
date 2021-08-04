package classe.data;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; //atribuição por valor, cópia (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		double c = a;
		alterarPrimitivo(c);
		System.out.println(c + " " + a + "\n");
		
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referência, mesmo endereço de memória (Objeto) 
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		d2.ano = 1999;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
				
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(double a) {
		a = 10;
	}
		
}
