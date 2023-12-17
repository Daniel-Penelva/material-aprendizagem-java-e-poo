package operador.referencia.de.metodo.exemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Daniel",true,"123");
		Cliente c2 = new Cliente("Pedro",false,"456");
		
		c1.autenticaSenha("123");
		
		List<Cliente> clientes = Arrays.asList(c1, c2);
		
		// Exemplo com lambda // clientes.forEach(c -> System.out.println(c.getNome()));
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		//Operador de referencia - São três etapas:
		//1º - o Tipo | 2º o operador de referência :: | 3º o nome do método que quer chamar sem os parênteses 
		clientes.forEach(Cliente :: getNome);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		Cliente c3 = new Cliente("Maria",false,"333");
		
		Consumer<Cliente> consumidor1 = Cliente::getNome;
		consumidor1.accept(c3);

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 3 - Método que não precisa de argumento >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		Runnable r1 = c3::getNome;
		r1.run();

	}

}
