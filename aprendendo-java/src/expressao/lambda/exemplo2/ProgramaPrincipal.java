package expressao.lambda.exemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import operador.referencia.de.metodo.exemplo2.Cliente;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Daniel", true, "123");
		Cliente c2 = new Cliente("Pedro", false, "456");

		c1.autenticaSenha("123");

		List<Cliente> clientes = Arrays.asList(c1, c2);

		/*
		 * Exemplificando com classe Anônima
		 * 
		 * Consumer<Cliente> consumidor = new Consumer<Cliente>() {
		 * 
		 * @Override public void accept(Cliente c) { System.out.println(c.getNome()); }
		 * 
		 * };
		 * 
		 * clientes.forEach(consumidor);
		 */

		
		// Exemplo 1 utilizando lambda
		Consumer<Cliente> consumidor = (Cliente c) -> {
			System.out.println(c.getNome());
		};

		clientes.forEach(consumidor);
		
		
		System.out.println("\n");
		// Exemplo 2 pode passar diretamente no forEach
		// É passado o "c" como argumento.
		
		Cliente c3 = new Cliente("Kaio", true, "334");
		Cliente c4 = new Cliente("Mariana", false, "567");
		
		List<Cliente> clientes1 = Arrays.asList(c3, c4);
		clientes1.forEach((Cliente c) -> {System.out.println(c.getNome());});
		// ou 
		clientes1.forEach((Cliente c) -> System.out.println(c.getNome().toUpperCase()));
		
		
		System.out.println("\n");
		// Exemplo 3 pode deixar mais implicito ainda
		
		Cliente c5 = new Cliente("Talita", true, "890");
		Cliente c6 = new Cliente("Bolsonaro", false, "523");
		
		List<Cliente> clientes2 = Arrays.asList(c5, c6);
		clientes2.forEach(c -> System.out.println(c.getNome()));
		
		
		System.out.println("\n");
		// Exemplo 4 de um método que não precisa passar argumento, logo é passado dois parênteses vazios
		
		Runnable r = () -> System.out.println("Olá Mundo!");
		new Thread(r).start();
	}

}
