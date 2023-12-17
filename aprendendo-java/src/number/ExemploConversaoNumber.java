package number;

public class ExemploConversaoNumber {
	public static void main(String[] args) {
		
		// Convertendo Integer para Double
		Number numeroInteiro = Integer.valueOf(42);
		Double numeroDouble = numeroInteiro.doubleValue();
		System.out.println("Número Double: " + numeroDouble);

		// Convertendo Double para Integer
		Double numeroDecimal = Double.valueOf(3.14);
		Integer numeroInteiroNovo = numeroDecimal.intValue();
		System.out.println("Número Inteiro: " + numeroInteiroNovo);
	}
}
