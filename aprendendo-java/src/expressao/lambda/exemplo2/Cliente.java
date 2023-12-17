package expressao.lambda.exemplo2;

public class Cliente implements Autentica {

	private String nome;
	private boolean status;
	private String senha;

	public Cliente() {

	}

	public Cliente(String nome, boolean status, String senha) {
		super();
		this.nome = nome;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		System.out.println(this.nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticaSenha(String senha) {

		if (this.senha != senha) {
			System.out.println("Não autenticado!");
			return false;
		}
		System.out.println("Autenticado!");
		return false;
	}

}
