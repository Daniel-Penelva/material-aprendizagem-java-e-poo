package enumeradores;

public enum Medida {
	
	MM("Milímetro"), CM("Centímetro"), M("Metro");
	
	public String tamanho;
	
	Medida(String tamanho){
		this.tamanho = tamanho;
	}
	
}