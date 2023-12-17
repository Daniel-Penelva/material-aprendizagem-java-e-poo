package basico;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		/* for(inicialização; teste; atualização) */

		/* Exemplo 1 */
		System.out.println("Exemplo 1");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		/* Exemplo 2 */
		System.out.println("Exemplo 2");
		String texto = "";

		for (int j = 0; j < 9; j++) {
			texto += j; // texto = texto + j
		}

		System.out.println(texto);

		/* Exemplo 3 */
		System.out.println("Exemplo 3");
		String escrito = "";

		for (int w = 0; w < 9; w++) {
			if ((w % 2) == 0) {
				escrito += w + ", ";
			}
		}

		System.out.println(escrito);

		/* Exemplo 4 */
		System.out.println("Exemplo 4");
		int tamanho = 5;

		for (int x = 0; x < tamanho; x++) {
			System.out.println("* ");
		}

		/* Exemplo 5 */
		System.out.println("Exemplo 5");
		int tam = 5;

		for (int a = 0; a < tam; a++) {
			for (int z = 0; z < tam; z++) {
				System.out.println("# ");
			}
			System.out.println(); // com quebra de linha: print + ln() .... sem quebra de linha: print()
		}

		/* Exemplo 6 */
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor? ");
		int valor = s.nextInt();

		System.out.println("Tabuada de " + valor + '\n');
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + valor * i);
		}
	}

}
