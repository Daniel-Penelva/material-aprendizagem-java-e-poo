package basico;

public class ExemploStringBuffer {

	public static void main(String[] args) {

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println(" Exemplo 1 ");
		
		StringBuffer s1 = new StringBuffer();
		StringBuilder s2 = new StringBuilder("Java é legal!");
		
		System.out.println(s2.length()); // Imprime o comprimento da sequência contida em s2. O comprimento é o número de caracteres na sequência. Neste caso, imprimirá 13.
		
		System.out.println(s2.capacity()); // Imprime a capacidade atual do StringBuilder. 
		
		System.out.println(s2.reverse()); // Inverte a sequência de caracteres no StringBuilder
		
		System.out.println(s2.append(" E uma linguagem de programação...")); // Adiciona a string " E uma linguagem de programação..." ao final do StringBuilder e a imprime.
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 2");
		
		StringBuffer buffer1 = new StringBuffer("Olá, ");
		
		buffer1.append("mundo!");
		
		System.out.println(buffer1.toString());  // Saída: Olá, mundo!
		

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 3");
		
		StringBuffer buffer2 = new StringBuffer("Olá, mundo!");
		
		buffer2.insert(5, "meu ");  // O método insert insere texto em uma posição específica.
		
		System.out.println(buffer2.toString());  // Saída: Olá, meu mundo!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 4");

		StringBuffer buffer3 = new StringBuffer("Olá, mundo!");
		
		buffer3.replace(5, 10, "meu"); // O método replace substitui uma parte específica do texto.
		
		System.out.println(buffer3.toString());  // Saída: Olá, meu!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 5");
		
		StringBuffer buffer4 = new StringBuffer("Olá, meu mundo!");
		buffer4.delete(5, 9); // O método delete remove uma parte específica do texto.
		System.out.println(buffer4.toString());  // Saída: Olá, mundo!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 6");

		StringBuffer buffer5 = new StringBuffer("Java");
		buffer5.append(" é").append(" uma linguagem").append(" de programação."); // Neste exemplo, várias operações append são encadeadas para construir a string final.
		System.out.println(buffer5.toString());  // Saída: Java é uma linguagem de programação.

		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 7");

		String[] palavras = {"Java", "é", "uma", "linguagem", "de", "programação"};
		StringBuffer buffer6 = new StringBuffer();

		for (String palavra : palavras) {
		    buffer6.append(palavra).append(" ");
		}

		System.out.println(buffer6.toString());  // Saída: Java é uma linguagem de programação
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 8");
		
		StringBuffer buffer = new StringBuffer("abc");
		buffer.reverse();  // Inverte a string: "cba"
		char primeiroChar = buffer.charAt(0);  // Obtém o primeiro caractere: 'c'
		String subString = buffer.substring(1, 3);  // Obtém uma substring: "ba"
		
		System.out.println(primeiroChar);
		System.out.println(subString);


		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 9 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 9");
		
		char[] vetor = {'a','e','i','o'};
		s1.append(vetor).append('u').append(" - Olha as vogais!");
		System.out.println(s1);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 10 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 10");

		String texto = " Oi " + " como vai " + " você ?";
		String texto1 = new StringBuilder(" Oi ").append(" como vai ").append(" você ?").toString();
		StringBuilder texto2 = new StringBuilder(" Oi ").append(" como vai ").append(" você ?");
		
		System.out.println(texto);
		System.out.println(texto1);
		System.out.println(texto2);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 11 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 11");
		
		String url = new StringBuilder("www.google.com.br").delete(0,4).toString();
		System.out.println(url);
	}

}
