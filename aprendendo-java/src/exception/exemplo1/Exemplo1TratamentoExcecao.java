package exception.exemplo1;

public class Exemplo1TratamentoExcecao {
	
	public static void main(String[] args) {
		
		try {
			int resultado = divide(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro aritm�tico: " + e.getMessage());
		}
	}

	public static int divide(int numerador, int denominador) {
		return numerador / denominador;
	}
}

/* Tratamento de Exce��es B�sico
 * Neste exemplo, a divis�o por zero gera uma exce��o ArithmeticException. Essa exce��o � capturada no bloco catch, onde uma mensagem de erro � exibida.*/
