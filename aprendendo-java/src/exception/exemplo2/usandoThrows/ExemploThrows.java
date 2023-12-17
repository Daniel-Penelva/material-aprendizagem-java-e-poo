package exception.exemplo2.usandoThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {
	public static void main(String[] args) {
		
		try {
			lerArquivo("arquivo.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		}
	}

	public static void lerArquivo(String nomeArquivo) throws FileNotFoundException {
		FileReader arquivo = new FileReader(nomeArquivo);
		// Código para ler o arquivo
	}
}
/* Método com throws para Exceção Checada
 * Neste exemplo, o método lerArquivo declara que ele pode lançar uma exceção do tipo FileNotFoundException. O código que chama esse método no método main 
 * deve lidar com essa exceção ou declarar que também pode lançá-la.*/
