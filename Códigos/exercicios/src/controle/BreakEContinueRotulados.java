package controle;

public class BreakEContinueRotulados {

	public static void main(String[] args) {

		// exemplo 1 - continue
		externo: for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 3) {
					System.out.println();
					continue externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!\n\n");

		//exemplo 2 - break
		externo: for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == 3) {
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");

	}

}
