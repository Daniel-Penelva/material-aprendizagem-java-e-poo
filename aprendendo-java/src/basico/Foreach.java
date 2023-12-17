package basico;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
		
		/* Exemplo utilizando o for */
		int[] pares = { 1, 2, 4, 6, 8 };

		for (int i = 0; i < pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}

		System.out.println("\n\n");
		
		/* Exemplo com foreach - OBS. não tem acesso ao i e a execução só é crescente, não tem como voltar */
		for (int par : pares) {
			System.out.println(par);
		}

		System.out.println("\n\n");
		
		
		/* Exemplo 3 - preenchimento definidos com números inteiros (Integer) */
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}

		for (Integer numero : lista) {
			System.out.println(numero);
		}
		
		// Exemplo 4
		
		// Criando uma ArrayList de Strings
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Iterando sobre os elementos usando o Enhanced For Loop
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
	}
}

/**
 * O Enhanced For Loop (foreach) é especialmente útil quando só precisa iterar sobre os elementos da coleção e não precisa se preocupar com índices ou 
 * modificações na coleção durante a iteração. Ele melhora a legibilidade do código e é uma escolha preferida em muitos casos.*/
