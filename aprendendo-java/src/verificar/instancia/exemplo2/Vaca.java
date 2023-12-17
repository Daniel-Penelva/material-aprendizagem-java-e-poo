package verificar.instancia.exemplo2;

public class Vaca extends Animal {

	public Vaca() {
		this.nome = "Mimosa";
		this.numPatas = 4;
	}

	@Override
	public void som() {
		System.out.println("MUUUUU!");
	}
}