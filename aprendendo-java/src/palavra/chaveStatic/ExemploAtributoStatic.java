package palavra.chaveStatic;

public class ExemploAtributoStatic {
	
	static int contador = 0; // Variável estática

	public static void main(String[] args) {
		
		System.out.println("Contador inicial: " + ExemploAtributoStatic.contador); // Acesso à variável estática diretamente pela classe

		// Criando instâncias da classe
		ExemploAtributoStatic obj1 = new ExemploAtributoStatic();
		ExemploAtributoStatic obj2 = new ExemploAtributoStatic();

		obj1.incrementarContador(); // Incrementando o contador através de uma instância
		System.out.println("Contador após incremento: " + ExemploAtributoStatic.contador); // Acesso à variável estática pela classe após a modificação

		
		obj2.incrementarContador(); // Incrementando o contador através de outra instância
		System.out.println("Contador final: " + ExemploAtributoStatic.contador); // Acesso à variável estática pela classe novamente
	}

	// Método estático para incrementar o contador
	static void incrementarContador() {
		contador++;
	}
}
