package basico;

import java.util.Random;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		/*
		 * Exemplo 1 - Switch -compara o valor recebido com os casos previstos no seu
		 * bloco, �til para avaliar se o valor � igual a outros
		 */
		char sexo = 'M';

		switch (sexo) {
		case 'M':
			System.out.println("Sexo Masculino.");
			break;

		case 'F':
			System.out.println("Sexo Feminino.");
			break;

		default:
			System.out.println("Op��o Inv�lida.");

		}

		/* Exemplo 2 */

		String tecnologia = "oracle";

		switch (tecnologia) {
		case "java":
		case "C++":
		case "cobol":
			System.out.println("Linguagem de programa��o");
			break;

		case "oracle":
		case "sqlServer":
		case "postegresql":
			System.out.println("Banco de dados");
			break;

		default:
			System.out.println("Linguagem de programa��o n�o existe");

		}

		/* Exemplo 3 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a op��o: ");
		System.out.println("1. Programador");
		System.out.println("2. Analista de Banco de Dados");
		System.out.println("3. Analista de Sistema");
		System.out.println("4. Equipe de Teste");
		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Voc� � um programador");
			break;

		case 2:
			System.out.println("Voc� � um Analista de Banco de Dados");
			break;

		case 3:
			System.out.println("Voc� � um Analista de Sistema");
			break;

		case 4:
			System.out.println("Voc� est� na Equipe de Teste");
			break;

		default:
			System.out.println("Op��o incorreta!");
			break;
		}

		/* Exemplo 4 */

		@SuppressWarnings("unused")
		boolean responda = true;

		System.out.println("Escolha a op��o: ");
		System.out.println("1.jogar");
		System.out.println("2.Sair");
		int jogar = scanner.nextInt();

		switch (jogar) {

		case 1:
			System.out.println("Joga o dado (Entre 1 at� 6): ");
			int palpite = scanner.nextInt();

			if(palpite <= 6) {
			
				Random n = new Random(); // m�todo Random() - gera um valor aleat�rio
	
				/* Vai buscar seis n�meros aleat�rios, por�m importante saber que come�a com o indice 0, portanto, coloca-se mais um, ou seja, 
				 * o valor zero fica sendo (0+1) = 1 e o valor 5 fica sendo (5+1) = 6 */
				int dado = n.nextInt(6) + 1;
	
				if (palpite == dado) {
					System.out.println("Voc� acertou!");
	
				} else {
					System.out.println("Vc erro!");
	
				}
	
				System.out.println("Seu palpite: " + palpite);
				System.out.println("Valor do dado: " + dado);
				
			}else {
				System.out.println("Este valor n�o existe no dado");
			}

		case 2:
			responda = false;
			break;

		}
	}

}
