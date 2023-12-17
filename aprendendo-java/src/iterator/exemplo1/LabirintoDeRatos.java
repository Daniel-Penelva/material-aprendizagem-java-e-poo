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
O Iterator � uma interface no Java que pertence ao framework de Collections (Cole��es). Ele fornece m�todos para iterar sequencialmente sobre elementos de 
uma cole��o, sem expor a estrutura interna da cole��o. A id�ia � permitir que percorra os elementos de uma cole��o, como uma lista, conjunto, ou mapa, sem 
precisar conhecer os detalhes internos da implementa��o.
 */
