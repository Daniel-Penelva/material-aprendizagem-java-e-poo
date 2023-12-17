package serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProgramaPrincipalMinhaClasseDeserializacao {

	public static void main(String[] args) {
		
		/** Utilize ObjectInputStream para ler o objeto serializado de uma fonte de entrada.*/
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivo_serializado.ser"))) { //ESCRITA DE OBJETO - repare que a extenção é ".ser" para indicar que é um obj. serializado
			
			MinhaClasseSerializacao objetoDesserializado = (MinhaClasseSerializacao) ois.readObject();
			System.out.println("Objeto desserializado com sucesso.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
