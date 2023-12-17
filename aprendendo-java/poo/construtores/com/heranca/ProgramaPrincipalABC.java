package construtores.com.heranca;

public class ProgramaPrincipalABC {

	public static void main(String[] args) {
		
		new A(); // imprime o construtor de A que herda Object
		
		new B(""); // imprime o construtor de B e de A (vai herda o A que é do tipo String e o Object).
		
		new C(); // imprime o construtor de A, B e C (vai herdar B que recebe uma String, vai herdar A e vai herdar Object).
		
		new C("valor do tipo String"); // Vai imprimir os construtores de Object, A, B e C (String)
		
		new C(100); //Vai imprimir os construtores de Object, A, B, C (String) e C (int). 

	}

}
