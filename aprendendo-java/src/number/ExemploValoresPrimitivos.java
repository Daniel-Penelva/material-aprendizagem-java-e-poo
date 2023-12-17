package number;

public class ExemploValoresPrimitivos {
	public static void main(String[] args) {
		
		// Obtendo valores primitivos a partir de números
		Number numeroInteiro = Integer.valueOf(42);
		int valorInteiro = numeroInteiro.intValue();
		System.out.println("Valor Inteiro: " + valorInteiro);

		Number numeroDecimal = Double.valueOf(3.14);
		double valorDecimal = numeroDecimal.doubleValue();
		System.out.println("Valor Decimal: " + valorDecimal);
	}
}
