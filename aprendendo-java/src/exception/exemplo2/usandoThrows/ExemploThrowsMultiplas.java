package exception.exemplo2.usandoThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploThrowsMultiplas {
	
	public static void main(String[] args) {
		try {
			operacaoComExcecoes();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado: " + e.getMessage());
			
		} catch (IOException e) {
			System.out.println("Erro de I/O: " + e.getMessage());
		}
	}

	public static void operacaoComExcecoes() throws FileNotFoundException, IOException {
		// C�digo com potencial de lan�ar FileNotFoundException ou IOException
	}
}

/* M�todo com throws para Exce��es M�ltiplas
 * Este exemplo mostra um m�todo que declara que pode lan�ar mais de um tipo de exce��o. O c�digo que chama esse m�todo precisa lidar com cada tipo de 
 * exce��o separadamente.
 * */
