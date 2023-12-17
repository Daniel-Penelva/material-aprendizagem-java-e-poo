package basico;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		 * Exemplo 
		 * do ... while(){} - testa a execução no final - esta estrutura é executada 1 ou n vezes - OBS. Se number for igual 5, o que acontece? o programa 
		 * vai executar o number 5, mas quando for para o while não vai executar e para a condição. O do...while(){} vai ser executado pelo menos uma vez.
		 */

		int number = 5;
		do {
			System.out.println(number);
			number++;

		} while (number <= 5);

		System.out.println("número: " + number);
		System.out.println("\n\n");

	}

}
