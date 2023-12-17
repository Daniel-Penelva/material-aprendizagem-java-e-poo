package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploCollectionUtilitario {

	public static void main(String[] args) {
		
		/**
		 * Collection utilitario, foi criada para manipula�ao de todo tipo de cole��o java. Existe alguns m�todo que s� � POSS�VEL ENCONTRAR nessa classe
		 * Collection 
		 * 
		 * Exemplos:
		 * 
		 *  -> sort � utilizado para ordenar em ordem alfab�tica os dados dentro de uma lista.
		 * 
		 *  -> reverse � utilizado para ordenar em ordem de tras para frente. (ordem invertida)
		 * 
		 *  -> shuffle vai embaralhar os dados da sua cole��o, colocando na ordem que ele quiser, sorteando-as.
		 * 
		 * OBS. REPARE: Quando vc digita a Collection, vai abrir v�rios exemplos poss�veis de m�todos para uso.
		 */

		List<String> lista = new ArrayList<>();
		lista.add("Banana");
		lista.add("Ma�a");
		lista.add("Lim�o");
		lista.add("Melancia");
		lista.add("Mam�o");
		lista.add("Laranja");
		lista.add("Jabuticaba");
		lista.add("Goiaba");
		System.out.println(lista);

		
		Collections.sort(lista); // m�todo sort � utilizado para ordenar em ordem alfab�tica os dados dentro de uma lista.
		System.out.println("Ordena na ordem alfabetica: " + lista);

		
		Collections.reverse(lista); // m�todo reverse � utilizado para ordenar em ordem de tras para frente.
		System.out.println("Ordena iversamente: " + lista);

		
		Collections.shuffle(lista); // m�todo shuffer vai embaralhar os dados da sua cole��o, colocando na ordem que ele quiser,sorteando-as.
		System.out.println("Embaralha a lista: " + lista);

		
		Collections.addAll(lista, "Mel�o", "Acerola", "A�ai", "Cupua�u", "Laranja"); // colocando elementos extras - adiciona novos elementos
		System.out.println(lista);

		
		int contador = Collections.frequency(lista, "Laranja"); // m�todo frequency - saber qnts vezes a palavra laranja aparece na lista
		System.out.println("Contabiliza quantas vezes a palavra �Laranja� aparece " + contador);

		
		List<String> lista2 = Arrays.asList("Graviola", "Guaran�"); // m�todo asList - cria uma lista e passa os valores diretamente como argumentos
		System.out.println("Lista 2: "+ lista2);
		boolean verifica = Collections.disjoint(lista, lista2); // m�todo disjoint para saber se dentro da lista tem um conjunto de palavras - retorna tipo boolean
		System.out.println("Existe um conjunto de palavras: " + verifica);

		
		Collections.sort(lista);
		System.out.println("Lista 1: " + lista);

		int verificaIndice = Collections.binarySearch(lista, "Mel�o");
		System.out.println("Localiza o �ndice: " + verificaIndice); // localiza o indice de um determinado elemento da cole��o

		
		Collections.fill(lista, "P�ra"); // m�todo fill vai preencher em todas as posi��es a palavra P�ra
		System.out.println("Preenche p�ra em todas as posi��es: " + lista);

		
		Collection<String> constante = Collections.unmodifiableCollection(lista); // cole��o que n�o pode ser modificada
		System.out.println("Lista n�o pode ser modificada: " + constante);

	}
}
