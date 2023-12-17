package metodo.sobrecarregado;

public class ProgramaPrincipalSobrecargaMedia {

	public static void main(String[] args) {
		
		// Chamadas de métodos sobrecarregados
		
		SobrecargaMedia m = new SobrecargaMedia();
		System.out.println(m.media(6, 9));
		
		SobrecargaMedia m1 = new SobrecargaMedia();
	    System.out.println(m1.media("6", "9"));
	    
	    
	    SobrecargaMedia m2 = new SobrecargaMedia();
	    System.out.println(m2.media(2,4,6,8,10));
	}

}

/**
 * A sobrecarga de métodos em Java refere-se à capacidade de uma classe ter dois ou mais métodos com o mesmo nome, desde que a lista de parâmetros seja 
 * diferente (em termos de número, tipo ou ordem). Isso permite que forneça diferentes versões do mesmo método para acomodar diferentes situações ou tipos 
 * de dados.*/
