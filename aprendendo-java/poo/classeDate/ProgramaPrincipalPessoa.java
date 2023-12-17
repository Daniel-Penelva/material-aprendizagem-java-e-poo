package classeDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipalPessoa {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		Date data = new Date();
		System.out.println(data);

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		Pessoa pessoa = new Pessoa("Daniel", new Date());
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Data: " + pessoa.getData());

		
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		Scanner scanner = new Scanner(System.in);

		// Solicitando a entrada do usuário
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();

		// Criando uma instância da classe usando o construtor
		Pessoa pessoa1 = new Pessoa(nome, null);

		// Solicitando a entrada da data de nascimento
		System.out.print("Digite sua data de nascimento (no formato dd/MM/yyyy): ");
		String inputDate = scanner.next();

		// Convertendo a entrada para Date usando o setter
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			pessoa1.setData(sdf.parse(inputDate));
			
		} catch (ParseException e) {
			System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
			return;
		}

		// Imprimindo informações usando os getters
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Data de Nascimento: " + pessoa1.getFormatarData());

		scanner.close();

	}

}
