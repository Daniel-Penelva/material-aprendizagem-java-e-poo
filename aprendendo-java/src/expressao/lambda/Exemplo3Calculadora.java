package expressao.lambda;

public class Exemplo3Calculadora {

	public static void main(String[] args) {
		
		// Definindo as opera��es usando express�es lambda
		Operacao adicao = (x, y) -> x + y;
		Operacao subtracao = (x, y) -> x - y;
		Operacao multiplicacao = (x, y) -> x * y;
		Operacao divisao = (x, y) -> x / y;

		// Exemplos de uso
		System.out.println("Soma: " + calcular(adicao, 5, 3));
		System.out.println("Subtra��o: " + calcular(subtracao, 10, 4));
		System.out.println("Multiplica��o: " + calcular(multiplicacao, 6, 7));
		System.out.println("Divis�o: " + calcular(divisao, 15, 3));
	}
	
	interface Operacao {
		double calcular(double x, double y);
	}

	// M�todo que utiliza a interface Operacao para realizar c�lculos
	private static double calcular(Operacao operacao, double x, double y) {
		return operacao.calcular(x, y);
	}
}
