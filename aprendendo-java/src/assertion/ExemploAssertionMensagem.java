package assertion;

public class ExemploAssertionMensagem {
	public static void main(String[] args) {
		
		int saldo = -100;
		assert saldo >= 0 : "O saldo n�o pode ser negativo";

		System.out.println("C�digo continua a execu��o ap�s a assertiva.");
	}
}

/* Assertiva com Mensagem Personalizada
 * Neste exemplo, a assertiva verifica se o saldo � maior ou igual a zero. Se a express�o for false, a mensagem personalizada ser� exibida como parte da 
 * exce��o AssertionError. */
