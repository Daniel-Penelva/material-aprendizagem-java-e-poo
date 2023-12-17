package basico;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		int i, y, z, auxiliar;
		
		Scanner lista = new Scanner(System.in);

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		int[] vetor = { 4, 8, 5, 29, 1, 40, 31, 66, 7, 2 };

		// ordem crescente

		for (i = 0; i < 9; i++) {
			for (y = i + 1; y < 10; y++) {
				if (vetor[i] > vetor[y]) {
					
					auxiliar = vetor[i];
					vetor[i] = vetor[y];
					vetor[y] = auxiliar;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido!!!");
		for (i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		int[] vetor2 = new int[10];

		vetor2[0] = 32;
		vetor2[1] = 90;
		vetor2[2] = 1;
		vetor2[3] = 10;
		vetor2[4] = 4;
		vetor2[5] = 9;
		vetor2[6] = 18;
		vetor2[7] = 101;
		vetor2[8] = 91;
		vetor2[9] = 8;

		// ordem crescente

		for (i = 0; i < 9; i++) {
			for (y = i + 1; y < 10; y++) {
				if (vetor2[i] > vetor2[y]) {
					auxiliar = vetor2[i];
					vetor2[i] = vetor2[y];
					vetor2[y] = auxiliar;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor2[i]);
		}

		System.out.println("\n" + "Array Invertido");
		for (i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor2[i]);
		}

		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		int[] vetor3 = new int[10];

		vetor3[0] = 32;
		vetor3[1] = 90;
		vetor3[2] = 1;
		vetor3[3] = 10;
		vetor3[4] = 4;
		vetor3[5] = 9;
		vetor3[6] = 18;
		vetor3[7] = 101;
		vetor3[8] = 91;
		vetor3[9] = 8;

		// ordem crescente

		for (i = 0; i < 9; i++) {
			for (y = i + 1; y < 10; y++) {
				if (vetor3[i] > vetor3[y]) {
					auxiliar = vetor3[i];
					vetor3[i] = vetor3[y];
					vetor3[y] = auxiliar;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor3[i]);
		}

		System.out.println("\n" + "Array Invertido");
		for (i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor3[i]);
		}

		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */

		int vetor4[] = new int[4]; // cria um vetor de 4 posições

		lista = new Scanner(System.in); // Manipula os valores através do índice (posição)
		System.out.println("Informe 4 valores inteiros para a lista.");

		System.out.println("Informe 1º valor inteiro para a lista? ");
		vetor4[0] = lista.nextInt();
		System.out.println("Informe 2º valor inteiro para a lista? ");
		vetor4[1] = lista.nextInt();
		System.out.println("Informe 3º valor inteiro para a lista? ");
		vetor4[2] = lista.nextInt();
		System.out.println("Informe 4º valor inteiro para a lista? ");
		vetor4[3] = lista.nextInt();

		System.out.println("Lista: " + vetor4[0] + '-' + vetor4[1] + '-' + vetor4[2] + '-' + vetor4[3]);

		// ou

		System.out.println("\n\n");

		for (i = 0; i < 4; i++) {
			System.out.println(vetor4[i]);
		}

		System.out.println("Array invertido!!!");

		for (int j = 4 - 1; j >= 0; j--) {
			System.out.println(vetor4[j]);
		}
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		//manipulando os valores atraves do indice(posição)
	    lista = new Scanner(System.in);
	    
	   //cria um vetor de 4 posições
	    int vetor5[] = new int[4];
	    
	    while(i < 4){ 
	    	
	      System.out.println("Entre com o valor desejado na posição " + (i+1) + "º ?");
	      vetor[i] = lista.nextInt();
	      i++;
	    }
	    
	    System.out.println("\n\n");
	    
	    for(i=0; i<4; i++){
	    	 System.out.println(vetor5[i]);
	    }
	      
	    System.out.println("Array invertido");
	     for(int j=4-1; j>=0; j--){
	    	 System.out.println(vetor5[j]);
	     }
	     
	     
	     System.out.println("\n\n");
		  /* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
	     
	   //cria um vetor de 4 posições
		   int[] vetor6 = new int[4];
		  
		   lista = new Scanner(System.in);
		    
		    for (i = 0; i < 4; i++){
		        System.out.println("Entre com o valor desejado na posição " + (i+1) + "º ?");
		    	vetor6[i] = lista.nextInt();
			}
		    
		    System.out.println("\n\n");
		    
		    for(i=0; i<4; i++){
		    	System.out.println(vetor6[i]);
		    }
		      
		    System.out.println("\n" + "Array invertido");
			    
		    for(i=4-1; i>=0; i--){
		    	 System.out.println(vetor6[i]);
		    }

	}

}
