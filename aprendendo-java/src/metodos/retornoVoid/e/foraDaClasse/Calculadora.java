package metodos.retornoVoid.e.foraDaClasse;

public class Calculadora {

	public void somar(int num1, int num2) {
		
		System.out.println("Soma: " + (num1 + num2));
	}

	public void subtrair(int num1, int num2) {
		
		System.out.println("Subtração: " + (num1 - num2));
	}

	public void multiplicar(float num1, float num2) {
		
		System.out.println("Multiplicação: " + (num1 * num2));
	}

	public void dividir(float num1, float num2) {

		if (num2 == 0)
			System.out.println("Não é possível dividir com o denominador igual a zero!!!");
		else {
			System.out.println("Divisão: " + (num1 / num2));
		}

	}
}
