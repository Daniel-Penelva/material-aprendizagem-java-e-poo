package metodos.com.parametros;

public class ProgramaPrincipalExemploParametro {

	public static void main(String[] args) {

		ExemploParametro p = new ExemploParametro();

		// Exemplo1
		p.atribuirNome("Daniel Penelva de Andrade");

		
		// Exemplo2
		int idade = p.idade(1987, 2014);
		System.out.println(idade);

		
		// Exemplo3
		p.corPreferida();

		// Exemplo4
		System.out.println(p.soma());

		
		// Exemplo5
		p.teste();

		
		// Exemplo6
		int subtrair = p.teste2();
		System.out.println("50 - 20 = " + subtrair);

		
		// Exemplo7
		p.somando(50, 100, 200);

		
		// Exemplo8
		System.out.println(p.diminuindo(30, 50, 40));

	}
}
