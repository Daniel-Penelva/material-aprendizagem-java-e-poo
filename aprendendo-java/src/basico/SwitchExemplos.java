package basico;

public class SwitchExemplos {

	public static void main(String[] args) {

		/* Exemplo 1 */
		int valor = 2;

		String resultado = switch (valor) {
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> "Three";
		default -> "valor inválido";
		};

		System.out.println("Resultado: " + resultado);

		/* Exemplo 2 */
		String cor = "Azul";

		String resultadoCor = switch (cor) {
		case "Verde" -> "Cor Verde";
		case "Azul" -> "Cor Azul";
		case "Amarelo" -> "Cor amarelo";
		default -> "valor inválido";
		};

		System.out.println("Resultado: " + resultadoCor);

		
		/* Exemplo 3 */
		
		int value = 4;
		boolean result = switch (value) {
		case 1, 2, 3 -> true;
		case 4, 5, 6 -> false;
		default -> throw new IllegalArgumentException("Invalid value: " + value);
		};
		System.out.println(result);

	}

}
