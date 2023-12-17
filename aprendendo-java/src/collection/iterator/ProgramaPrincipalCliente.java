package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.setNome("Daniel");
		c.setSobrenome("Andrade");

		Cliente c2 = new Cliente();
		c2.setNome("Biana");
		c2.setSobrenome("Penelva");

		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(c);
		lista.add(c2);

		lista.add(new Cliente("Walter", "Andrade"));

		// Gerando os valores com Iterator

		Iterator<Cliente> iterator = lista.iterator();
		c = iterator.next();  // (posição 0)
		System.out.println("Imprimindo primeira posição nome: " + c.getNome());

		
		System.out.println(iterator.hasNext()); // Pergunta se existe posição no vetor? true (posição 1)
		c = iterator.next();
		System.out.println("Imprimindo segunda posição nome:  " + c.getNome());

		
		System.out.println(iterator.hasNext()); // Pergunta se existe posição no vetor? true (posição 2)
		c = iterator.next();
		System.out.println("Imprimindo terceira posição nome:  " + c.getNome());

		// Usando Iterator - acessando com o while
		System.out.println("\n" + "Usando a estrutura while" + "\n");
		Iterator<Cliente> iterator2 = lista.iterator();

		while (iterator2.hasNext()) {
			c = iterator2.next();
			System.out.println(c.getNome());
		}
		
		
		System.out.println("\n" + "Acessando com foreach");
		for (Cliente cliente : lista) {
			System.out.println("Nome: " + cliente.getNome() + " :: Sobrenome: " + cliente.getSobrenome());
		}
		
		
		// Acessando elemento com o for
		System.out.println("\n" + "Acessando elementos com for");
		for (int i = 0; i < lista.size(); i++) {
			Cliente clienteAtual = lista.get(i);
			System.out.println("Nome: " + clienteAtual.getNome() + " :: Sobrenome: " + clienteAtual.getSobrenome());
		}

	}
}
