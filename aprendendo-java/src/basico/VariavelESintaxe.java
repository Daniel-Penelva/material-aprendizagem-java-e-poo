package basico;

import java.util.Scanner;

public class VariavelESintaxe {

	public static void main(String[] args) {
		
		/*variavel de tipo object String para caracteres*/
			String nome = "Daniel";
			
		/*variavel do tipo int para numeros inteiros*/
			int idade = 25;
			
		/*variavel do tipo boolean para referenciar sim e n�o*/
			boolean casado = false;
			
		/*variavel do tipo double para numeros fracionados grandes*/
			double altura = 1.76;
		
		/* variavel sem valor*/
		   String rico = "";
		   
		/* variavel do tipo long  */
		   long id = 123472L;
		   
		/*Tr�s variaveis do mesmo tipo String*/
		   String carro, marca, modelo;
		   
		   carro = "Punto";
		   marca = "Fiat";
		   modelo = "2013";
		   
		   System.out.println("Nome: " + nome + '\n' + 
				              "Idade: " + idade + '\n' +
				              "Casado: " + casado + '\n' +
				              "Altura: " + altura + '\n' +
				              "Rico: " + rico + '\n' +
				              "Id: " + id + '\n' +
				              "Carro: " + carro + '\n' + 
				              "Marca: " + marca + '\n' +
				              "Modelo: " + modelo);
			
		   /*Dados Primitivos
		    * 
		    * Tipos e Tamanhos:
		    * int, byte, short, long, float, double, char, void, boolean.
		    * 
		    * char = 16 bits
		    * byte = 8 bits
		    * short = 16 bits
		    * int = 32 bits = 2 bilhoes de espa�o
		    * long = 64 bits = 9 quintilhoes de espa�o;
		    * float = 32 bits
		    * double = 64 bits
		    * boolean = 4 bits
		    * void = ----
		    **/
		   
		   /*exemplo de char - tem que ser com aspas simples e somente uma letra.*/
		   char letra = 'D';
		   
		 /*exemplo de bits - um bit suporta at� 127*/
		   byte b = 127;
		   
		 /*exemplo de short - um short suporta at� 32 mil.
		  * Uma caracteristica � que pode separar os digitos com underline */
		   short s = 31999;
		   short s1 = 31_999;
		   
		  /*exemplo de int - 32 bits = 2 bilhoes*/
		   int i = 2_000_000_000;  
		   
		   /*exemplo de long - 64 bits = 9 quintilhoes
		    * L no final � para representar que � um long*/
		    long l = 9_000_000_000_000_000_000L;
		   
		   /*exemplo na forma bin�ria
		    * para referenciar que � um numero binario inicia-se com: 0b */
		    
		    byte binaria = 0b01010101;
		   
		    System.out.println("Char: " + letra + '\n' + 
		              "Byte: " + b + '\n' +
		              "Short: " + s + '\n' +
		              "Short: " + s1 + '\n' +
		              "int: " + i + '\n' +
		              "Long: " + l + '\n' + 
		              "Binario: " + binaria);
		    
		    
		   /*Modificador final - uma vez identificado como um final ele passa a ser uma constante ele n�o pode ser 
		    * mais modificado.
		    * */
		    
		    final double PI = 3.14159265358979323846;
		    System.out.println("Constante final: " + PI + '\n');
		    
		    
		    /*AULA 11
		     * Interagindo com o usu�rio
		     * 
		     * Funcionalidade do objeto scanner  = RECUPERAR INFORMA��O DOS USUARIOS
		     * OBS: � preciso saber que o objeto scanner n�o faz parte das classes que s�o importadas automaticamente
		     * quando vc cria uma classe, por esse motivo precisa-se realizar a importar��o daquela classe com o 
		     * comando import:  "import java.util.Scanner;"
		     * 
		     * Fazer uma sauda�ao ao nome e depois imprimi-lo.
		     * */
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Qual � o seu nome? ");
		    String name = scanner.nextLine();
		    System.out.println("Bem vindo " + name);
		   
		}
}
