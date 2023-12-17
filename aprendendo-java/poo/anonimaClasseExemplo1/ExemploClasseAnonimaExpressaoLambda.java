package anonimaClasseExemplo1;

//Interface funcional (com apenas um método abstrato)
interface Operacao {
	int calcular(int a, int b);
}

public class ExemploClasseAnonimaExpressaoLambda {

	public static void main(String[] args) {
        
		// Uso de classe anônima usando uma expressão lambda
        Operacao soma = (a, b) -> a + b; 
        Operacao subtracao = (a, b) -> a - b; 

        // Chamada do método da interface funcional
        int resultadoSoma = soma.calcular(5, 3);
        int resultadoSubtracao = subtracao.calcular(4, 2);
        
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da soma: " + resultadoSubtracao);
    }

}

/** Neste exemplo, a interface funcional Operacao é implementada usando uma classe anônima criada através de uma expressão lambda. */