package basico;

public class IfEElse {

	public static void main(String[] args) {
		
		/* Exemplo 1*/ 
		int idade = 16;
		 
		if(idade <= 17)
		 {
		   System.out.println("Adolescente");
		 }
		 
		 
		 /* Exemplo 2 */
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
		
		
		/* Exemplo 4 */
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
		
		
		/*Exemplo 5*/
		 boolean passou = true;
		 
		 if(passou)
		 {
			System.out.println("Contratado"); 
		 }
		 else
		 {
			 System.out.println("Tente outra vez.");
		 }
		
		 
		 /* Exemplo 6 */
		 int numero = 12;
		 
		 if((numero % 2) == 0)
		 {
		   System.out.println("Número Par.");
		 }
		 else
		 {
		   System.out.println("Número Impar."); 
		 }
		 
		 
		 /*Exemplo 7 - métodp equals() - este método é para comparar somente valores iguais*/
		 
		 String cor = "Verde";
		 
		 if(cor.equals("Azul"))
		 {
			 System.out.println("Sua cor preferida é azul.");
		 }
		 else
		 {
			 System.out.println("Está cor não existe.");	 
		 }
		 
		 // Exemplo 7
		 int nota_final = 5;
			
			//podendo varrer um ou mais condição.
			if(nota_final <=5)
				System.out.println("Reprovado");
			if(nota_final >=5 && nota_final <= 7)
				System.out.println("Conversar com professor");
			else
				System.out.println("Aprovado");
			

			// Exemplo 8 - varrendo uma unica condição
			System.out.println("");
			
			if(nota_final <=5)
				System.out.println("Reprovado");
			else if(nota_final >=5 && nota_final <= 7)
				System.out.println("Conversar com professor");
			else
				System.out.println("Aprovado");
			
			
			// Exemplo 9 - Como estruturar de forma ANINHADA corretamente
			System.out.println("");
			
			int x = 5, y=0;
			
			if(x > 5){
				if(y > 5)
				    System.out.println("x e y é maior que 5");        
			}
			else
			      System.out.println("x e y é menor que 5");
			
			
			// Exemplo 10 - Como estruturar de forma ANINHADA corretamente
			System.out.println("");
			System.out.println(x>=5 ? "x é maior que 5" : "x é menor que 5");
	}
}
