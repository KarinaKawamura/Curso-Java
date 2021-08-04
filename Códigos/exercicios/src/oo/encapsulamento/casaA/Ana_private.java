package oo.encapsulamento.casaA;

public class Ana_private {

	@SuppressWarnings("unused")
	private String segredo = "recusou oportunidade de emprego em outro país por receio.";
	String fazEmCasa = "toma banho com a porta do banheiro aberta"; //defaulf ou package
	protected String herancaFamilia = "faz multiplas funções ao mesmo tempo";
	public String todosSabem = "não ingere bebidas alcoolicas";
	
	Ana_private eu = new Ana_private();
	
	void acessos() {
		System.out.println(eu.segredo);
		System.out.println(eu.fazEmCasa);
		System.out.println(eu.herancaFamilia);
		System.out.println(eu.todosSabem);
	}
	
}
