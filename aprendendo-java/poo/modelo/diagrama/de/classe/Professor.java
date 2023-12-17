package modelo.diagrama.de.classe;

public class Professor extends Funcionario {

	private Disciplina disciplina; // Rela��o unidirecional: Professor tem uma o v�rias Disciplinas

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
