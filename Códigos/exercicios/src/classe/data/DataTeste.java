package classe.data;

public class DataTeste {

	public static void main(String[] args) {
		
		//construtor 2
		Data data1 = new Data(21,06,2001);
		
		//construtor 1 - padrão
		Data data2 = new Data();
		
		//formas de impressão
		System.out.println(data1.dia + "/" + data1.mes + "/" + data1.ano);
		System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		
		//método
		System.out.println();
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		
	
		
		
		
		

	}

}
