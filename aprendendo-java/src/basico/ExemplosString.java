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

		/* OPERAÇÕES BÁSICAS DE UMA STRING */

		int tamanho = s1.length(); // length() = vai retornar o numero de caracteres dentro da sua String;
		System.out.println("Número total de caracteres: " + tamanho);

		char buscaCaracter = s1.charAt(2); // CharAt() = busca atraves do indice um determinado caracter 
		System.out.println("Buscando caracter: " + buscaCaracter);

		
		String texto = s2.toString(); // toString() = retorna a própria String
		System.out.println(texto);

		/* MÉTODOS DE LOCALIZAÇÃO DE CARACTERES E STRING DO SEU TEXTO */

		

		int posicaoCaracter = s1.indexOf('t');  // indexOf() = retorna a posicao de um determinado caracter ou String do seu texto.
		System.out.println("Posição do caracter: " + posicaoCaracter);
		
		int posicaoString = s4.indexOf("parametro");
		System.out.println("Posição do caracter: " + posicaoString);

		
		int ultimaPosicao = s4.lastIndexOf('a');  // lastIndexOf() = retorna a ultima posição de um determinado String.
		System.out.println(ultimaPosicao);

		boolean vazia = s3.isEmpty(); // isEmpty() = metodo que retorna um bollean dizendo se a String esta vazia;
		System.out.println("Está vazio: " + vazia);

		// COMPARAÇÃO DE STRINGS

		String compara1 = "Java";
		boolean resulta = compara1.equals(s1); // equals() = compara duas Strings retornando um boolean
		System.out.println("Comparando resultado: " + resulta);

		String compara2 = "C++";
		boolean resulta1 = compara2.equals(compara1);
		System.out.println("Comparando resultado:" + resulta1);

		String compara3 = "MY SQL";
		boolean resulta2 = compara3.equalsIgnoreCase("my sql"); // equalsIgnoreCase() = compara duas strings ignorando se é letra maiuscula ou minuscula
		System.out.println("Comparando resultado: " + resulta2);

		

		String compara4 = "MY Java";
		boolean resulta3 = compara4.startsWith("My"); // startsWith() retorna um boolean = compara se o seu texto começa com o mesmo determinado caracter ou texto - exemplo: certo pq inicia com "m"
		System.out.println("Compara se começa com determinado caracter: " + resulta3);
		
		boolean resulta4 = compara4.startsWith("Ym"); 
		System.out.println("Compara se começa com determinado caracter: " + resulta4); // errado pq inicia com "y"

		
		boolean resulta5 = compara4.endsWith("java");  // endsWith() retorna um boolean = compara se o seu texto termina com o mesmo determinado caracter ou texto - exemplo, termina com "java";
		System.out.println(resulta5);

		

		int compara5 = "amor".compareTo("bola"); // compareTo() retorna um inteiro = compara se a String é maior ou menor que a outra.
		System.out.println("Compara se a String é maior ou menor que a outra:" + compara5);

		
		/* O método regionMatches em Java é usado para comparar partes específicas de duas strings. Ele verifica se uma parte da primeira string é igual a 
		 * uma parte da segunda string.
		 * 
		 * A assinatura do método é:
		 * boolean regionMatches(int toffset, String other, int ooffset, int len);
		 * 
		 *  -> toffset: O índice inicial da região na string chamadora.
		 *  -> other: A string com a qual comparar.
		 *  -> ooffset: O índice inicial da região na outra string.
		 *  -> len: O número de caracteres a serem comparados.
		 * */
		
		String so = "Olhe, olhe!";
		boolean resultando = so.regionMatches(6, "olhe", 0, 4); 
		System.out.println("Comparar partes específicas de duas strings: " + resultando);
		
		
		/*String so = "Olhe, olhe!";: Cria uma string so com o valor "Olhe, olhe!".
		 * 
		 * boolean resultando = so.regionMatches(6, "olhe", 0, 4);: Usa o método regionMatches para comparar uma parte da string so com a string "olhe". 
		 * Aqui estão os parâmetros:
		 * 
		 *  -> toffset (6): Começa a comparar a partir do índice 6 da string so. 
		 *  -> other ("olhe"): A string com a qual comparar.
		 *  -> ooffset (0): Começa a comparar a partir do início da string "olhe".
		 *  -> len (4): Compara os próximos 4 caracteres.
		 *  
		 *  Portanto, esta comparação começa na parte "olhe" da string so (a partir do índice 6) e compara com a string "olhe". O resultado é armazenado 
		 *  na variável resultando.
		 *  
		 *  System.out.println(resultando);: Imprime o resultado da comparação no console. Se as partes comparadas forem iguais, o resultado será true; 
		 *  caso contrário, será false.*/
		
		
		
		boolean resultando1 = so.regionMatches(true, 6, "OlhE", 0, 4); // o "true" dentro do parametro faz ignorar as letras maiusculas e as minusculas
		System.out.println("Comparar partes específicas de duas strings: " + resultando1);

		/* EXTRAÇÃO */

		String value = "O Brasil foi colonizado pelos portugueses.";
		String texto1 = value.substring(12); // substring(beginIndex) = Encontra-se uma substring(um pedaço da String) dentro de uma String(uma frase) a partir de uma posição, por exemplo, vai imprimir a partir do: colonizadores...
		System.out.println("Encontrar String: " + texto1);

		
		String texto2 = value.substring(12, 23); // substring(beginIndex, endIndex) = metodo de sobrecarregar uma String a onde pode passar dois parametros, o inicio e fim para achar um pedaço de uma String dentro dessa String
		System.out.println("Sobrecarregar String: " + texto2);

		
		String texto3 = value.concat(" Partiu de Portugal e atravessou o Oceano Atlantico em suas caravelas."); // concat() = concatena uma string
		System.out.println("Concatenar String:" + texto3);

		// replace(oldChar, newChar) = trocar caracteres dentro da String
		String texto4 = value.replace("portugueses", "índios");
		System.out.println(texto4);

		
		
		String texto5 = value.replaceFirst(" ", "-"); // replaceFirst(regex, replacement) = trocar o primeiro espaço em branco por um caracter
		String texto6 = value.replaceAll(" ", "-"); // replaceAll(regex, replacement) = trocar o todos os espaços em branco por um caracter
		System.out.println("Trocar espaço entre caracteres: " + texto5);
		System.out.println("Trocar espaço entre caracteres: " + texto6);

		
		String value3 = "O Brasil é LINDO e maravilhoso";
		String letraMaiusc = value3.toUpperCase(); // toUpperCase() = converte as letras para maiuscula
		System.out.println("Converte as letras para maiuscula" + letraMaiusc);

		
		String letraMinusc = value3.toLowerCase(); // toLowerCase() = converte as letras para minuscula
		System.out.println("Converte as letras para minuscula" + letraMinusc);
		
		// --------------------------------------------------------------
		
		char letra;
		System.out.println("Entre com um caracter? ");
		
	
		try { /* Neste caso como não está sendo instanciado um objeto com a classe Scanner vai ser preciso ter um tratamento de exceção, pois irá tratar o erro do usuário que digitar mais de uma letra. */
			letra = (char) System.in.read();
			System.out.println("O caracter escolhida é: " + letra);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		// --------------------------------------------------------------
		
		String palavra;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma palavra? ");
		palavra = s.next();
		
		System.out.println("A palavra é " + palavra);
	}
}
