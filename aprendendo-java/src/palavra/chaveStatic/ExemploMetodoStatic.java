package palavra.chaveStatic;

public class ExemploMetodoStatic {

	public static void main(String[] args) {
		
		int resultado1 = ExemploMetodoStatic.somar(5, 3); // Chamada do método estático diretamente pela classe
		System.out.println("Resultado da soma: " + resultado1);
		
		int resultado2 = ExemploMetodoStatic.somar(10, 5); // Chamada do método estático diretamente pela classe
		System.out.println("Resultado da soma: " + resultado2);
		
	}

	// Método estático para somar dois números
	static int somar(int a, int b) {
		return a + b;
	}
}