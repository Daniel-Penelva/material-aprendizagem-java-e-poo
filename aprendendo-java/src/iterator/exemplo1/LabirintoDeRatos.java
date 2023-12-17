package iterator.exemplo1;

import java.util.ArrayList;
import java.util.Collection;

public class LabirintoDeRatos {

	public static void main(String[] args) {
		
		Collection<Rato> ratos = new ArrayList<Rato>();
		
		for (int i = 0; i < 3; i++) {
			ratos.add(new Rato(i));
		}
		
		// iterador criado aqui
		Printer.printAll(ratos.iterator());
	}
}

/**
O Iterator é uma interface no Java que pertence ao framework de Collections (Coleções). Ele fornece métodos para iterar sequencialmente sobre elementos de 
uma coleção, sem expor a estrutura interna da coleção. A idéia é permitir que percorra os elementos de uma coleção, como uma lista, conjunto, ou mapa, sem 
precisar conhecer os detalhes internos da implementação.
 */
