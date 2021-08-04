package fundamentos;

public class TiposString {

	public static void main(String[] args) {
		
	//exemplo 1
	System.out.println("Olá pessoal".charAt(6)); //imprime somente a letra 
	                                             //correspondente ao indice indicado
	
	
	//exemplo 2
	String saudacao = "Boa tarde";
	
	//juntar
	System.out.println(saudacao.concat("!"));
	System.out.println(saudacao + "!");
	
	//conferir se começa com 
	System.out.println(saudacao.startsWith("Boa"));
	System.out.println(saudacao.startsWith("tarde"));
	
	//conferir se termina com 
	System.out.println(saudacao.endsWith("tarde"));
	System.out.println(saudacao.endsWith("Boa"));
	
	//identifica letras minúsculas e maiúsculas
	System.out.println(saudacao.toLowerCase().startsWith("boa"));
	System.out.println(saudacao.toUpperCase().endsWith("TARDE"));
	
	//tamanho da string (inclundo espaços)
	System.out.println(saudacao.length());
	
	//comparativos: 1- deve estar exatamente igual, 2-o programa reconhece
	//as letras minúsculas, 3- o programa reconhece letras minúsculas e maiúsculas
	System.out.println(saudacao.contentEquals("boa tarde"));
	System.out.println(saudacao.toLowerCase().contentEquals("boa tarde"));
	System.out.println(saudacao.equalsIgnoreCase("boa tarde"));
	
	
	
	//exemplo 3
	//verifica se possui o sentença indicada
	System.out.println("Frase qualquer".contains("qual"));	
	
	//indica em qual indice inicia a sentença indicada
	System.out.println("Frase qualquer".indexOf("qual"));
	
	//imprime a sentença a partir do indice indicado
	System.out.println("Frase qualquer".substring(6));
	
	//imprime a sentença que esta entre os indices indicados (o 1 é incluso 0 2 não)
	System.out.println("Frase qualquer".subSequence(6, 10));		
			
	
	
	//exemplo 4
	String nome = "Karina";
	String sobrenome = "Kawamura";
	int idade = 20;
	double salario = 2000.00;
	
	System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
					   "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
	
	//tem que atualizar a versão do java para funcionar.
	//System.out.printf("A %s %s tem %i anos, é analista de desenvolvimento "
	//		         + "de sistemas e seu salário é de R$%d", nome, sobrenome, idade, salario);
			         
	//String frase = String.format("A %s %s tem %i anos, é analista de desenvolvimento "
	//				         + "de sistemas e seu salário é de R$%d", nome, sobrenome, idade, salario);
	//System.out.println(frase);
					
	}

}
