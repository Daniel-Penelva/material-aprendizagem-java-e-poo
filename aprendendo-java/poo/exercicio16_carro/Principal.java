package exercicio16_carro;

public class Principal {
/*Enunciado:
 * Construa uma classe para representar um carro. O tanque de combustível do carro armazena no máximo 50 litros de gasolina. 
 * O carro consome 15 km/litro. Deve ser possível:
 * a. Abastecer o carro com certa quantidade de gasolina;
 * b. Mover o carro em uma determinada distância (medida em km);
 * c. Retornar a quantidade de combustível e a distância total percorrida.
 * No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o primeiro em 200 km e 
 * o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível restante para cada um.
 * */
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // Abastecendo
        carro1.abastecer(20);
        carro2.abastecer(30);

        // Movendo
        carro1.mover(200); // 200 km
        carro2.mover(400); // 400 km

        // Resultados
        System.out.println("Carro 1 percorreu: " + carro1.getDistanciaPercorrida() + " km");
        System.out.println("Carro 1 combustível restante: " + carro1.getCombustivel() + " L");

        System.out.println("Carro 2 percorreu: " + carro2.getDistanciaPercorrida() + " km");
        System.out.println("Carro 2 combustível restante: " + carro2.getCombustivel() + " L");

	}

}
