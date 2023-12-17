package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIteracao {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Item 1");
		lista.add("Item 2");
		lista.add("Item 3");

/**o `Iterator` � utilizado para percorrer os elementos da lista. Note que a itera��o � realizada atrav�s de um loop while, onde `hasNext()` verifica se h� 
 * mais elementos e `next()` obt�m o pr�ximo elemento.*/
		
		// Usando Iterator - acessando com o while
		System.out.println("\nUsando Iterator:");
		Iterator<String> iterator = lista.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/** OUTRAS FORMAS DE ACESSO DA ESTRUTURA */
		System.out.println("\n" + "Imprimindo lista");
		System.out.println(lista);

		// Acessando elemento com o for
		System.out.println("\n" + "Acessando elementos com for");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Usando for-each
		System.out.println("\n" +  "Acessando elementos com for-each:");
		for (String item : lista) {
			System.out.println(item);
		}
	}
}
