package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {
	public static void main(String[] args) {
		
		// Coleções genéricas
		List<String> listaDeStrings = new ArrayList<>();
		listaDeStrings.add("Texto 1");
		listaDeStrings.add("Texto 2");

		List<Integer> listaDeInteiros = new ArrayList<>();
		listaDeInteiros.add(10);
		listaDeInteiros.add(20);

		// Wildcards (?)
		imprimirElementos(listaDeStrings);
		imprimirElementos(listaDeInteiros);
	}

	// Wildcard como parâmetro
	private static void imprimirElementos(List<?> lista) {
		
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
	}
}
