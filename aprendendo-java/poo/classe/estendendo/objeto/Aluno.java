package classe.estendendo.objeto;

// Aluno é um usuario
public class Aluno extends Usuario {

	private int registroAcademico;

	public Aluno() {

	}

	public Aluno(String nome, String login, String senha, int registroAcademico) {
		super(nome, login, senha);
		this.registroAcademico = registroAcademico;
	}

	public String toString() {
		return "Aluno[Nome = " + getNome() + ", Login = " + getLogin() + ", Senha = " + getSenha()
				+ ", Registro Acadêmico = " + registroAcademico + "]";
	}

	public int getRegistroAcademico() {
		return registroAcademico;
	}

	public void setRegistroAcademico(int registroAcademico) {
		this.registroAcademico = registroAcademico;
	}

}
