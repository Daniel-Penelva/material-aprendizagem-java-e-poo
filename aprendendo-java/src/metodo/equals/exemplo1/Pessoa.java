package metodo.equals.exemplo1;

public class Pessoa {
	
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public boolean equals(Object obj) {
		// Verifica se é o mesmo objeto
		if (this == obj) {
			return true;
		}

		// Verifica se o objeto não é nulo e pertence à mesma classe
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		// Converte o objeto para a classe desejada
		Pessoa outraPessoa = (Pessoa) obj;

		// Compara os atributos relevantes para determinar a igualdade
		return idade == outraPessoa.idade && nome.equals(outraPessoa.nome);
	}

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Alice", 25);
		Pessoa pessoa2 = new Pessoa("Bob", 30);
		Pessoa pessoa3 = new Pessoa("Alice", 25);

		// Comparação usando equals
		System.out.println("pessoa1 equals pessoa2: " + pessoa1.equals(pessoa2));
		System.out.println("pessoa1 equals pessoa3: " + pessoa1.equals(pessoa3));
	}
}
