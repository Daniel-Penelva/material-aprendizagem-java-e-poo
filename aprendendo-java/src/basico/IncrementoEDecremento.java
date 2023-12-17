package basico;

public class IncrementoEDecremento {

	public static void main(String[] args) {
		
		/* Pós-incremento (x++) */
		
		int x = 5;
		int y = x++;  // y recebe o valor de x antes do incremento
		System.out.println("x: " + x);  // Saída: 6
		System.out.println("y: " + y);  // Saída: 5
		
		
		/* Pré-Incremento (++x) */
		
		int a = 5;
		int b = ++a;  // b recebe o valor de a após o incremento
		System.out.println("a: " + a);  // Saída: 6
		System.out.println("b: " + b);  // Saída: 6
		
		
		/* Pós-Decremento (x--) */
		
		int t = 5;
		int h = t--;  // h recebe o valor de t antes do decremento
		System.out.println("t: " + t);  // Saída: 4
		System.out.println("h: " + h);  // Saída: 5

		
		/* Pré-Decremento (--x) */
		
		int c = 5;
		int d = --c;  // d recebe o valor de c após o decremento
		System.out.println("c: " + c);  // Saída: 4
		System.out.println("d: " + d);  // Saída: 4
		
		
		/* Exemplo Extra */
		
		int A = 10;
		int B = 20;
		int C = A++ + ++B;  // C = 10 (A++ retorna 10, ++B incrementa B para 21)
		System.out.println("A: " + A);  // Saída: 11
		System.out.println("B: " + B);  // Saída: 21
		System.out.println("C: " + C);  // Saída: 30
		
	}

}
