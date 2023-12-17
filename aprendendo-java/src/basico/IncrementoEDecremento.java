package basico;

public class IncrementoEDecremento {

	public static void main(String[] args) {
		
		/* P�s-incremento (x++) */
		
		int x = 5;
		int y = x++;  // y recebe o valor de x antes do incremento
		System.out.println("x: " + x);  // Sa�da: 6
		System.out.println("y: " + y);  // Sa�da: 5
		
		
		/* Pr�-Incremento (++x) */
		
		int a = 5;
		int b = ++a;  // b recebe o valor de a ap�s o incremento
		System.out.println("a: " + a);  // Sa�da: 6
		System.out.println("b: " + b);  // Sa�da: 6
		
		
		/* P�s-Decremento (x--) */
		
		int t = 5;
		int h = t--;  // h recebe o valor de t antes do decremento
		System.out.println("t: " + t);  // Sa�da: 4
		System.out.println("h: " + h);  // Sa�da: 5

		
		/* Pr�-Decremento (--x) */
		
		int c = 5;
		int d = --c;  // d recebe o valor de c ap�s o decremento
		System.out.println("c: " + c);  // Sa�da: 4
		System.out.println("d: " + d);  // Sa�da: 4
		
		
		/* Exemplo Extra */
		
		int A = 10;
		int B = 20;
		int C = A++ + ++B;  // C = 10 (A++ retorna 10, ++B incrementa B para 21)
		System.out.println("A: " + A);  // Sa�da: 11
		System.out.println("B: " + B);  // Sa�da: 21
		System.out.println("C: " + C);  // Sa�da: 30
		
	}

}
