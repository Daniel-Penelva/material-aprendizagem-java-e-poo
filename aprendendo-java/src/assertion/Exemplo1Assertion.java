package assertion;

public class Exemplo1Assertion {
	public static void main(String[] args) {
		
		int idade = 17;
		assert idade >= 18 : "A idade deve ser maior ou igual a 18";

		System.out.println("Código continua a execução após a assertiva.");
	}
}

/* Assertiva Simples
 * Neste exemplo, a assertiva verifica se a idade é maior ou igual a 18. Se a expressão for false, uma exceção AssertionError será lançada.*/
