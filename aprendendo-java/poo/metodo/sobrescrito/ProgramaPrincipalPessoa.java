package metodo.sobrescrito;

public class ProgramaPrincipalPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Daniel");
		pessoa.setSobrenome("Penelva");
		pessoa.setIdade(30);
		
		System.out.println(pessoa.toString());
		
		// Exemplo do método sobrescrito toString
		System.out.println(pessoa.toString2());
		

	}

}
