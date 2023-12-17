package anonimaClasseExemplo1;

//Interface funcional (com apenas um m�todo abstrato)
interface Operacao {
	int calcular(int a, int b);
}

public class ExemploClasseAnonimaExpressaoLambda {

	public static void main(String[] args) {
        
		// Uso de classe an�nima usando uma express�o lambda
        Operacao soma = (a, b) -> a + b; 
        Operacao subtracao = (a, b) -> a - b; 

        // Chamada do m�todo da interface funcional
        int resultadoSoma = soma.calcular(5, 3);
        int resultadoSubtracao = subtracao.calcular(4, 2);
        
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da soma: " + resultadoSubtracao);
    }

}

/** Neste exemplo, a interface funcional Operacao � implementada usando uma classe an�nima criada atrav�s de uma express�o lambda. */