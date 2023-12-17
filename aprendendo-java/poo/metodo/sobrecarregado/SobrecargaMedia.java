package metodo.sobrecarregado;

public class SobrecargaMedia {

	// Método sobrecarregado com dois parâmetros inteiros
	double media(int x, int y) {
		
		System.out.print("media(int x, int y) - ");

		return (x + y) / 2;
	}

	
	// Método sobrecarregado com dois parâmetros String
	double media(String x, String y) {
		
		System.out.print("media(String x, String y) - ");

		Integer valor_x = Integer.parseInt(x);
		Integer valor_y = Integer.parseInt(y);
		// tb pode ser um double ..... Double.parseDouble(x)

		return (valor_x + valor_y) / 2;
	}

	// Método sobrecarregado com variáveis com argumentos 
	int soma(int... numero) {
		
		int total = 0;
		
		for (int n : numero) {
			total += n;
		}
		
		return total;
	}

	double media(int... numero) {
		
		System.out.print("media(int ... valor) - ");

		return this.soma(numero) / numero.length;
	}
}
