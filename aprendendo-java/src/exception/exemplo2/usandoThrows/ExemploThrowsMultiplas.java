package exception.exemplo2.usandoThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploThrowsMultiplas {
	
	public static void main(String[] args) {
		try {
			operacaoComExcecoes();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
			
		} catch (IOException e) {
			System.out.println("Erro de I/O: " + e.getMessage());
		}
	}

	public static void operacaoComExcecoes() throws FileNotFoundException, IOException {
		// Código com potencial de lançar FileNotFoundException ou IOException
	}
}

/* Método com throws para Exceções Múltiplas
 * Este exemplo mostra um método que declara que pode lançar mais de um tipo de exceção. O código que chama esse método precisa lidar com cada tipo de 
 * exceção separadamente.
 * */
