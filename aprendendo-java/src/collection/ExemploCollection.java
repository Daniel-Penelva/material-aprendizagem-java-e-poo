package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExemploCollection {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		
		c.add("A");
		c.add("E");
		c.add("I");

		System.out.println("Imprimi os valores: " + c.toString()); // toString() - imprimi o resultado

		System.out.println("Verifica se está vazio: " + c.isEmpty()); // verifica se está vazia - retorna um boolean

		System.out.println("Verifica se existe o valor A: " + c.contains("A")); // pesquisa pela ocorrencia de um determinado elemento - retorna um boolean

		System.out.println("Verifica se removeu o valor A:" + c.remove("A")); // remove um determinado elemento - retorna um boolean
		System.out.println("Removeu o valor A: " + c.toString());

		// métodos para trabalhar com grupos de elementos

		Collection<String> col = Arrays.asList("O", "U");
		c.addAll(col); // o método addAll(adiciona os valores O e U para o mesmo vetor)
		
		System.out.println("Adicionou o valor para a coleção 1: " + c.toString());
		System.out.println("Verifica se existe todos da coleçao 1 e 2:" + c.containsAll(col)); 

		
		c.removeAll(col); // remove toda a coleção 2
		System.out.println("Remove a coleção 2: " + c.toString());

		// acessa os elementos de uma coleção
		for (String s : c) {
			System.out.println(s);
		}

		String[] s = c.toArray(new String[c.size()]);
		System.out.println("Gera o que está no array:" + Arrays.toString(s));

		c.clear(); // método que limpa toda a coleção
		System.out.println("Limpa o array: " + c.toString());
	}

}
