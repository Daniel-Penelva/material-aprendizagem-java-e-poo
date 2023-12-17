package construtores;

public class ProgramaPrincipalPessoaCidade {

	public static void main(String[] args) {
		
		/* EXEMPLO 1*/
		System.out.println("EXEMPLO 1");
		System.out.println(new Pessoa());
		
		
		/* EXEMPLO 2*/
		System.out.println("\n" + "EXEMPLO 2");
		Pessoa pessoa = new Pessoa("Daniel");
		System.out.println("Nome: " + pessoa.getNome());
		
		
		/* EXEMPLO 3*/
		System.out.println("\n" + "EXEMPLO 3");
		Pessoa pessoa1 = new Pessoa("Pedro", "12341111111");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("CPF: " + pessoa1.getCpf());
		
		
		/* EXEMPLO 4*/
		System.out.println("\n" + "EXEMPLO 4");
		Cidade cidade = new Cidade("Rio de Janeiro");
		
		Pessoa pessoa2 = new Pessoa("Pedro", cidade);
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Estado: " + pessoa2.getCidade().getEstado());
		
		
		/* EXEMPLO 5*/
		System.out.println("\n" + "EXEMPLO 5");
		
		Pessoa pessoa3 = new Pessoa("João", "11111111111", 35);
		System.out.println("Nome: " + pessoa3.getNome());
		System.out.println("CPF: " + pessoa3.getCpf());
		System.out.println("Idade: " + pessoa3.getIdade());
		
		
		/* EXEMPLO 6*/
		System.out.println("\n" + "EXEMPLO 6");
		
		Cidade cidade1 = new Cidade("São Paulo");
		
		Pessoa pessoa4 = new Pessoa("João", "11111111111", 35, cidade1);
		System.out.println("Nome: " + pessoa4.getNome());
		System.out.println("CPF: " + pessoa4.getCpf());
		System.out.println("Idade: " + pessoa4.getIdade());
		System.out.println("Cidade: " + pessoa4.getCidade().getEstado());
		
		
		/* EXEMPLO 7*/
		System.out.println("\n" + "EXEMPLO 7");
		
		Cidade cidade2 = new Cidade("Minas Gerais");
		
		Pessoa pessoa5 = new Pessoa(cidade2);
		System.out.println("Cidade: " + pessoa5.getCidade().getEstado());

	}

}
