package verificar.instancia.exemplo2;

public class Gata extends Animal {

	public Gata() {
		this.nome = "Mascote";
		this.numPatas = 4;
	}

	@Override
	public void som() {
		System.out.println("Miau!");
	}
}