package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		// Criando uma lista
		List<String> lista = new ArrayList<>();

		// Adicionando elementos
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Pêra");

		// Acessando elemento com o for
		System.out.println("Elementos da lista: " + lista);
		
		
		// Acessando elemento com o for
		System.out.println("\n" + "Acessando elementos com for");
		for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
		
		// Acessando elementos com foreach
		System.out.println("\n" + "Acessando elementos com foreach");
		for (String frutas : lista) {
			System.out.println(frutas);
		}

		// Removendo elemento
		lista.remove("Banana");
		System.out.println("\n" + "Elementos após remover 'Banana': " + lista);
		
		System.out.println("\n\n");
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		List<String> listaDeEsportes = new ArrayList<>();
		
		listaDeEsportes.add("Futebol");
		listaDeEsportes.add("Basquete");
		listaDeEsportes.add("Natação");
		listaDeEsportes.add("Luta");
		listaDeEsportes.add("Handebol");
		listaDeEsportes.add("hockey");
		listaDeEsportes.add("Vôlei");
		listaDeEsportes.add("Tênis");
		
		//Essa interface aceita elementos duplicados
		listaDeEsportes.add("Futebol");
		
		System.out.println(listaDeEsportes);
		
		//metodos que permitem manipular como se fosse um array
		for (int i = 0; i < listaDeEsportes.size(); i++) {
			String esportes = listaDeEsportes.get(i);
			listaDeEsportes.set(i,esportes.toUpperCase());
		}
		
		System.out.println(listaDeEsportes);
		
		
		int localiza = listaDeEsportes.indexOf("NATAÇÃO"); // indexOf() - esse método é utilizado para localizar um elemento.
		System.out.println(localiza);
		
		System.out.println(listaDeEsportes.subList(2,4)); //encontrar uma sub lista dentro da lista - vai encontrar os valores do indice 2 e 4
			
		listaDeEsportes.subList(3,6).clear(); //remove o valor da lista principal
		System.out.println(listaDeEsportes);
	}
}
