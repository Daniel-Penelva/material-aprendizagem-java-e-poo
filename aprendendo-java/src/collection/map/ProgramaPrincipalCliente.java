package collection.map;

import java.util.HashMap;
import java.util.Map;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {

		// Criando objetos Cliente
		Cliente c1 = new Cliente("Daniel", "Andrade");
		Cliente c2 = new Cliente("Biana", "Penelva");
		Cliente c3 = new Cliente("Walter", "Andrade");

		// Criando um Map onde a chave é o nome do cliente e o valor é o próprio objeto Cliente
		Map<String, Cliente> mapaClientes = new HashMap<>();
		mapaClientes.put(c1.getNome(), c1);
		mapaClientes.put(c2.getNome(), c2);
		mapaClientes.put(c3.getNome(), c3);

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** OBS. A saída padrão ao imprimir um objeto em Java é o resultado do método toString(). No caso, a classe Cliente precisa sobreescrever o método toString().
		 * A ideia é fornecer uma representação de string significativa para a instância da classe Cliente.*/
		
		// Acessando objetos Cliente pelo nome usando o Map
		Cliente clienteDaniel = mapaClientes.get("Daniel");
		System.out.println("Cliente encontrado pelo nome 'Daniel': " + clienteDaniel);

		Cliente clienteBiana = mapaClientes.get("Biana");
		System.out.println("Cliente encontrado pelo nome 'Biana': " + clienteBiana);

		Cliente clienteWalter = mapaClientes.get("Walter");
		System.out.println("Cliente encontrado pelo nome 'Walter': " + clienteWalter);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** Neste exemplo, entrySet() é utilizado para obter o conjunto de entradas do Map, e um loop for-each é usado para iterar sobre essas entradas. 
		 * Cada iteração fornece um Map.Entry<String, Cliente>, que permite acessar a chave e o valor associados ao elemento do mapa.*/
		
		System.out.println("Iterando sobre os elementos do Map usando for-each:");
        for (Map.Entry<String, Cliente> entry : mapaClientes.entrySet()) {
            String nomeCliente = entry.getKey();
            Cliente cliente = entry.getValue();
            System.out.println("Chave: " + nomeCliente + ", Valor: " + cliente);
        }
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** No primeiro loop, keySet() é utilizado para obter um conjunto de chaves, e cada chave é usada para acessar o valor correspondente no Map. */
		
        System.out.println("Iterando sobre as chaves do Map usando for tradicional:");
        for (String chave : mapaClientes.keySet()) {
            Cliente cliente = mapaClientes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + cliente);
        }

        /** No segundo loop, values() é utilizado para obter uma coleção dos valores do Map, e cada valor é impresso diretamente. */
        
        System.out.println("\nIterando sobre os valores do Map usando for tradicional:");
        for (Cliente cliente : mapaClientes.values()) {
            System.out.println("Valor: " + cliente);
        }
	}
}
