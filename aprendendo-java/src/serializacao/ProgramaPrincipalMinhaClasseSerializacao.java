package serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProgramaPrincipalMinhaClasseSerializacao {

	public static void main(String[] args) {
		
		/**Utilize ObjectOutputStream para escrever o objeto serializado em uma fonte de saída, como um arquivo ou um fluxo de rede.*/
		
		MinhaClasseSerializacao objetoParaSerializar = new MinhaClasseSerializacao();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivo_serializado.ser"))) { //ESCRITA DE OBJETO - repare que a extenção é ".ser" para indicar que é um obj. serializado
			
			oos.writeObject(objetoParaSerializar);
			System.out.println("Objeto serializado com sucesso.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
