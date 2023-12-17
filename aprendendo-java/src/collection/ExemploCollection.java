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

		System.out.println("Verifica se est� vazio: " + c.isEmpty()); // verifica se est� vazia - retorna um boolean

		System.out.println("Verifica se existe o valor A: " + c.contains("A")); // pesquisa pela ocorrencia de um determinado elemento - retorna um boolean

		System.out.println("Verifica se removeu o valor A:" + c.remove("A")); // remove um determinado elemento - retorna um boolean
		System.out.println("Removeu o valor A: " + c.toString());

		// m�todos para trabalhar com grupos de elementos

		Collection<String> col = Arrays.asList("O", "U");
		c.addAll(col); // o m�todo addAll(adiciona os valores O e U para o mesmo vetor)
		
		System.out.println("Adicionou o valor para a cole��o 1: " + c.toString());
		System.out.println("Verifica se existe todos da cole�ao 1 e 2:" + c.containsAll(col)); 

		
		c.removeAll(col); // remove toda a cole��o 2
		System.out.println("Remove a cole��o 2: " + c.toString());

		// acessa os elementos de uma cole��o
		for (String s : c) {
			System.out.println(s);
		}

		String[] s = c.toArray(new String[c.size()]);
		System.out.println("Gera o que est� no array:" + Arrays.toString(s));

		c.clear(); // m�todo que limpa toda a cole��o
		System.out.println("Limpa o array: " + c.toString());
	}

}
