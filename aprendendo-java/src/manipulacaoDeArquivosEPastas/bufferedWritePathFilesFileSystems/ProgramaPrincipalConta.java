package manipulacaoDeArquivosEPastas.bufferedWritePathFilesFileSystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProgramaPrincipalConta {

	Path path = Paths.get("C://Users//d4nan//Documents//gerando arquivo/conta.txt"); // Cria o caminho da pasta
	private Charset utf8 = StandardCharsets.UTF_8; // Define o charset

	// Registra todas as contas dos usuários
	public void registrarContasUsuarios(ArrayList<Conta> contas) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (Conta conta : contas) {
				writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
			}
		}
	}

	// Imprime o resultado das contas
	public ArrayList<Conta> imprimirContas() throws IOException {
		ArrayList<Conta> contas = new ArrayList<>();

		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {

			String line = null;

			while ((line = reader.readLine()) != null) { // readerLine() = lê cada uma das linhas do arquivo de texto

				String[] tokken = line.split(";");  //delimitador para os tokens, tudo que estiver ponto e virgula (;) vai quebrar uma linha
				
				System.out.println(tokken[0] + tokken[1]);
				
				Conta conta = new Conta(tokken[0], Double.parseDouble(tokken[1]));
				contas.add(conta);
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Daniel", 12000.23));
		contas.add(new Conta("Carlos", 2000.90));
		contas.add(new Conta("Maria", 32000.90));
		contas.add(new Conta("Caio", 92000.40));

		for (Conta conta : contas) {
			conta.exibeSaldo();
		}
		
		System.out.println("\n Quebra de linha \n ");
		ProgramaPrincipalConta operacao = new ProgramaPrincipalConta();

		operacao.registrarContasUsuarios(contas);
		operacao.imprimirContas();
		
		ArrayList<Conta> contas1 = new ArrayList<>();
		
		for (Conta conta : contas1) {
			conta.exibeSaldo();
		}
	}

}
