package construtores.com.heranca;

public class C extends B{

	public C() {
		super("Herda o super de B do tipo String"); // Herda o super de B
		System.out.println("Construtor C");
	}
	
	// Sobrecarregando o método 
	public C(String sobrecarga) {
		super(sobrecarga);
		System.out.println("Construtor C que recebe como parâmetro um String.");
	}
	
	// Sobrecarregando o método 
	public C(int x) {
		this(String.valueOf(x));
		System.out.println("Construtor C que recebe como parâmetro um int.");
	}
	
}
