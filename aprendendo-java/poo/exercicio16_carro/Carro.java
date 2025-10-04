package exercicio16_carro;

public class Carro {

	private double tanque; // litros de combustível
    private double distanciaPercorrida; // km
    private static final double CONSUMO = 15.0; // km por litro
    private static final double CAPACIDADE_TANQUE = 50.0; // litros

    // Construtor
    public Carro() {
        this.tanque = 0;
        this.distanciaPercorrida = 0;
    }

    // Método para abastecer
    public void abastecer(double litros) {
        if (litros <= 0) {
            System.out.println("Quantidade inválida para abastecimento!");
            return;
        }
        if (tanque + litros > CAPACIDADE_TANQUE) {
            tanque = CAPACIDADE_TANQUE;
            System.out.println("Tanque cheio! Capacidade máxima de 50 litros.");
        } else {
            tanque += litros;
        }
    }

    // Método para mover o carro
    public void mover(double distancia) {
        if (distancia <= 0) {
            System.out.println("Distância inválida!");
            return;
        }

        double autonomia = tanque * CONSUMO; // km que pode rodar
        if (distancia <= autonomia) {
            distanciaPercorrida += distancia;
            tanque -= distancia / CONSUMO;
        } else {
            // anda só até onde o combustível permitir
            distanciaPercorrida += autonomia;
            tanque = 0;
            System.out.println("O carro parou por falta de combustível!");
        }
    }

    // Retorna combustível restante
    public double getCombustivel() {
        return tanque;
    }

    // Retorna distância total percorrida
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
	
}
