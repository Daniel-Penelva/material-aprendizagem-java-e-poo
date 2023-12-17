package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploBufferedWrite {

	public static void main(String[] args) throws IOException {
		
		
		// Informa um caminho de texto
		Path path = Paths.get("C://Users//d4nan//Documents//gerando arquivo/teste.txt");
		
		// Indica o tipo de charsets, ou seja, qual a codificação do arquivo... codificação UTF_8
		Charset utf8 = StandardCharsets.UTF_8;
		  
		  // Criando BufferedWrite
		  try(BufferedWriter w = Files.newBufferedWriter(path,utf8)){
				 
			    w.write("\n Exemplo do uso do método path... para escrever arquivos de texto!");
			    w.write("\n Texto");
				w.write("\n Outro Texto");
				w.flush();
				
			 }catch(IOException e)
			  {
			   e.printStackTrace();
			  }
		
		
		/* LEITURA */
		
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)){
		   String line = null;
		   
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		}catch (Exception e) {
			
		}
	  }
	}