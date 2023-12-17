package modelo.diagrama.de.classe;

public class Professor extends Funcionario {

	private Disciplina disciplina; // Relação unidirecional: Professor tem uma o várias Disciplinas

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + (getSalario() * 3 / 100);
	}
}
