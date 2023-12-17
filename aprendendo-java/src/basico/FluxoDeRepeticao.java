package basico;

public class FluxoDeRepeticao {

	public static void main(String[] args) {
		
		/*
		 * Fluxo de Repetição:
		 *  - break 
		 *  - continue
		 */

		System.out.println("\nExemplo de break\n");
		
		/* Exemplo 1 - quebrando loop infinito com o break */
		while (true) {
			System.out.println("Entrou");
			break;
		}

		
		/* Exemplo 2 */
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("\nExemplo de continue\n");
		
		/* Exemplo 3 - continua a interação quando se iguala ao valor 5 */
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("\nRótulos\n");
		// rótulos = são nomes que pode dar para as estruturas para seus fluxos.

		boolean matriz[][] = { 
				{ false, true, false, false, false }, 
				{ false, false, false, false, false }
		};

		busca: // rotulo - para paralisar o fluxo externo do for "a"
		for (int a = 0; a < matriz.length; a++) {
			System.out.println("A ");
			for (int b = 0; b < matriz[a].length; b++) {
				if (matriz[a][b]) {
					System.out.println("TRUE ");
					break busca; // vai quebrar o fluxo interno do for "b".Para isso tera somente um break;
				}

				System.out.println("B ");
			}
		}

	}
}
