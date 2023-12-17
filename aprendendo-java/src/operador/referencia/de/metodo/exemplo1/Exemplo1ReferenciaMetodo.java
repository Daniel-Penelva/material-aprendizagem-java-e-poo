package operador.referencia.de.metodo.exemplo1;

public class Exemplo1ReferenciaMetodo {

	public static void main(String[] args) {

		// Usando refer�ncia a m�todo est�tico
		//Operador de referencia - S�o tr�s etapas:
		//1� - o Tipo | 2� o operador de refer�ncia :: | 3� o nome do m�todo que quer chamar sem os par�nteses
		Operacao operacao = Calculadora::somar;
		
        // Operacao operacao = (a, b) -> Calculadora.somar(a, b); // Exemplificando se usasse uma express�o lambda para implementar a interface funcional
		
		int resultado = operacao.executar(5, 3);
		System.out.println("Resultado: " + resultado);
	}

}

class Calculadora {
	static int somar(int a, int b) {
		return a + b;
	}
}

//Interface funcional com um m�todo
interface Operacao {
	int executar(int a, int b);
}