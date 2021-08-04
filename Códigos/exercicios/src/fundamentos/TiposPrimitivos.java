package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//ficha funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short quantidadeDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_854_223L;//permite separação por _ e o L deve ser indicado ao fim do número para que o compilador reconheça como long (e não int)
		
		//Tipos numéricos reais
		float salario = 11_445.44F;//aplica-se a mesma regra do long
		double vendasAcumuladas = 2_991_797_103.02;
		
		//Tipo booleano
		boolean ferias = false; // true
				
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(quantidadeDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": recebe -> " + salario);
		System.out.println("Férias?" + ferias);
		System.out.println("Status: " + status);
	}

}           
