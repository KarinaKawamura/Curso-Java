package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		//Wrapper
		Integer num1 = 10000;
		//System.out.println(num1.length()); //não conta caracteres de num
		System.out.println(num1.toString().length());
		
		//declara como primitivo e transforma em Wrap depois
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//outro método
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());

	}

}
