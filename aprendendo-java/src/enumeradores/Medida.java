package enumeradores;

public enum Medida {
	
	MM("Mil�metro"), CM("Cent�metro"), M("Metro");
	
	public String tamanho;
	
	Medida(String tamanho){
		this.tamanho = tamanho;
	}
	
}