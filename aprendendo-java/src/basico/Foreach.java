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
		
		/* Exemplo com foreach - OBS. n�o tem acesso ao i e a execu��o s� � crescente, n�o tem como voltar */
		for (int par : pares) {
			System.out.println(par);
		}

		System.out.println("\n\n");
		
		
		/* Exemplo 3 - preenchimento definidos com n�meros inteiros (Integer) */
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
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Iterando sobre os elementos usando o Enhanced For Loop
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
	}
}

/**
 * O Enhanced For Loop (foreach) � especialmente �til quando s� precisa iterar sobre os elementos da cole��o e n�o precisa se preocupar com �ndices ou 
 * modifica��es na cole��o durante a itera��o. Ele melhora a legibilidade do c�digo e � uma escolha preferida em muitos casos.*/
