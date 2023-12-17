package abstractClasseEMetodoExemplo2;

public class Quadrado extends Forma{

	private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Implementa��o do m�todo abstrato
    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
