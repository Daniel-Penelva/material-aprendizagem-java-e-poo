package construtores.com.heranca;

public class C extends B{

	public C() {
		super("Herda o super de B do tipo String"); // Herda o super de B
		System.out.println("Construtor C");
	}
	
	// Sobrecarregando o m�todo 
	public C(String sobrecarga) {
		super(sobrecarga);
		System.out.println("Construtor C que recebe como par�metro um String.");
	}
	
	// Sobrecarregando o m�todo 
	public C(int x) {
		this(String.valueOf(x));
		System.out.println("Construtor C que recebe como par�metro um int.");
	}
	
}
