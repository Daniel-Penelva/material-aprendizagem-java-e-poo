package metodos.retornoVoid.e.foraDaClasse;

public class Calculadora {

	public void somar(int num1, int num2) {
		
		System.out.println("Soma: " + (num1 + num2));
	}

	public void subtrair(int num1, int num2) {
		
		System.out.println("Subtra��o: " + (num1 - num2));
	}

	public void multiplicar(float num1, float num2) {
		
		System.out.println("Multiplica��o: " + (num1 * num2));
	}

	public void dividir(float num1, float num2) {

		if (num2 == 0)
			System.out.println("N�o � poss�vel dividir com o denominador igual a zero!!!");
		else {
			System.out.println("Divis�o: " + (num1 / num2));
		}

	}
}
