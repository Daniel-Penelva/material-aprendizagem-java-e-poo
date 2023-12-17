package modelo.diagrama.de.classe;

public class GerenciadorMatricula {

	private Matricula matriculas[];
	private Integer codigoSeq = 0;
	private Integer pos = 0;

	public GerenciadorMatricula() {
		super();
	}

	// Construtor sobrecarregado
	public GerenciadorMatricula(int qtd) {
		setQtdMatriculas(qtd);
	}

	public void cadastrar(Matricula mat) {

		
		Integer codigoSequencial = gerarCodigoSequencial(); // Atribui Código na matricula
		mat.setCodigo(codigoSequencial);

		// ou pode fazer assim: mat.setCodigo(gerarCodigoSequencial());

		// Adicionar no vetor na condição de tamanho total.
		if (pos < matriculas.length) {
			matriculas[pos++] = mat;
		}
	}

	private Integer gerarCodigoSequencial() {
		return codigoSeq++;
	}

	public Matricula[] buscarMatriculas(Aluno alunoBusca) {

		int j = 0;
		
		Matricula matriculaResultados[] = new Matricula[getQtdMatriculas()];
		
		for (int i = 0; i < getQtdMatriculas(); i++) {
			
			if (matriculas[i].getAluno().getCodigo() == alunoBusca.getCodigo()) { // Comparando o codigo do aluno da matrícula com o código do aluno de busca
				matriculaResultados[j++] = matriculas[i];
			}
		}

		return matriculaResultados;
	}

	// Exemplo de sobrecarga de métodos
	public Matricula[] buscarMatriculas(Curso cursoBusca) {
		int j = 0;

		Matricula matriculaResultados[] = new Matricula[getQtdMatriculas()];
		for (int i = 0; i < getQtdMatriculas(); i++) {
			if (matriculas[i].getCurso().getNome() == cursoBusca.getNome()) {
				matriculaResultados[j++] = matriculas[i];
			}
		}

		return matriculaResultados;
	}

	public Matricula[] buscarMatriculas(Integer codigoAluno) {
		int j = 0;

		Matricula matriculaResultados[] = new Matricula[getQtdMatriculas()];
		for (int i = 0; i < getQtdMatriculas(); i++) {
			if (matriculas[i].getAluno().getCodigo() == codigoAluno) {
				matriculaResultados[j++] = matriculas[i];
			}
		}

		return matriculaResultados;
	}

	public void setQtdMatriculas(int qtd) {
		matriculas = new Matricula[qtd];
	}

	public int getQtdMatriculas() {
		return matriculas.length;
	}

}