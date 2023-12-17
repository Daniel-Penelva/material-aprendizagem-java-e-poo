package metodos.comRetorno.e.foraDaClasse;

public class Calculadora {

	public int somar(int num1, int num2) {
		int soma;
		soma = num1 + num2;
		return soma;
	}

	public int subtrair(int num1, int num2) {

		return num1 - num2;
	}

	public float multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public double dividir(int num1, int num2) {

		try {

			return num1 / num2;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
