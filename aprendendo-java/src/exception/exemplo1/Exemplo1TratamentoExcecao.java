package exception.exemplo1;

public class Exemplo1TratamentoExcecao {
	
	public static void main(String[] args) {
		
		try {
			int resultado = divide(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro aritmético: " + e.getMessage());
		}
	}

	public static int divide(int numerador, int denominador) {
		return numerador / denominador;
	}
}

/* Tratamento de Exceções Básico
 * Neste exemplo, a divisão por zero gera uma exceção ArithmeticException. Essa exceção é capturada no bloco catch, onde uma mensagem de erro é exibida.*/
