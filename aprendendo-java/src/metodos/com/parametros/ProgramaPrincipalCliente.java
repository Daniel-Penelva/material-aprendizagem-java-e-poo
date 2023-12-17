package metodos.com.parametros;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {
		
		Cliente c = new Cliente(20);

		int idade = c.getIdade();
		System.out.println("Sua idade " + idade);

		reduzirIdade(27);
		reduzirIdade(5);
		
		exibirIdade(c);

	}

	// Método reduzir idade passando como parametro o tipo double idade
	public static void reduzirIdade(double idade) {
		idade = idade / 3;
		System.out.println("divisão idade: " + idade);
	}

    // Método reduzir idade passando como parametro o tipo Cliente - vai ter que passar um objeto cliente 
	private static void exibirIdade(Cliente cliente) {
		
		int idade = cliente.getIdade();
		
		System.out.println("Método exibir idade: " + idade);
	}
}
