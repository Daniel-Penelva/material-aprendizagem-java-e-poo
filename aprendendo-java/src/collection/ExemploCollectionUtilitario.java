package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploCollectionUtilitario {

	public static void main(String[] args) {
		
		/**
		 * Collection utilitario, foi criada para manipulaçao de todo tipo de coleção java. Existe alguns método que só é POSSÍVEL ENCONTRAR nessa classe
		 * Collection 
		 * 
		 * Exemplos:
		 * 
		 *  -> sort é utilizado para ordenar em ordem alfabética os dados dentro de uma lista.
		 * 
		 *  -> reverse é utilizado para ordenar em ordem de tras para frente. (ordem invertida)
		 * 
		 *  -> shuffle vai embaralhar os dados da sua coleção, colocando na ordem que ele quiser, sorteando-as.
		 * 
		 * OBS. REPARE: Quando vc digita a Collection, vai abrir vários exemplos possíveis de métodos para uso.
		 */

		List<String> lista = new ArrayList<>();
		lista.add("Banana");
		lista.add("Maça");
		lista.add("Limão");
		lista.add("Melancia");
		lista.add("Mamão");
		lista.add("Laranja");
		lista.add("Jabuticaba");
		lista.add("Goiaba");
		System.out.println(lista);

		
		Collections.sort(lista); // método sort é utilizado para ordenar em ordem alfabética os dados dentro de uma lista.
		System.out.println("Ordena na ordem alfabetica: " + lista);

		
		Collections.reverse(lista); // método reverse é utilizado para ordenar em ordem de tras para frente.
		System.out.println("Ordena iversamente: " + lista);

		
		Collections.shuffle(lista); // método shuffer vai embaralhar os dados da sua coleção, colocando na ordem que ele quiser,sorteando-as.
		System.out.println("Embaralha a lista: " + lista);

		
		Collections.addAll(lista, "Melão", "Acerola", "Açai", "Cupuaçu", "Laranja"); // colocando elementos extras - adiciona novos elementos
		System.out.println(lista);

		
		int contador = Collections.frequency(lista, "Laranja"); // método frequency - saber qnts vezes a palavra laranja aparece na lista
		System.out.println("Contabiliza quantas vezes a palavra ´Laranja´ aparece " + contador);

		
		List<String> lista2 = Arrays.asList("Graviola", "Guaraná"); // método asList - cria uma lista e passa os valores diretamente como argumentos
		System.out.println("Lista 2: "+ lista2);
		boolean verifica = Collections.disjoint(lista, lista2); // método disjoint para saber se dentro da lista tem um conjunto de palavras - retorna tipo boolean
		System.out.println("Existe um conjunto de palavras: " + verifica);

		
		Collections.sort(lista);
		System.out.println("Lista 1: " + lista);

		int verificaIndice = Collections.binarySearch(lista, "Melão");
		System.out.println("Localiza o índice: " + verificaIndice); // localiza o indice de um determinado elemento da coleção

		
		Collections.fill(lista, "Pêra"); // método fill vai preencher em todas as posições a palavra Pêra
		System.out.println("Preenche pêra em todas as posições: " + lista);

		
		Collection<String> constante = Collections.unmodifiableCollection(lista); // coleção que não pode ser modificada
		System.out.println("Lista não pode ser modificada: " + constante);

	}
}
