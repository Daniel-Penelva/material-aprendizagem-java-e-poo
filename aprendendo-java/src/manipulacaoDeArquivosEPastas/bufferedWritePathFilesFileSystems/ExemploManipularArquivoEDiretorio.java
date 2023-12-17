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

		System.out.println("Caminho do diretório: " + Files.isDirectory(path)); // Se esse caminho é um diretorio?

		System.out.println("Se o arquivo é regular: " + Files.isRegularFile(path)); // Se é um arquivo regular(texto, imagem)?

		System.out.println("Se tem permissão: " + Files.isReadable(path)); // Se o arquivo tem permissão para ser lido? 

		System.out.println("Se o arquivo é executável: " + Files.isExecutable(path)); // se o arquivo é executavel?

		System.out.println("Tamanho do arquivo: " + Files.size(path)); // verifica o tamanho do arquivo? - gera exception IOException

		
		System.out.println("Retorna informação da última modificação: " + Files.getLastModifiedTime(path)); // retorna a ultima vez que o arquivo foi modificado

		
		System.out.println("Dono do arquivo: " + Files.getOwner(path)); // retorna o dono do arquivo, que neste caso é o administrador do computador

		
		System.out.println("Tipo do arquivo: " + Files.probeContentType(path)); // procura o tipo de arquivo que estamos procurando, podendo ser texto, video, audio, outros

		/** EXCLUSÃO DE ARQUIVO: 

		* Delete - Exclusão de arquivos São definidos dois métodos para exclusão:
		* 
		* 	-> Files.delete(path) 
		*      Tenta a exclusão, mas se alguma coisa acontecer de errado ele vai lançar as suas excessões, que são:
		*      	 . NoSuchFileException - tentando deletar um arquivo que não existe 
		*        . DirectoryNotEmptyException - só deleta o diretorio se tiver vazio.
		*        . IOException - outras situações
		*        . SecurityException - outras situações
		*        
		*   -> Files.deleteIfExists(path) - só deleta o arquivo se ele realmente existir e se não conseguir, ele não lança nenhuma exceção
		*   
		*   COMANDO DE DELETE ABAIXO: 
		**/
		
		//Files.delete(path);
		//Files.deleteIfExists(path);

		
		/** CRIAR ARQUIVO */
		
		try {
            Path p = Paths.get("C://Users//d4nan//Documents//gerando arquivo/arquivoBranco.txt");

            // Cria o arquivo se não existir, ou substitui o conteúdo se já existir
            Files.write(p, "Meu texto".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            
            System.out.println("Arquivo criado e texto escrito com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		/** COPIAR ARQUIVO e MOVER ARQUIVO */
		
		try {
            Path original = Paths.get("C://Users//d4nan//Documents//gerando arquivo/arquivoOriginal.txt");

            // Cria o arquivo se não existir, ou substitui o conteúdo se já existir
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
