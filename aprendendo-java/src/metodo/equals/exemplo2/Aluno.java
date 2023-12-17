package metodo.equals.exemplo2;

import java.util.Objects;

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

	public boolean equals2(Object obj) {
		if (this == obj) {
			return true;
			
		}if (obj instanceof Aluno) {
			Aluno a = (Aluno) obj;
			if (this.registroAcademico == a.registroAcademico && this.getNome().equals(a.getNome())
					&& this.getLogin().equals(a.getLogin()) && this.getSenha().equals(a.getSenha())) {
				return true;
			}
		}
		return false;
	}

}
