package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath_Files {

	public static void main(String[] args) throws IOException {
		
/**
* Arquivos ou diretórios tem um caminho ou um endereço, e existe uma classe java que defini esse caminho ou manipula esse caminho, que 
* é chamado de Path(caminho) e através do método get()recebe uma string ou uma url. Através deste método é possivel informa a direção
* ou o endereço do arquivo que vc queira manipular. */
			
			
			   Path path = Paths.get("C://Users//d4nan//Documents//gerando arquivo/teste.txt"); // Path define o caminho da pasta e do arquivo.txt
			
				System.out.println(path.toAbsolutePath()); // método - toAbsolutePath() - retorna o caminho absoluto do arquivo.
			
				System.out.println(path.getParent()); // método - getParent() - podemos ver o arquivo pai deste diretorio
			
				System.out.println(path.getRoot()); // método - getRoot() - a raiz do sistema
			
				System.out.println(path.getFileName()); //método - getFileName() - o nome do arquivo
				

                /** CRIAÇÃO DO DIRETÓRIO - PARA CHEGAR ATÉ O ENDEREÇO DESTE DIRETORIO vamos usar a classe Files, para manipulação de 
                 * arquivos.*/
			
				Files.createDirectories(path.getParent()); 
				
				
				/** 
				 * ESCREVER E LER ARQUIVOS - Para criar um novo arquivo vai ser utilizado a classe Files. O método write() é utilizado para
				 * escrever o texto dentro deste arquivo, ou seja, é para manipular o arquivo.*/
				
				byte[] b = "Meu texto".getBytes();
				Files.write(path, b); //cria, limpa e escreve o texto dentro do arquivo
				
				
				byte[] retorna = Files.readAllBytes(path); //para ler o arquivo - que recebe um caminho no parametro - ele retorna um conjunto de bytes.
				System.out.println(new String(retorna));
				
			}

		}
