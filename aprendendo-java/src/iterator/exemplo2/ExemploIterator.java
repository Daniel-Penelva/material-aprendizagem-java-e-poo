package iterator.exemplo2;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {
	public static void main(String[] args) {
		
		// Criando uma ArrayList de Strings
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ma��");
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
 * 2. Obtemos um Iterator usando o m�todo iterator() da ArrayList.
 * 
 * 3. Iterando sobre os elementos usando um loop while e os m�todos hasNext() e next() do Iterator. O m�todo hasNext() verifica se h� mais elementos na 
 *    cole��o, enquanto next() retorna o pr�ximo elemento.
 *    
 * � importante notar que o uso de Iterator � especialmente �til quando se quer percorrer uma cole��o e, ao mesmo tempo, realizar opera��es de remo��o 
 * durante a itera��o, pois o Iterator fornece m�todos seguros para tal.*/

/**
 * O Iterator � uma interface no Java que pertence ao framework de Collections (Cole��es). Ele fornece m�todos para iterar sequencialmente sobre elementos 
 * de uma cole��o, sem expor a estrutura interna da cole��o. A ideia � permitir que voc� percorra os elementos de uma cole��o, como uma lista, conjunto, ou 
 * mapa, sem precisar conhecer os detalhes internos da implementa��o.*/
