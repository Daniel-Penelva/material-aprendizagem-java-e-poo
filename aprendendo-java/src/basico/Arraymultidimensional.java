package basico;

public class Arraymultidimensional {
	
	public static void main(String[] args) 
	{
	 /*Dados do projeto:
	  * 
	  * 1 Dimensão                    2 Dimensão
	  * 
	  * Pessoas                       Pessoas      Sexo   Estado            
	  * 0 - Ricardo               0 - Ricardo       M       RJ       linha(->)
	  * 1 - Daniel                1 - Daniel        M       MG
	  * 2 - Biana                 2 - biana         F       DF
	  * 3 - Laura                 3 - Laura         F       PA
	  * 4 - Marta                 4 - Marta         F       SP
	  * 5 - Carlos                5 - Carlos        M       RJ
	  *                      ^           
	  *               coluna(|)         0           1        2
	  *               
	  * matriz[linha][coluna]
	  **/
		
		String[] umaDimensao = {"Ricardo","Daniel","Biana","Laura","marta","Carlos"};
		
		for(int i=0; i< umaDimensao.length; i++) {
			System.out.println("Posição " + i + ": " + umaDimensao[i]);
		}
		
		System.out.println();
		
		String[][] duasDimensao = {
				                    {"Ricardo","M","RJ"},{"Daniel","M","MG"},{"Biana","F","DF"},
				                    {"Laura","F","PA"},{"Marta","F","SP"},{"Carlos","F","RJ"},
				
		                          };
		
		for(int i=0; i< duasDimensao.length; i++) {
			for(int y=0; y<duasDimensao[i].length; y++) {
				System.out.println(duasDimensao[i][y] + "");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*Recuperar os dados*/
		System.out.println("Acessar qualquer elemento da dimensão um: " + umaDimensao[1]);
		System.out.println("Acessar qualquer elemento \"RJ\" da dimensão dois:" + duasDimensao[0][2]);
		
		/*Quantidade de elementos da dimensao dois*/
	     System.out.println(duasDimensao.length);
	     
	     /*Quantidade de elementos da dimensao dois dentro do array interno*/
	     System.out.println(duasDimensao[0].length);

	}

}
