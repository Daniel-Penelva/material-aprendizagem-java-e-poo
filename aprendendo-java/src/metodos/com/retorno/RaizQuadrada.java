package metodos.com.retorno;

public class RaizQuadrada {

	int raizQuadrada(int numero) {

		int contador = 0;

		for (int i = 0; i < numero; i++) {
			if ((i % 2) == 1) {
				if (i < numero) {
					numero = numero - i;
					contador++;
				}
			}
		}
		return contador;
	}
}
