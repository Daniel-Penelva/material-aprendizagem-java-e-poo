package exception.exemplo2.usandoThrows;

public class ExemploThrowsUnchecked {
    
	public static void main(String[] args) {
        
		try {
            dividir(10, 0);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        
    	if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return numerador / denominador;
    }
}

/* Método com throws para Exceção Não Checada
 * Neste exemplo, o método dividir declara que pode lançar uma exceção do tipo ArithmeticException. Essa exceção é lançada explicitamente se a condição de 
 * divisão por zero for atendida.*/
 