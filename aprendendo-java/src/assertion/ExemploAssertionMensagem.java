package assertion;

public class ExemploAssertionMensagem {
	public static void main(String[] args) {
		
		int saldo = -100;
		assert saldo >= 0 : "O saldo não pode ser negativo";

		System.out.println("Código continua a execução após a assertiva.");
	}
}

/* Assertiva com Mensagem Personalizada
 * Neste exemplo, a assertiva verifica se o saldo é maior ou igual a zero. Se a expressão for false, a mensagem personalizada será exibida como parte da 
 * exceção AssertionError. */
