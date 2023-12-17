package collection.list;

import java.util.ArrayList;
import java.util.List;


public class ProgramaPrincipalCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.setNome("Daniel");
		c.setSobrenome("Andrade");

		Cliente c2 = new Cliente();
		c2.setNome("Biana");
		c2.setSobrenome("Penelva");

		List<Cliente> lista = new ArrayList<>();
		lista.add(c);
		lista.add(c2);

		// Exemplo com construtor
		lista.add(new Cliente("Walter", "Andrade"));

		// Gerando os valores

		// Acessando elementos com foreach
		System.out.println("\n" + "Acessando elementos com foreach");
		for (Cliente cliente : lista) {
			System.out.println("Nome: " + cliente.getNome() + " Sobrenome: " + cliente.getSobrenome());
		}

		// Acessando elementos com for
		System.out.println("\n" + "Acessando elementos com for");
		for (int i = 0; i < lista.size(); i++) {
			Cliente cliente1 = lista.get(i);
			System.out.println(cliente1.getNome() + " " + cliente1.getSobrenome());
		}
	}
}
