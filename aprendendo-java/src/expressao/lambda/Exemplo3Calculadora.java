package expressao.lambda;

public class Exemplo3Calculadora {

	public static void main(String[] args) {
		
		// Definindo as operações usando expressões lambda
		Operacao adicao = (x, y) -> x + y;
		Operacao subtracao = (x, y) -> x - y;
		Operacao multiplicacao = (x, y) -> x * y;
		Operacao divisao = (x, y) -> x / y;

		// Exemplos de uso
		System.out.println("Soma: " + calcular(adicao, 5, 3));
		System.out.println("Subtração: " + calcular(subtracao, 10, 4));
		System.out.println("Multiplicação: " + calcular(multiplicacao, 6, 7));
		System.out.println("Divisão: " + calcular(divisao, 15, 3));
	}
	
	interface Operacao {
		double calcular(double x, double y);
	}

	// Método que utiliza a interface Operacao para realizar cálculos
	private static double calcular(Operacao operacao, double x, double y) {
		return operacao.calcular(x, y);
	}
}
