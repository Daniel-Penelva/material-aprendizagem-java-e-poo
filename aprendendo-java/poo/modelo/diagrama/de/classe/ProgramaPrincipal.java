package modelo.diagrama.de.classe;

import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a quantidade de matriculas: ");
		int qtd = leitor.nextInt();

		GerenciadorMatricula gm = new GerenciadorMatricula(qtd); // Internamente já cria um vetor de três posições
		// gm.setQtdMatriculas(qtd);

		for (int i = 0; i < gm.getQtdMatriculas(); i++) {

			Curso cur = new Curso();
			System.out.println("Entre com o nome do Curso: ");
			cur.setNome(leitor.next());
			System.out.println("Entre com a carga horária: ");
			cur.setCargaHoraria(leitor.nextInt());

			Estado e = new Estado();
			System.out.println("OBS: Entra com os dados tudo junto: Ex: RioDeJaneiro");
			System.out.println("Entre com o nome do Estado: ");
			e.setNome(leitor.next());
			System.out.println("Entre com a UF: ");
			e.setUf(leitor.next());

			Cidade c = new Cidade();
			System.out.println("OBS: Entra com os dados tudo junto: Ex: RioDeJaneiro");
			System.out.println("Entre com o nome da Cidade: ");
			c.setCidade(leitor.next());
			c.setEstado(e);

			Aluno a = new Aluno();
			System.out.println("Entre com o código do Aluno: ");
			a.setCodigo(leitor.nextInt());
			System.out.println("Entre com o nome do Aluno: ");
			a.setNome(leitor.next());
			System.out.println("Entre com o CPF: ");
			a.setCpf(leitor.next());

			Matricula m1 = new Matricula();
			m1.setData(new Date());
			m1.setCurso(cur);
			m1.setAluno(a);

			gm.cadastrar(m1);
		} // fim do for

		// Busca
		System.out.println("Entre com o código do Aluno para busca: ");
		Aluno alunoBusca = new Aluno();
		alunoBusca.setCodigo(leitor.nextInt());

		// Retorna um vetor com Matriculas - vai retornar propriedades vinculadas a matricula
		Matricula[] resultadoMatriculas = gm.buscarMatriculas(alunoBusca);

		// for(Matricula m:resultadoMatriculas){...} Pode fazer esse for ou ...
		for (int i = 0; i < resultadoMatriculas.length; i++) {
			// se tiver na posição nula o laço é interrompido
			if (resultadoMatriculas[i] == null) {
				break;
			}
			System.out.println("Nome do Aluno: " + resultadoMatriculas[i].getAluno().getNome() + " CPF do Aluno: "
					+ resultadoMatriculas[i].getAluno().getCpf() + " Código do Aluno: "
					+ resultadoMatriculas[i].getAluno().getCodigo() + " Código da Matricula: "
					+ resultadoMatriculas[i].getCodigo() + " Curso: " + resultadoMatriculas[i].getCurso().getNome());
		}
		leitor.close();
	}

}
