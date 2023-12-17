package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFileSystems {

	public static void main(String[] args) throws IOException {
		
		/** LISTAR O CONTEUDO RAIZ */
		
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories(); // recupera os diretorios raiz do meu computador
		
		for (Path p : dirs) {
			System.out.println(p);
		}

		System.out.println("<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		/** LISTAR O CONTEUDO DO DIRET�RIO */
	
		Path diretorio = Paths.get("C:/");


		try (DirectoryStream<Path> ds = Files.newDirectoryStream(diretorio)) { // recupera um stream de diret�rio - vai retornar um objeto do tipo Directory stream
			
			for (Path path : ds) {
				System.out.println(path.getFileName());
			}
			
		} catch (IOException | DirectoryIteratorException evento) {
			evento.printStackTrace();
		}

		System.out.println("<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		
		/** LISTAR PARTI��ES */
		
		FileSystem fs = FileSystems.getDefault(); // imprimi as unidades de armazenamento, por exemplo, C://
		
/** Dentro do fileSystem pode recuperar as unidade de armazenamento atrav�s de m�todo getFileStores() retornando iterable(que � um objeto que se pode 
 * interar, percorrendo com um "for" por exemplo) */
		
		for (FileStore st : fs.getFileStores()) {
			
			System.out.println("Unidade: " + st.toString());

			System.out.println("Total: " + st.getTotalSpace()); //cada uma das unidade tem um total de espa�o dispon�vel em bytes - lan�a uma exce��o(throws IOException)
			
			System.out.println("Espa�o Dispon�vel: " + st.getUsableSpace()); // total disponivel de espa�o

			System.out.println("Quantidade utilizada: " + (st.getTotalSpace() - st.getUsableSpace())); // quantidade total de espa�o utilizada
		}

	}

}
