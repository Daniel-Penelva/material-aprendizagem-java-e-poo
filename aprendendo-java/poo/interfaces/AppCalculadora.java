package interfaces;

public class AppCalculadora implements Calculadora{

	@Override
	public double somar(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	@Override
	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	@Override
	public double dividir(double n1, double n2) {
		
		if(n2 == 0) {
			System.out.println("Não existe divisão por zero");
			return 0;
		}
		
		return n1 / n2;
	}

}
