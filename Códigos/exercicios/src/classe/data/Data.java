package classe.data;

public class Data {

	int dia;
	int mes;
	int ano;
	
		
	//CONSTRUTORES
	//1 - construtor padrão
	Data () {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);//construtor que chama outro construtor (método)
	}
	
	//2 
	Data (int diaInicial, int mesInicial, int anoInicial) { //parametros do construtor (visiveis apenas dentro do construtor)
		this.dia = diaInicial; //atributos de instancia
		this.mes = mesInicial; //usado para diferenciar os nomes 
		this.ano = anoInicial;
	}
	
	//MÉTODO	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano); //chamar o atributo de instancia 
	}
	
	
	
	
	
	
}
