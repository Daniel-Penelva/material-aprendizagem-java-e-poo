package basico;

import java.io.IOException;
import java.util.Scanner;

public class ExemplosString {

	public static void main(String[] args) {

		/* MANEIRAS DE INICIALIZAR STRING */
		
		String s1 = "String";
		System.out.println(s1);
		
		// --------------------------------------------------------------
		
		String s2 = "Aula de " + s1;
		System.out.println(s2);
		
		// --------------------------------------------------------------
		
		String s3 = new String(); // Instanciando um new String
		System.out.println(s3);
		
		// --------------------------------------------------------------
		
		String s4 = new String("Valor de String dentro do parametro");
		System.out.println(s4);
		
		// --------------------------------------------------------------
		
		char[] arrayVogal = { 'a', 'e', 'i', 'o', 'u' };
		String construtorArray = new String(arrayVogal);
		System.out.println(construtorArray);

		/* OPERA��ES B�SICAS DE UMA STRING */

		int tamanho = s1.length(); // length() = vai retornar o numero de caracteres dentro da sua String;
		System.out.println("N�mero total de caracteres: " + tamanho);

		char buscaCaracter = s1.charAt(2); // CharAt() = busca atraves do indice um determinado caracter 
		System.out.println("Buscando caracter: " + buscaCaracter);

		
		String texto = s2.toString(); // toString() = retorna a pr�pria String
		System.out.println(texto);

		/* M�TODOS DE LOCALIZA��O DE CARACTERES E STRING DO SEU TEXTO */

		

		int posicaoCaracter = s1.indexOf('t');  // indexOf() = retorna a posicao de um determinado caracter ou String do seu texto.
		System.out.println("Posi��o do caracter: " + posicaoCaracter);
		
		int posicaoString = s4.indexOf("parametro");
		System.out.println("Posi��o do caracter: " + posicaoString);

		
		int ultimaPosicao = s4.lastIndexOf('a');  // lastIndexOf() = retorna a ultima posi��o de um determinado String.
		System.out.println(ultimaPosicao);

		boolean vazia = s3.isEmpty(); // isEmpty() = metodo que retorna um bollean dizendo se a String esta vazia;
		System.out.println("Est� vazio: " + vazia);

		// COMPARA��O DE STRINGS

		String compara1 = "Java";
		boolean resulta = compara1.equals(s1); // equals() = compara duas Strings retornando um boolean
		System.out.println("Comparando resultado: " + resulta);

		String compara2 = "C++";
		boolean resulta1 = compara2.equals(compara1);
		System.out.println("Comparando resultado:" + resulta1);

		String compara3 = "MY SQL";
		boolean resulta2 = compara3.equalsIgnoreCase("my sql"); // equalsIgnoreCase() = compara duas strings ignorando se � letra maiuscula ou minuscula
		System.out.println("Comparando resultado: " + resulta2);

		

		String compara4 = "MY Java";
		boolean resulta3 = compara4.startsWith("My"); // startsWith() retorna um boolean = compara se o seu texto come�a com o mesmo determinado caracter ou texto - exemplo: certo pq inicia com "m"
		System.out.println("Compara se come�a com determinado caracter: " + resulta3);
		
		boolean resulta4 = compara4.startsWith("Ym"); 
		System.out.println("Compara se come�a com determinado caracter: " + resulta4); // errado pq inicia com "y"

		
		boolean resulta5 = compara4.endsWith("java");  // endsWith() retorna um boolean = compara se o seu texto termina com o mesmo determinado caracter ou texto - exemplo, termina com "java";
		System.out.println(resulta5);

		

		int compara5 = "amor".compareTo("bola"); // compareTo() retorna um inteiro = compara se a String � maior ou menor que a outra.
		System.out.println("Compara se a String � maior ou menor que a outra:" + compara5);

		
		/* O m�todo regionMatches em Java � usado para comparar partes espec�ficas de duas strings. Ele verifica se uma parte da primeira string � igual a 
		 * uma parte da segunda string.
		 * 
		 * A assinatura do m�todo �:
		 * boolean regionMatches(int toffset, String other, int ooffset, int len);
		 * 
		 *  -> toffset: O �ndice inicial da regi�o na string chamadora.
		 *  -> other: A string com a qual comparar.
		 *  -> ooffset: O �ndice inicial da regi�o na outra string.
		 *  -> len: O n�mero de caracteres a serem comparados.
		 * */
		
		String so = "Olhe, olhe!";
		boolean resultando = so.regionMatches(6, "olhe", 0, 4); 
		System.out.println("Comparar partes espec�ficas de duas strings: " + resultando);
		
		
		/*String so = "Olhe, olhe!";: Cria uma string so com o valor "Olhe, olhe!".
		 * 
		 * boolean resultando = so.regionMatches(6, "olhe", 0, 4);: Usa o m�todo regionMatches para comparar uma parte da string so com a string "olhe". 
		 * Aqui est�o os par�metros:
		 * 
		 *  -> toffset (6): Come�a a comparar a partir do �ndice 6 da string so. 
		 *  -> other ("olhe"): A string com a qual comparar.
		 *  -> ooffset (0): Come�a a comparar a partir do in�cio da string "olhe".
		 *  -> len (4): Compara os pr�ximos 4 caracteres.
		 *  
		 *  Portanto, esta compara��o come�a na parte "olhe" da string so (a partir do �ndice 6) e compara com a string "olhe". O resultado � armazenado 
		 *  na vari�vel resultando.
		 *  
		 *  System.out.println(resultando);: Imprime o resultado da compara��o no console. Se as partes comparadas forem iguais, o resultado ser� true; 
		 *  caso contr�rio, ser� false.*/
		
		
		
		boolean resultando1 = so.regionMatches(true, 6, "OlhE", 0, 4); // o "true" dentro do parametro faz ignorar as letras maiusculas e as minusculas
		System.out.println("Comparar partes espec�ficas de duas strings: " + resultando1);

		/* EXTRA��O */

		String value = "O Brasil foi colonizado pelos portugueses.";
		String texto1 = value.substring(12); // substring(beginIndex) = Encontra-se uma substring(um peda�o da String) dentro de uma String(uma frase) a partir de uma posi��o, por exemplo, vai imprimir a partir do: colonizadores...
		System.out.println("Encontrar String: " + texto1);

		
		String texto2 = value.substring(12, 23); // substring(beginIndex, endIndex) = metodo de sobrecarregar uma String a onde pode passar dois parametros, o inicio e fim para achar um peda�o de uma String dentro dessa String
		System.out.println("Sobrecarregar String: " + texto2);

		
		String texto3 = value.concat(" Partiu de Portugal e atravessou o Oceano Atlantico em suas caravelas."); // concat() = concatena uma string
		System.out.println("Concatenar String:" + texto3);

		// replace(oldChar, newChar) = trocar caracteres dentro da String
		String texto4 = value.replace("portugueses", "�ndios");
		System.out.println(texto4);

		
		
		String texto5 = value.replaceFirst(" ", "-"); // replaceFirst(regex, replacement) = trocar o primeiro espa�o em branco por um caracter
		String texto6 = value.replaceAll(" ", "-"); // replaceAll(regex, replacement) = trocar o todos os espa�os em branco por um caracter
		System.out.println("Trocar espa�o entre caracteres: " + texto5);
		System.out.println("Trocar espa�o entre caracteres: " + texto6);

		
		String value3 = "O Brasil � LINDO e maravilhoso";
		String letraMaiusc = value3.toUpperCase(); // toUpperCase() = converte as letras para maiuscula
		System.out.println("Converte as letras para maiuscula" + letraMaiusc);

		
		String letraMinusc = value3.toLowerCase(); // toLowerCase() = converte as letras para minuscula
		System.out.println("Converte as letras para minuscula" + letraMinusc);
		
		// --------------------------------------------------------------
		
		char letra;
		System.out.println("Entre com um caracter? ");
		
	
		try { /* Neste caso como n�o est� sendo instanciado um objeto com a classe Scanner vai ser preciso ter um tratamento de exce��o, pois ir� tratar o erro do usu�rio que digitar mais de uma letra. */
			letra = (char) System.in.read();
			System.out.println("O caracter escolhida �: " + letra);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		// --------------------------------------------------------------
		
		String palavra;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma palavra? ");
		palavra = s.next();
		
		System.out.println("A palavra � " + palavra);
	}
}
