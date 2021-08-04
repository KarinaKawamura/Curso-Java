package classe.equalsHashcode;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Karina Kawamura";
		u1.email = "kawamurakw@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Karina Kawamura";
		u2.email = "kawamurakw@gmail.com";
		
		System.out.println(u1 == u2); //compara endereço de memória 
		System.out.println(u1.equals(u2)); //compafra somente após a função 
		System.out.println(u2.equals(u1)); 
		
		
		
		
		
		
	}

}
