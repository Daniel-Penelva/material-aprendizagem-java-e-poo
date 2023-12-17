package transiente.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ProgramaPrincipalContaSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			String[] nome = {"Daniel", "Biana", "Walter"};
			
	
			/** PROCESSO DE ESCRITA DESSE OBJETO (ObjectOutputStream) */
			
			FileOutputStream fos = new FileOutputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser"); //ESCRITA DE OBJETO - repare que a extenção é "ser" para indicar que é um obj. serializado
	
			ObjectOutputStream oos = new ObjectOutputStream(fos); //esta classe utiliza um file outPutStream para realizar as operações de escrita do objeto numa fonte de saída

			oos.writeObject(nome);	// escreve o objeto ois
	
			oos.close(); //depois de salvar esse objeto, é preciso fechar essa conexão
			
	       /** PROCESSO DE LEITURA DESSE OBJETO (ObjectInputStream) */
	
			FileInputStream fis = new FileInputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser"); 
			
			ObjectInputStream ois = new ObjectInputStream(fis); // ObjectInputStream para ler o objeto serializado de uma fonte de entrada.
			
			String[] listaNomes = (String[])ois.readObject(); // lê o objeto ois
			ois.close();
			
			System.out.println(Arrays.toString(listaNomes));
			
	      /* -------------------------------------------------------------------------------------- */
				
			ContaSerializable conta1 = new ContaSerializable("Daniel",111_222_333.444);
			ContaSerializable conta2 = new ContaSerializable("Biana",111_222_333.444);
			
			FileOutputStream fos1 = new FileOutputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser");
			ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
			
			oos1.writeObject(conta1);
			oos1.writeObject(conta2);
			oos1.close();
			
			FileInputStream fis1 = new FileInputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser");
			ObjectInputStream ois1 = new ObjectInputStream(fis1);
			
			ContaSerializable c1 = (ContaSerializable)ois1.readObject();
			ContaSerializable c2 = (ContaSerializable)ois1.readObject();
			ois1.close();
			
			c1.exibeSaldo();
			c2.exibeSaldo();
	}
}
