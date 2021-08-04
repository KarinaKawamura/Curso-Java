
package controle;

public class DesafioFor {

	public static void main(String[] args) {

		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!
		
		//versão Marcos
		/*String hashtag = "#";
		
		for (hashtag = "#"; hashtag.equals("#"); hashtag = "#####") {
			System.out.println(hashtag);
			for (hashtag = "##"; hashtag.equals("##"); hashtag = "#####") {
				System.out.println(hashtag);
				for (hashtag = "###"; hashtag.equals("###"); hashtag = "#####") {
					System.out.println(hashtag);
					for (hashtag = "####"; hashtag.equals("####"); hashtag = "#####") {
						System.out.println(hashtag);
					
					}

				}

			}
			
		}

		System.out.println(hashtag);*/
		
		//Versão curso
		for (String hashtag = "#"; !hashtag.equals("######"); hashtag += "#") {
			System.out.println(hashtag);
			//hashtag += "#";
		}

	}

}