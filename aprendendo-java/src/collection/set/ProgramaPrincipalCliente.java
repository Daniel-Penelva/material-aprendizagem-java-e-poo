package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {

		
		Set<Cliente> conjuntoClientes = new HashSet<Cliente>(); // O HashSet é uma Classe que implementa a Interface Set

		Cliente c1 = new Cliente();
		c1.setNome("Davi");
		c1.setSobrenome("Amaral");

		Cliente c2 = new Cliente();
		c2.setNome("Paulo");
		c2.setSobrenome("Cunha");

		Cliente c3 = new Cliente();
		c3.setNome("Jão");
		c3.setSobrenome("da Silva");
		
		Cliente c4 = new Cliente();
		c4.setNome("Paloma");
		c4.setSobrenome("Mota");

		Cliente c5 = new Cliente();
		c5.setNome("Jair");
		c5.setSobrenome("Bolsonaro");

		Cliente c6 = new Cliente();
		c6.setNome("Leonardo");
		c6.setSobrenome("Benett");

		// Inserindo no conjunto
		conjuntoClientes.add(c1);
		conjuntoClientes.add(c2);
		conjuntoClientes.add(c3);

		// veriica se foi inserido no conjunto - retorna um boolean
		System.out.println("Verificando se foi inserido no conjunto: " + "\n" + conjuntoClientes.add(c4) + "\n"
				+ conjuntoClientes.add(c5) + "\n" + conjuntoClientes.add(c6));

		// Lembrando que o set não é um conceito de índice mais é possível usar o interator
		System.out.println("\n" + "Gerando os valores no Iterator");

		Iterator<Cliente> iterador = conjuntoClientes.iterator();
		while (iterador.hasNext()) {
			Cliente cliente = iterador.next();
			System.out.println("Nome: " + cliente.getNome() + " Sobrenome: " + cliente.getSobrenome());
		}

		// Acessando com o foreach
		System.out.println("\n" + "Gerando os valores no Foreach");
		for (Cliente cliente : conjuntoClientes) {
			System.out.println("Nome: " + cliente.getNome() + " Sobrenome: " + cliente.getSobrenome());
		}
		
	}
}
