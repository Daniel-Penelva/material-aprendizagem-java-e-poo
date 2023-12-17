package verificar.instancia.exemplo2;

public class Cabra extends Animal{

	public Cabra(){
		this.nome = "Banabé";
		this.numPatas = 4;
	}

	@Override
	public void som() {
		System.out.println("Béééé!");
		
	}

}
