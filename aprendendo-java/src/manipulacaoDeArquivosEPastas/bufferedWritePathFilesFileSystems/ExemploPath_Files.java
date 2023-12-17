package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath_Files {

	public static void main(String[] args) throws IOException {
		
/**
* Arquivos ou diret�rios tem um caminho ou um endere�o, e existe uma classe java que defini esse caminho ou manipula esse caminho, que 
* � chamado de Path(caminho) e atrav�s do m�todo get()recebe uma string ou uma url. Atrav�s deste m�todo � possivel informa a dire��o
* ou o endere�o do arquivo que vc queira manipular. */
			
			
			   Path path = Paths.get("C://Users//d4nan//Documents//gerando arquivo/teste.txt"); // Path define o caminho da pasta e do arquivo.txt
			
				System.out.println(path.toAbsolutePath()); // m�todo - toAbsolutePath() - retorna o caminho absoluto do arquivo.
			
				System.out.println(path.getParent()); // m�todo - getParent() - podemos ver o arquivo pai deste diretorio
			
				System.out.println(path.getRoot()); // m�todo - getRoot() - a raiz do sistema
			
				System.out.println(path.getFileName()); //m�todo - getFileName() - o nome do arquivo
				

                /** CRIA��O DO DIRET�RIO - PARA CHEGAR AT� O ENDERE�O DESTE DIRETORIO vamos usar a classe Files, para manipula��o de 
                 * arquivos.*/
			
				Files.createDirectories(path.getParent()); 
				
				
				/** 
				 * ESCREVER E LER ARQUIVOS - Para criar um novo arquivo vai ser utilizado a classe Files. O m�todo write() � utilizado para
				 * escrever o texto dentro deste arquivo, ou seja, � para manipular o arquivo.*/
				
				byte[] b = "Meu texto".getBytes();
				Files.write(path, b); //cria, limpa e escreve o texto dentro do arquivo
				
				
				byte[] retorna = Files.readAllBytes(path); //para ler o arquivo - que recebe um caminho no parametro - ele retorna um conjunto de bytes.
				System.out.println(new String(retorna));
				
			}

		}
