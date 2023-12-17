package verificar.instancia.exemplo2;

public abstract class Animal {

	protected String nome;
	protected int numPatas;

	// usando o abstract - As classes que estender Animal irá receber por herança esse método
	public abstract void som();
}
