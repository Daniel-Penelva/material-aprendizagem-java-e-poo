package basico;

public class ExemploStringBuffer {

	public static void main(String[] args) {

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println(" Exemplo 1 ");
		
		StringBuffer s1 = new StringBuffer();
		StringBuilder s2 = new StringBuilder("Java � legal!");
		
		System.out.println(s2.length()); // Imprime o comprimento da sequ�ncia contida em s2. O comprimento � o n�mero de caracteres na sequ�ncia. Neste caso, imprimir� 13.
		
		System.out.println(s2.capacity()); // Imprime a capacidade atual do StringBuilder. 
		
		System.out.println(s2.reverse()); // Inverte a sequ�ncia de caracteres no StringBuilder
		
		System.out.println(s2.append(" E uma linguagem de programa��o...")); // Adiciona a string " E uma linguagem de programa��o..." ao final do StringBuilder e a imprime.
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 2");
		
		StringBuffer buffer1 = new StringBuffer("Ol�, ");
		
		buffer1.append("mundo!");
		
		System.out.println(buffer1.toString());  // Sa�da: Ol�, mundo!
		

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 3");
		
		StringBuffer buffer2 = new StringBuffer("Ol�, mundo!");
		
		buffer2.insert(5, "meu ");  // O m�todo insert insere texto em uma posi��o espec�fica.
		
		System.out.println(buffer2.toString());  // Sa�da: Ol�, meu mundo!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 4");

		StringBuffer buffer3 = new StringBuffer("Ol�, mundo!");
		
		buffer3.replace(5, 10, "meu"); // O m�todo replace substitui uma parte espec�fica do texto.
		
		System.out.println(buffer3.toString());  // Sa�da: Ol�, meu!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 5");
		
		StringBuffer buffer4 = new StringBuffer("Ol�, meu mundo!");
		buffer4.delete(5, 9); // O m�todo delete remove uma parte espec�fica do texto.
		System.out.println(buffer4.toString());  // Sa�da: Ol�, mundo!
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 6");

		StringBuffer buffer5 = new StringBuffer("Java");
		buffer5.append(" �").append(" uma linguagem").append(" de programa��o."); // Neste exemplo, v�rias opera��es append s�o encadeadas para construir a string final.
		System.out.println(buffer5.toString());  // Sa�da: Java � uma linguagem de programa��o.

		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 7");

		String[] palavras = {"Java", "�", "uma", "linguagem", "de", "programa��o"};
		StringBuffer buffer6 = new StringBuffer();

		for (String palavra : palavras) {
		    buffer6.append(palavra).append(" ");
		}

		System.out.println(buffer6.toString());  // Sa�da: Java � uma linguagem de programa��o
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 8");
		
		StringBuffer buffer = new StringBuffer("abc");
		buffer.reverse();  // Inverte a string: "cba"
		char primeiroChar = buffer.charAt(0);  // Obt�m o primeiro caractere: 'c'
		String subString = buffer.substring(1, 3);  // Obt�m uma substring: "ba"
		
		System.out.println(primeiroChar);
		System.out.println(subString);


		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 9 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 9");
		
		char[] vetor = {'a','e','i','o'};
		s1.append(vetor).append('u').append(" - Olha as vogais!");
		System.out.println(s1);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 10 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 10");

		String texto = " Oi " + " como vai " + " voc� ?";
		String texto1 = new StringBuilder(" Oi ").append(" como vai ").append(" voc� ?").toString();
		StringBuilder texto2 = new StringBuilder(" Oi ").append(" como vai ").append(" voc� ?");
		
		System.out.println(texto);
		System.out.println(texto1);
		System.out.println(texto2);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 11 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 11");
		
		String url = new StringBuilder("www.google.com.br").delete(0,4).toString();
		System.out.println(url);
	}

}
