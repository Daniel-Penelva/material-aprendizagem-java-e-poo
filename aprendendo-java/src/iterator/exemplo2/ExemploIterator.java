package iterator.exemplo2;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {
	public static void main(String[] args) {
		
		// Criando uma ArrayList de Strings
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Laranja");

		// Obtendo um Iterator para a ArrayList
		Iterator<String> iterator = lista.iterator();

		// Iterando sobre os elementos usando o Iterator
		while (iterator.hasNext()) {
			String fruta = iterator.next();
			System.out.println(fruta);
		}
	}
}


/** Passo a Passo: 
 * 1. Criado um ArrayList chamada lista e foi adicionado algumas strings a ela.
 * 
 * 2. Obtemos um Iterator usando o método iterator() da ArrayList.
 * 
 * 3. Iterando sobre os elementos usando um loop while e os métodos hasNext() e next() do Iterator. O método hasNext() verifica se há mais elementos na 
 *    coleção, enquanto next() retorna o próximo elemento.
 *    
 * É importante notar que o uso de Iterator é especialmente útil quando se quer percorrer uma coleção e, ao mesmo tempo, realizar operações de remoção 
 * durante a iteração, pois o Iterator fornece métodos seguros para tal.*/

/**
 * O Iterator é uma interface no Java que pertence ao framework de Collections (Coleções). Ele fornece métodos para iterar sequencialmente sobre elementos 
 * de uma coleção, sem expor a estrutura interna da coleção. A ideia é permitir que você percorra os elementos de uma coleção, como uma lista, conjunto, ou 
 * mapa, sem precisar conhecer os detalhes internos da implementação.*/
