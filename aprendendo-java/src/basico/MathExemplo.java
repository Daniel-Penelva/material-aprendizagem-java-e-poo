package basico;

public class MathExemplo {

	public static void main(String[] args) {
		
		/** A classe Math em Java está no pacote java.lang e oferece um conjunto de métodos para realizar operações matemáticas comuns, como exponenciação, 
		 * raiz quadrada, seno, cosseno, logaritmo, entre outros.*/
			
			//A classe Math possui a constante De Euller representada pela letra E e tb a constante pi.
			//Math.E;
			//Math.PI;
			
			
			System.out.println(Math.sin(10)); //para descobrir o seno de 10
			
			
			System.out.println(Math.cos(10)); //para descobrir o cosseno de 10
			
			
			System.out.println(Math.tan(10)); //para descobrir o tangente de 10
			
			
			System.out.println(Math.pow(2, 10)); //numero elevado por outro - pow(potencia, elevado)
			
			
			System.out.println(Math.sqrt(16)); //raiz quadrado
			
			
			System.out.println(Math.cbrt(9)); //raiz cúbica
			
			
			System.out.println(Math.hypot(10, 5)); //calcular hipotenusa
			
			/** MAIS EXEMPLOS */
			
			// Potência
	        double potencia = Math.pow(2, 3);
	        System.out.println("2 elevado à potência de 3: " + potencia);

	        // Raiz quadrada
	        double raizQuadrada = Math.sqrt(25);
	        System.out.println("Raiz quadrada de 25: " + raizQuadrada);

	        // Valor absoluto
	        int valorAbsoluto = Math.abs(-42);
	        System.out.println("Valor absoluto de -42: " + valorAbsoluto);

	        // Arredondamento para cima
	        double arredondarCima = Math.ceil(3.14);
	        System.out.println("Arredondar para cima: " + arredondarCima);

	        // Arredondamento para baixo
	        double arredondarBaixo = Math.floor(3.14);
	        System.out.println("Arredondar para baixo: " + arredondarBaixo);

	        // Valor máximo
	        int maximo = Math.max(10, 20);
	        System.out.println("Valor máximo entre 10 e 20: " + maximo);

	        // Valor mínimo
	        int minimo = Math.min(10, 20);
	        System.out.println("Valor mínimo entre 10 e 20: " + minimo);
	        
	        // Seno
	        double seno = Math.sin(Math.toRadians(30));
	        System.out.println("Seno de 30 graus: " + seno);

	        // Cosseno
	        double cosseno = Math.cos(Math.toRadians(60));
	        System.out.println("Cosseno de 60 graus: " + cosseno);

	        // Tangente
	        double tangente = Math.tan(Math.toRadians(45));
	        System.out.println("Tangente de 45 graus: " + tangente);
	}

}
