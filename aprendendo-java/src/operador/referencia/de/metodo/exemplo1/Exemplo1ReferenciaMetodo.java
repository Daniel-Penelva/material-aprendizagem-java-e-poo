package operador.referencia.de.metodo.exemplo1;

public class Exemplo1ReferenciaMetodo {

	public static void main(String[] args) {

		// Usando referência a método estático
		//Operador de referencia - São três etapas:
		//1º - o Tipo | 2º o operador de referência :: | 3º o nome do método que quer chamar sem os parênteses
		Operacao operacao = Calculadora::somar;
		
        // Operacao operacao = (a, b) -> Calculadora.somar(a, b); // Exemplificando se usasse uma expressão lambda para implementar a interface funcional
		
		int resultado = operacao.executar(5, 3);
		System.out.println("Resultado: " + resultado);
	}

}

class Calculadora {
	static int somar(int a, int b) {
		return a + b;
	}
}

//Interface funcional com um método
interface Operacao {
	int executar(int a, int b);
}