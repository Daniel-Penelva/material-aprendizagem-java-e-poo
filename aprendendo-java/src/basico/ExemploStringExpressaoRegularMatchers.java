package basico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploStringExpressaoRegularMatchers {

	public static void main(String[] args) {
		
		/**
		 * O método matches() é um método da classe String em Java que é usado para verificar se a string corresponde a uma determinada expressão regular. 
		 * A expressão regular é um padrão que descreve um conjunto de strings.
		 * 
		 * A assinatura do método matches() é a seguinte:
		 * boolean matches(String regex);
		 * 
		 * O método retorna true se a string inteira corresponder à expressão regular fornecida e false caso contrário.
		 * */

		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("Exemplo 1");
		
		String texto = "Java";
		boolean resulta = texto.matches(texto); // matches() - este método é definido pelo expressao regular e retorna um boolean
		System.out.println(resulta);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 2");
		
		String textoOla = "Olá";
		String textoMundo = "Mundo";
		
		boolean resulta1 = textoMundo.matches("Olá");
		boolean resulta2 = textoOla.matches(textoMundo);
		
		System.out.println(resulta1);  // Saída: false
		System.out.println(resulta2);  // Saída: false
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 3");
		
		String numero = "12345";
		boolean resultaNumero = numero.matches("\\d+");  // \\d+ corresponde a um ou mais dígitos
		System.out.println(resultaNumero);  // Saída: true
	
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 4");
		
		String email = "usuario@example.com";
		boolean resultaEmail = email.matches("[a-zA-Z]+@[a-zA-Z]+\\.com"); // Neste exemplo, a expressão regular [a-zA-Z]+@[a-zA-Z]+\\.com é uma aproximação simples de um padrão de e-mail. Note que este padrão é muito básico e não cobre todos os casos válidos de endereços de e-mail.
		System.out.println(resultaEmail);  // Saída: true
		
		/**
		 * IMPORTANTE!!! É importante mencionar que, se o delimitador for uma expressão regular especial, você precisará escapá-lo corretamente. Por exemplo, 
		 * para dividir por um ponto (que é um caractere especial em expressões regulares), você deve usar "\\.".*/
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 5");
		
		String telefone = "123-456-7890";
		boolean resultaTelefone = telefone.matches("\\d{3}-\\d{3}-\\d{4}"); // A expressão regular \\d{3}-\\d{3}-\\d{4} corresponde a um padrão de número de telefone dos EUA.
		System.out.println(resultaTelefone);  // Saída: true
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 6");
		
		String parteDoTexto = "Isso é um exemplo.";
		boolean resultaParteTexto = parteDoTexto.matches(".*exemplo.*"); // Aqui, a expressão regular .*exemplo.* corresponde a qualquer string que contenha a palavra "exemplo" em qualquer lugar.
		System.out.println(resultaParteTexto);  // Saída: true

		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 7");
		
		String frase = "Java é uma linguagem de programação.";
		boolean resultaFrase = frase.matches("\\bJava\\b.*"); // A expressão regular \\bJava\\b.* corresponde a qualquer string que comece com a palavra "Java".
		System.out.println(resultaFrase);  // Saída: true
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 8");
		
		boolean b = "linguagem java".matches("linguagem java");
		System.out.println(b);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 9 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 9");
		
		/**
		 * Modificadores
		 *  -> (?i), ignora letra maiusculas e minusculas - case sensitive
		 *  -> (?x), comentarios
		 *  -> (?m), multilinhas - espaços
		 *  -> (?s), Dottal - quebra de linha
		 * */
		
		boolean b1 = "linguagem java".matches("(?i)Linguagem JAVA");  //  Modificador de expressão regular que torna a correspondência case-insensitive, ignorando a diferença entre maiúsculas e minúsculas.
		System.out.println(b1);
		
		boolean b2 = "linguagem java".matches("(?ims)Linguagem JAVA"); // Modificadores combinados que tornam a correspondência case-insensitive (i), habilitam a correspondência de espaços (m), e habilitam a correspondência de quebras de linha (s).
		System.out.println(b2);
		
		/*A expressão regular (?)Linguagem JAVA tenta corresponder a "Linguagem JAVA" na string "linguagem java", ignorando diferenças de maiúsculas e minúsculas, espaços e quebras de linha.*/
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 10 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 10");
		
		/**
		 * Metacaracteres - são caracteres especiais que indicam a ocorrência de números, letras ou espaços no seu texto:
		 * . qualquer caractere (ex: &*@$%!)
		 * \\d dígitos                [0-9]
		 * \\D não é dígito           [^0-9]
		 * \\s espaços                [\t\n\x0B\f\r]
		 * \\S não é espaço           [^\s]
		 * \\w letras ou números      [a-zA-Z_0-9]
		 * \\W não é letra ou número  [^\w]
		 */
		
		boolean b3 = "@".matches(".");
		System.out.println(b3);
		
		boolean b4 = "2".matches("\\d");
		System.out.println(b4);
		
		boolean b5 = "g".matches("\\w");
		System.out.println(b5);
		
		boolean b6 = "#".matches("\\w");
		System.out.println(b6);
		
		boolean b7 = " ".matches("\\s");
		System.out.println(b7);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 11 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 11");
		
		boolean b8 = "daniel@".matches(".*"); // Se deseja verificar se a string contém pelo menos um caractere, pode usar a expressão regular ".*" que significa "zero ou mais de qualquer caractere".
		System.out.println(b8);
		
		boolean b9 = "daniel@".matches("\\w+"); // Se deseja verificar se a string contém pelo menos um caractere alfanumérico, pode usar a expressão regular "\\w+"
		System.out.println(b9);

		/*
		 * \\w: corresponde a qualquer caractere alfanumérico (letras, números ou sublinhado).
		 * +: significa "uma ou mais ocorrências".*/
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 12 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 12");
		
		boolean contemDigito1 = "dan1el".matches(".*[^\\d]1[^\\d].*");
		System.out.println(contemDigito1);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 13 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 13");
		
		boolean cep = "20261-240".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
		System.out.println(cep);
		
		// ou mais simplificado 
		boolean cepSimplificado = "20261-240".matches("\\d{5}-\\d{3}");
		System.out.println(cepSimplificado);

		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 14 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 14");
		
		/**
		  Quantificadores

		   {n}     X, exatamente n vezes - procura a quantidade de caracteres X exatamente n vezes
		   {n,}    X, pelo menos n vezes
		   {n, m}  X, pelo menos n mas não mais do que m vezes
		   ?       X, 0 ou 1 vez - procura a ocorrência daquele padrão
		   *       X, 0 ou + vezes
		   +       X, 1 ou + vezes  
		*/
		
		boolean b12 = "71".matches("\\d{2}"); //procurando 2 digitos
		System.out.println(b12);
				
		boolean b13 = "717".matches("\\d{2,}"); //procurando pelo menos 2 digitos
		System.out.println(b13);
			    
		boolean b14 = "12345".matches("\\d{2,5}"); //procurando se tem pelo menos 2 digitos e não pode passar de 5 digitos
		System.out.println(b14); 
				
		boolean b15 = " ".matches(".?"); // procura uma ocorrencia entre zero ou 1 vez
		System.out.println(b15); 
			    
		boolean b16 = "12 ".matches(".*");
		System.out.println(b16); 
			    
		boolean b17 = "12434343434343 ".matches(".*");
		System.out.println(b17); 
			    
		boolean b18 = "".matches(".*"); // tem que ter pelo menos uma ocorrencia
		System.out.println(b18); 
			    
		boolean data = "17/12/1987".matches("\\d{2}/\\d{2}/\\d{4}"); //Expressao de validação de data - dd/MM/AAAA
		System.out.println(data); 
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 15 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 15");


		/**
		  Metacaracteres de Fronteira - definem na sua String se ela começa ou termina com um determinado padrão

		    ^   inicia
		    $   finaliza
		    |   ou
		 */
		
		
		boolean teste = "Pier23".matches("^Pier.*"); // defini se começa com a palavra "Pier" q tenha qlq caracter(.) entre zero ou n caracteres(*)
		System.out.println(teste);
				
		boolean teste1 = "Pier23".matches(".*23$"); //defini se finaliza com o digito "23" que tenha antes qlq caracter(.) entre zero ou n caracteres(*)
		System.out.println(teste1);
						
		boolean teste2 = "tem java aqui".matches(".*java.*"); //ocorrencia de uma palavra no meio do texto(java)
		System.out.println(teste2);
				
		boolean teste3 = "tem java aqui".matches("^tem.*aqui$"); //ocorrencia que inicia com uma palavra(tem) e finaliza com uma palavra(aqui)
		System.out.println(teste3);
				
		boolean teste4 = "sim".matches("sim|nao"); //ocorrencia para metacaracter ou
		System.out.println(teste4);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 16 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 16");
		
		/**
		Agrupadores - eles agrupam conjuntos de caracteres 

		[...]          Agrupamento - conjunto de letras
		[a-z]          Alcance - procura todos os caracteres entre 'a' até 'z' em letras minúsculas
		[a-e][i-q]     União - procura caracteres entre 'a' até 'e' (ou seja, 'a', 'b', 'c', 'd', 'e') 
		               e caracteres entre 'i' até 'q' (ou seja, 'i', 'p', 'q')
		[a-z&&[aeiou]] Interseção - procura caracteres entre 'a' até 'z' que também são vogais ('a', 'e', 'i', 'o', 'u')
		[^abc]         Exceção - considera tudo, exceto as letras 'a', 'b', 'c'
		[a-z&&[^m-p]] Subtração - procura caracteres entre 'a' até 'z', excluindo 'm', 'n', 'o', 'p'
		\x             Fuga Literal
		*/
		
		
		boolean teste5 = "g".matches("[a-z]"); //procurar qlq letra de a ate z
		System.out.println(teste5);
				
		boolean teste6 = "A".matches("[a-zA-Z]"); //procurar qlq letra de a ate z - vai dar negativo pois a letra é maiuscula
		System.out.println(teste6);
				
		boolean teste9 = "True".matches("[tT]rue"); //vai validar mesmo q seja letra maiuscula ou minuscula a letra "t" 
		System.out.println(teste9);
				
		boolean teste10 = "yes".matches("[tT]rue|[yY]es"); //vai validar mesmo q seja letra maiuscula ou minuscula a letra "t" 
		System.out.println(teste10);
				
		boolean teste7 = "4".matches("[0-9]"); //procurar qlq numero de zero ate 9 
		System.out.println(teste7);
				
		boolean teste8 = "124".matches("[0-9]+"); //procurar qlq numero de zero ate 9 
		System.out.println(teste8);
				
		boolean teste11 = "Daniel".matches("[A-Z].*"); //validação para nome - sempre começa com letra maiuscula
		System.out.println(teste11);
				
		// ou pode fazer assim:
		boolean teste12 = "Daniel".matches("[A-Za-z].*");
		System.out.println(teste12);
				
		boolean teste13 = "Daniel".matches("[A-Z][a-z].*"); //validação para nome - sempre começa com letra maiuscula e depois com a letra minuscula
		System.out.println(teste13);
				
		boolean teste14 = "olho".matches("[^aft].*"); //validação de exceçao - vai dar true
		System.out.println(teste14);
				 	
		boolean teste15 = "olho".matches("[^oet].*"); //validação de exceçao - vai dar false 
		System.out.println(teste15);
				 
		boolean teste16 = "crau".matches("cr[ae]u.*");
		System.out.println(teste16);
				 	
		boolean teste17 = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w+\\.\\w{2}"); // validação de email
		System.out.println(teste17);
				 
		boolean teste18 = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}"); // validação de email
		System.out.println(teste18);
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 17 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 17");
		
		String doce = "Qual é o Doce mais doCe que o doce";
		Matcher m = Pattern.compile("(?i)doce").matcher(doce); 
		 
		while(m.find()){ 
		  System.out.println(m.group());
		}
		
		
        /**
         * 1. String doce = "Qual é o Doce mais doCe que o doce";: Define uma string contendo a frase "Qual é o Doce mais doCe que o doce".
         * 
         * 2. Matcher m = Pattern.compile("(?i)doce").matcher(doce);: Cria um objeto Matcher usando uma expressão regular compilada. 
         *    A expressão regular "(?i)doce" significa:
	     *       . (?i): Ativa a correspondência insensível a maiúsculas e minúsculas.
	     *       . doce: Procura pela palavra "doce".
         *   
         * 3. while (m.find()) { System.out.println(m.group()); }: Usa o método find() do Matcher para encontrar todas as correspondências na string. 
         * Dentro do loop, m.group() retorna a substring correspondente encontrada.
         * 
         * Isso ocorre porque a expressão regular (i?)doce com o modificador (?i) permite encontrar todas as ocorrências da palavra "doce" 
         * independentemente de estar em maiúsculas ou minúsculas. O método find() no loop while itera sobre todas essas ocorrências e imprime cada uma 
         * delas.
         * */
		
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 18 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		System.out.println("\n" + "Exemplo 18");
		
		
		 String r = doce.replaceAll("(?i)doce", "DOCINHO"); // Substitui todas as ocorrências doce por outra ocorrencia - usando o metodo replace()
		 System.out.println(r);
		 
	
		 String rato = "O rato roeu a roupa do rei de roma"; // Substitui todas as letras ra, re, ri, ro	 
		 String ra = rato.replaceAll("r[aeiou]", "XX");
		 System.out.println(ra);
		 
   
		  String tabular = "Tabular este texto".replaceAll("\\s","\t"); //Substitui os espaços por tabulação
		  System.out.println(tabular);
	 
		  //vamos criar variaveis dentro do seu texto e utilizar essa variavel para criar formatação.
		  String url = "www.xti.com.br/clientes-2011.html";
		  String RegulaExpression = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		  b = url.matches(RegulaExpression);
		  System.out.println(b);
		  
		  
		  RegulaExpression = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html"; 
		 
		  // Construir esse padrão: http://www.xti.com.br/2011/clientes.jsp - vai ser subdivido em variáveis $1, $2 e $3:
		  // (www.xti.com.br)/ = $1
		  // (\\w{2,}) = $2 
		  //(\\d{4}) = $3
		 
			String Re = url.replaceAll(RegulaExpression, "http://$1/$3/$2.jsp"); //http://(www.xti.com.br)/(2011)/(clientes).jsp 
			System.out.println(Re);
			
			//para comparar:
			System.out.println(url);
			System.out.println(Re);
			
	}

}
