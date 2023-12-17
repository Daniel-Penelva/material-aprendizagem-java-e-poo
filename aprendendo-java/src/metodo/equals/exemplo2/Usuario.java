package metodo.equals.exemplo2;

// Usuario é um Object
public class Usuario extends Object {

	private String nome;
	private String login;
	private String senha;

	public Usuario() {

	}

	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "Usuario[Nome = " + nome + ", Login = " + login + ", Senha = " + senha + "]";
	}

	public boolean equals1(Object obj) {
		if (this == obj) {
			return true;
			
		}if (obj instanceof Usuario) {
			Usuario u = (Usuario) obj;
			if (this.nome.equals(u.nome) && this.login.equals(u.login) && this.senha.equals(u.senha)) {
				return true;
			}
		}
		return false;
	}
}
