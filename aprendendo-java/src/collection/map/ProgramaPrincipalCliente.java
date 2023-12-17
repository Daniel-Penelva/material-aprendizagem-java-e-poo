package collection.map;

import java.util.HashMap;
import java.util.Map;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {

		// Criando objetos Cliente
		Cliente c1 = new Cliente("Daniel", "Andrade");
		Cliente c2 = new Cliente("Biana", "Penelva");
		Cliente c3 = new Cliente("Walter", "Andrade");

		// Criando um Map onde a chave � o nome do cliente e o valor � o pr�prio objeto Cliente
		Map<String, Cliente> mapaClientes = new HashMap<>();
		mapaClientes.put(c1.getNome(), c1);
		mapaClientes.put(c2.getNome(), c2);
		mapaClientes.put(c3.getNome(), c3);

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** OBS. A sa�da padr�o ao imprimir um objeto em Java � o resultado do m�todo toString(). No caso, a classe Cliente precisa sobreescrever o m�todo toString().
		 * A ideia � fornecer uma representa��o de string significativa para a inst�ncia da classe Cliente.*/
		
		// Acessando objetos Cliente pelo nome usando o Map
		Cliente clienteDaniel = mapaClientes.get("Daniel");
		System.out.println("Cliente encontrado pelo nome 'Daniel': " + clienteDaniel);

		Cliente clienteBiana = mapaClientes.get("Biana");
		System.out.println("Cliente encontrado pelo nome 'Biana': " + clienteBiana);

		Cliente clienteWalter = mapaClientes.get("Walter");
		System.out.println("Cliente encontrado pelo nome 'Walter': " + clienteWalter);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** Neste exemplo, entrySet() � utilizado para obter o conjunto de entradas do Map, e um loop for-each � usado para iterar sobre essas entradas. 
		 * Cada itera��o fornece um Map.Entry<String, Cliente>, que permite acessar a chave e o valor associados ao elemento do mapa.*/
		
		System.out.println("Iterando sobre os elementos do Map usando for-each:");
        for (Map.Entry<String, Cliente> entry : mapaClientes.entrySet()) {
            String nomeCliente = entry.getKey();
            Cliente cliente = entry.getValue();
            System.out.println("Chave: " + nomeCliente + ", Valor: " + cliente);
        }
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 DE ACESSO A ESTRUTURA MAP >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		/** No primeiro loop, keySet() � utilizado para obter um conjunto de chaves, e cada chave � usada para acessar o valor correspondente no Map. */
		
        System.out.println("Iterando sobre as chaves do Map usando for tradicional:");
        for (String chave : mapaClientes.keySet()) {
            Cliente cliente = mapaClientes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + cliente);
        }

        /** No segundo loop, values() � utilizado para obter uma cole��o dos valores do Map, e cada valor � impresso diretamente. */
        
        System.out.println("\nIterando sobre os valores do Map usando for tradicional:");
        for (Cliente cliente : mapaClientes.values()) {
            System.out.println("Valor: " + cliente);
        }
	}
}
