package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaGrafica {
	
public static void main(String[] args) {
		
		/* Tipo Object = JOptionPane
		 * metodo = showInputDialog("");
		 * Dentro do parametro ele recebe um string que vc pode usar para interagir com o usuario
		 * 
		 *  OBS: é preciso importa essa classe JOptionPane. vamos importar: import javax.swing.JOptionPane;
		 *  Ela esta dentro do pacote swing, dentro deste pacote ela tem varias classes utilizadas para criação de interface graficas para o usuário. 
		 *   */
	  String nome = JOptionPane.showInputDialog("Entre com o seu nome:");
	  // System.out.println("seu nome é :" + nome);
	  
	  /*Podemos usar a class JOptionPane para imprimir a mensagem para o usuario.*/
	  JOptionPane.showMessageDialog(null, "Seu nome: " + nome);
	  
	  
	  /* Operadores */
	  
	  /* pré-incremento */
	  int x = 6;
	  
	  int y = ++x;
	  
	  System.out.println("Valor de x: " + x);  //7
	  System.out.println("Valor de y: " + y);   //7
	  
	  /* pós-incremento */
      int z = 6;
	  int w = z++;
	  
	  System.out.println("Valor de x: " + z);  //6
	  System.out.println("Valor de y: " + w);  //7
	  
	  /* Operador de comparação */
	  
	  Integer t = 9;
	  System.out.println(t == 6);
	  System.out.println(t != 6);
	  
	  /* Verifica se t é do tipo Integer mas, o correto deveria ser assim:
	   * Integer t = new Integer(9);
	   * */
	  System.out.println(t instanceof Integer);
	  
	  
	  
	  /*
	   * Operadores Especiais:
	   * ?:       operador ternário
	   * ,        separação de expressões
	   * ()       chamada de método
	   * (cast)   coersão unária
	   * 
	   * Exemplo1
	   * */
	  
	  int idade = 25;
	  String i = (idade >= 18) ? "Maior de idade" : "menor de idade";
	  System.out.println(i);
	  
	  /*Exemplo 2*/
	  String sexo = "M", pais = "Brasil";
	  System.out.println("seu sexo é: " + sexo + " e seu país é :" + pais);
	  
	  /*Diametro  : 2r e Circunferencia : 2 Pi r*/
	  
	  double raio = 10;
	  double diametro = raio * 2;
	  
	  double pi = Math.PI;
	  double circunferencia = 2 * pi * raio;
	  System.out.println("Valor do diametro: " + diametro + '\n' + "Valor de circunferencia: " + circunferencia);
	  
	  /* Exemplo da classe Scanner - recupera o valor atraves do usuario */
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("\n Informe o valor de A: ");
	  int A = scanner.nextInt();
	  
	  System.out.println("\n Informe o valor de B: ");
	  int B = scanner.nextInt();
	  
	  int soma = A + B;
	  
	  System.out.println("A soma é: " + soma);
	  
	}
}
