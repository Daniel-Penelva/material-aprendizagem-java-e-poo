package assertion;

public class Exemplo1Assertion {
	public static void main(String[] args) {
		
		int idade = 17;
		assert idade >= 18 : "A idade deve ser maior ou igual a 18";

		System.out.println("C�digo continua a execu��o ap�s a assertiva.");
	}
}

/* Assertiva Simples
 * Neste exemplo, a assertiva verifica se a idade � maior ou igual a 18. Se a express�o for false, uma exce��o AssertionError ser� lan�ada.*/
