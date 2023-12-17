package modelo.diagrama.de.classe;

import java.util.Date;

public class Matricula {

	private Integer codigo;
	private Date data;
	private Curso curso; // Relação unidirecional: Matricula tem um Curso
	private Aluno aluno; // Relação unidirecional: Matricula tema Disciplina

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}