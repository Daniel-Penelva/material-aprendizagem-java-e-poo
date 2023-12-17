package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSet {
	public static void main(String[] args) {

		// Criando um conjunto
		Set<String> conjunto = new HashSet<>();

		// Adicionando elementos
		conjunto.add("Ma��");
		conjunto.add("Banana");
		conjunto.add("P�ra");

		// Acessando elementos
		System.out.println("\n" + "Elementos do conjunto: " + conjunto);

		/**OBS. N�o � possivel acessar os elementos com um for tradicional (int i=0; i<lista; i++), 
		 * uma vez que o Set n�o possui �ndices num�ricos diretamente acess�veis como um List.*/

		// Acessando elementos com foreach
		System.out.println("\n" + "Acessando elementos com foreach");
		for (String frutas : conjunto) {
			System.out.println(frutas);
		}

		// Removendo elemento
		conjunto.remove("Banana");
		System.out.println("Elementos ap�s remover 'Banana': " + conjunto);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		// OBS. A Collection Set n�o aceitam duplicadas de registro, apenas registros �nicos.
		// OBS. Set n�o possui �ndices num�ricos.
		
		String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "amarelo", "verde"};
				
		// OBS. Essa lista aceita duplicada. 
		List<String> list = Arrays.asList(cores); // m�todo asList - cria uma lista e passa os valores diretamente como argumentos
		System.out.println("Acessando a lista: " + list);
		
		list.set(1, "preto"); // Modificando a lista (isso tamb�m afetar� a matriz original)
		System.out.println("Acessando a lista: " + list);
				
		
		Set<String> listaCoresSet = new HashSet<>(list);
		
		System.out.println("Acessando a lista: " + listaCoresSet);
		
		for (String listaCores : listaCoresSet) {
			System.out.println("Acessando a lista: " + listaCores);
		}
	}
}
