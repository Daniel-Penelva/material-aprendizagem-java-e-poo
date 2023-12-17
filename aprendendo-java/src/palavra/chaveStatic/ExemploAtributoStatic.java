package palavra.chaveStatic;

public class ExemploAtributoStatic {
	
	static int contador = 0; // Vari�vel est�tica

	public static void main(String[] args) {
		
		System.out.println("Contador inicial: " + ExemploAtributoStatic.contador); // Acesso � vari�vel est�tica diretamente pela classe

		// Criando inst�ncias da classe
		ExemploAtributoStatic obj1 = new ExemploAtributoStatic();
		ExemploAtributoStatic obj2 = new ExemploAtributoStatic();

		obj1.incrementarContador(); // Incrementando o contador atrav�s de uma inst�ncia
		System.out.println("Contador ap�s incremento: " + ExemploAtributoStatic.contador); // Acesso � vari�vel est�tica pela classe ap�s a modifica��o

		
		obj2.incrementarContador(); // Incrementando o contador atrav�s de outra inst�ncia
		System.out.println("Contador final: " + ExemploAtributoStatic.contador); // Acesso � vari�vel est�tica pela classe novamente
	}

	// M�todo est�tico para incrementar o contador
	static void incrementarContador() {
		contador++;
	}
}
