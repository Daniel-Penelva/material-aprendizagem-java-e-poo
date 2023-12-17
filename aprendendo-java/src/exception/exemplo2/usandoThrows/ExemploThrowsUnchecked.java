package exception.exemplo2.usandoThrows;

public class ExemploThrowsUnchecked {
    
	public static void main(String[] args) {
        
		try {
            dividir(10, 0);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro aritm�tico: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        
    	if (denominador == 0) {
            throw new ArithmeticException("Divis�o por zero");
        }
        return numerador / denominador;
    }
}

/* M�todo com throws para Exce��o N�o Checada
 * Neste exemplo, o m�todo dividir declara que pode lan�ar uma exce��o do tipo ArithmeticException. Essa exce��o � lan�ada explicitamente se a condi��o de 
 * divis�o por zero for atendida.*/
 