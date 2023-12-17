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
		
		//Operador de referencia - S�o tr�s etapas:
		//1� - o Tipo | 2� o operador de refer�ncia :: | 3� o nome do m�todo que quer chamar sem os par�nteses 
		clientes.forEach(Cliente :: getNome);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		Cliente c3 = new Cliente("Maria",false,"333");
		
		Consumer<Cliente> consumidor1 = Cliente::getNome;
		consumidor1.accept(c3);

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 3 - M�todo que n�o precisa de argumento >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		Runnable r1 = c3::getNome;
		r1.run();

	}

}
