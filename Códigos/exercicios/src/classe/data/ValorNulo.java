package classe.data;

public class ValorNulo {

	public static void main(String[] args) {
		
		//Ex.1 - variável válida
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		//Ex.2 - Math.random: numero aleatório entre 0 e 1; operador tewrnário
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		//Ex.3
		String s2 = Math.random() < 0.5 ? "exemplo 3" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
		
	}

}
