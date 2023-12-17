package exception.exemplo2.usandoThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {
	public static void main(String[] args) {
		
		try {
			lerArquivo("arquivo.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado: " + e.getMessage());
		}
	}

	public static void lerArquivo(String nomeArquivo) throws FileNotFoundException {
		FileReader arquivo = new FileReader(nomeArquivo);
		// C�digo para ler o arquivo
	}
}
/* M�todo com throws para Exce��o Checada
 * Neste exemplo, o m�todo lerArquivo declara que ele pode lan�ar uma exce��o do tipo FileNotFoundException. O c�digo que chama esse m�todo no m�todo main 
 * deve lidar com essa exce��o ou declarar que tamb�m pode lan��-la.*/
