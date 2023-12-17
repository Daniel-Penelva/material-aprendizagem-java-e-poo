package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class ExemploManipularArquivoEDiretorio {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C://Users//d4nan//Documents//gerando arquivo/teste.txt");
		
		System.out.println("Se o arquivo existe: " + Files.exists(path)); // Se existe o caminho do arquivo?

		System.out.println("Caminho do diret�rio: " + Files.isDirectory(path)); // Se esse caminho � um diretorio?

		System.out.println("Se o arquivo � regular: " + Files.isRegularFile(path)); // Se � um arquivo regular(texto, imagem)?

		System.out.println("Se tem permiss�o: " + Files.isReadable(path)); // Se o arquivo tem permiss�o para ser lido? 

		System.out.println("Se o arquivo � execut�vel: " + Files.isExecutable(path)); // se o arquivo � executavel?

		System.out.println("Tamanho do arquivo: " + Files.size(path)); // verifica o tamanho do arquivo? - gera exception IOException

		
		System.out.println("Retorna informa��o da �ltima modifica��o: " + Files.getLastModifiedTime(path)); // retorna a ultima vez que o arquivo foi modificado

		
		System.out.println("Dono do arquivo: " + Files.getOwner(path)); // retorna o dono do arquivo, que neste caso � o administrador do computador

		
		System.out.println("Tipo do arquivo: " + Files.probeContentType(path)); // procura o tipo de arquivo que estamos procurando, podendo ser texto, video, audio, outros

		/** EXCLUS�O DE ARQUIVO: 

		* Delete - Exclus�o de arquivos S�o definidos dois m�todos para exclus�o:
		* 
		* 	-> Files.delete(path) 
		*      Tenta a exclus�o, mas se alguma coisa acontecer de errado ele vai lan�ar as suas excess�es, que s�o:
		*      	 . NoSuchFileException - tentando deletar um arquivo que n�o existe 
		*        . DirectoryNotEmptyException - s� deleta o diretorio se tiver vazio.
		*        . IOException - outras situa��es
		*        . SecurityException - outras situa��es
		*        
		*   -> Files.deleteIfExists(path) - s� deleta o arquivo se ele realmente existir e se n�o conseguir, ele n�o lan�a nenhuma exce��o
		*   
		*   COMANDO DE DELETE ABAIXO: 
		**/
		
		//Files.delete(path);
		//Files.deleteIfExists(path);

		
		/** CRIAR ARQUIVO */
		
		try {
            Path p = Paths.get("C://Users//d4nan//Documents//gerando arquivo/arquivoBranco.txt");

            // Cria o arquivo se n�o existir, ou substitui o conte�do se j� existir
            Files.write(p, "Meu texto".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            
            System.out.println("Arquivo criado e texto escrito com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		/** COPIAR ARQUIVO e MOVER ARQUIVO */
		
		try {
            Path original = Paths.get("C://Users//d4nan//Documents//gerando arquivo/arquivoOriginal.txt");

            // Cria o arquivo se n�o existir, ou substitui o conte�do se j� existir
            Files.write(original, "Meu texto".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            
            Path copia = Paths.get("C://Users//d4nan//Documents//gerando arquivo/copiaArquivoTexto.txt");
            
            Files.copy(original, copia, StandardCopyOption.REPLACE_EXISTING); // copiando arquivo
            
            System.out.println("Arquivo criado e texto escrito com sucesso.");
            
            
            /** MOVER ARQUIVO 
    		 * A copia tem que esta em um outra fonte de destino*/
    		
    		Path mover = Paths.get("C://Users//d4nan//Documents//destino");
    		Files.createDirectories(mover.getParent());
    		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);
    		
    		System.out.println("Arquivo movido com sucesso!!!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
