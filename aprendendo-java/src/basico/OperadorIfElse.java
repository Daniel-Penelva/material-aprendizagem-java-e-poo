package basico;

public class OperadorIfElse {

	public static void main(String[] args) {
		
		/* Exemplo 1*/ 
		System.out.println("Exemplo 1");
		int idade = 16;
		 
		if(idade <= 17)
		 {
		   System.out.println("Adolescente");
		 }
		 
		 
		 /* Exemplo 2 */
		System.out.println();
		System.out.println("Exemplo 2");
		
		int idade1 = 20;
		 
		if(idade1 <= 17)
		 {
		   System.out.println("Adolescente");
		 }
		else
		 {
		   System.out.println("Adulto"); 
		 }
		
		/* Exemplo 3*/
		System.out.println();
		System.out.println("Exemplo 3");
		
		int age = 18;
		int idadeParaDirigir = 18;
		int idadeParaNamorar = 18;
		int idadeParaBeber = 21;
		
		if (age >= idadeParaDirigir) {
			System.out.println("Pode dirigir!");
		}
		if (age >= idadeParaNamorar) {
			System.out.println("Pode namorar!");
		}
		if (age >= idadeParaBeber) {
			System.out.println("Pode beber!");
		}
		else {
			System.out.println("É de maior");
		}
		
	
		 /* Exemplo 4*/
		System.out.println();
		System.out.println("Exemplo 4");
		 
		int id = 50;
		 
		if(id <= 10)
		 {
			 System.out.println("criança"); 
		 }
		else if(id >= 11 && id <=17) 
		 {
			 System.out.println("Adolescente");
		 }
		else if(id >= 18 && id <= 45)
		 {
			 System.out.println("Adulto");
		 }
		else
		 {
			 System.out.println("Idoso");
		 }
		
		
		/* Exemplo 5 */
		System.out.println();
		System.out.println("Exemplo 5");
		
		float nota = 5F;   // OBS. O "F" é para indicar que é um tipo float
		
		if(nota >= 7)
		{
			System.out.println("Aprovado");
		}
		else
		{
		   System.out.println("Reprovado");
		     if(nota >= 5 && nota <= 6)
		     {
		    	 System.out.println("Chance para prova!");
		     }
		}
		
		
		/*Exemplo 6*/
		System.out.println();
		System.out.println("Exemplo 6");
		
		 boolean passou = true;
		 
		 if(passou)
		 {
			System.out.println("Contratado"); 
		 }
		 else
		 {
			 System.out.println("Tente outra vez.");
		 }
		
		 
		 /* Exemplo 7 */
		 System.out.println();
		 System.out.println("Exemplo 7");
		 
		 int numero = 12;
		 
		 if((numero % 2) == 0)
		 {
		   System.out.println("N�mero Par.");
		 }
		 else
		 {
		   System.out.println("N�mero Impar."); 
		 }
		 
		 
		 /*Exemplo 8 - m�todp equals() - este m�todo � para comparar somente valores iguais*/
		 System.out.println();
		 System.out.println("Exemplo 8");
		 
		 String cor = "Verde";
		 
		 if(cor.equals("Azul"))
		 {
			 System.out.println("Sua cor preferida é azul.");
		 }
		 else
		 {
			 System.out.println("Está cor não existe.");	 
		 }
		 
		 // Exemplo 9
		 System.out.println();
		 System.out.println("Exemplo 9");
		 
		 int nota_final = 5;
			
			//podendo varrer um ou mais condição.
			if(nota_final <=5)
				System.out.println("Reprovado");
			if(nota_final >=5 && nota_final <= 7)
				System.out.println("Conversar com professor");
			else
				System.out.println("Aprovado");
			

			// Exemplo 10 - varrendo uma unica condição
			System.out.println();
			System.out.println("Exemplo 10");
			
			System.out.println("");
			
			if(nota_final <=5)
				System.out.println("Reprovado");
			else if(nota_final >=5 && nota_final <= 7)
				System.out.println("Conversar com professor");
			else
				System.out.println("Aprovado");
			
			
			// Exemplo 11 - Como estruturar de forma ANINHADA corretamente
			System.out.println();
			System.out.println("Exemplo 11");
			
			int x = 5, y=0;
			
			if(x > 5){
				if(y > 5)
				    System.out.println("x e y é maior que 5");        
			}
			else
			      System.out.println("x e y é menor que 5");
			
			
			// Exemplo 12 - Como estruturar de forma ANINHADA corretamente
			System.out.println("");
			System.out.println("Exemplo 12");
			System.out.println(x>=5 ? "x é maior que 5" : "x é menor que 5");
			
			
			/* Exemplos 13  - utilizando outros operadores 
			 * AND (&&) → só é verdadeiro se todas as condições forem verdadeiras.
			 * OR (||) → é verdadeiro se qualquer condição for verdadeira.
			 * NOT (!) → inverte o valor lógico da variável.
			 * XOR (^) → verdadeiro se apenas uma das condições for verdadeira.
			 * */
			System.out.println("");
			System.out.println("Exemplo 13");
			
			
			int idade2 = 20;
			boolean temCarteira = true;
			boolean temMulta = false;
			
			// Exemplo de AND (&&)
			if (idade2 >= 18 && temCarteira) {
				System.out.println("Pode Dirigir");
			} else {
				System.out.println("Não pode dirigir");
			}
			
			// Exemplo de OR (||)
			if (idade <= 18 && !temCarteira) {
				System.out.println("Não pode dirigir");
			} else {
				System.out.println("Pode Dirigir");
			}
			
			// Exemplo de NOT (!)
			if (!temMulta) {
				System.out.println("Sem multas, tudo certo!");
			} else {
				System.out.println("Tem multa, atenção!");
			}
			
			
			// Exemplo XOR (^)
			boolean passouTesteTeorico = true;
			boolean passouTestePratico = false;
			
			if (passouTesteTeorico ^ passouTestePratico) {
				System.out.println("Aprovou em apenas um teste");
			} else if (passouTesteTeorico && passouTestePratico) {
	            System.out.println("Aprovou em todos os testes!");
	        } else {
	            System.out.println("Reprovou em todos os testes.");
	        }
	}
}
