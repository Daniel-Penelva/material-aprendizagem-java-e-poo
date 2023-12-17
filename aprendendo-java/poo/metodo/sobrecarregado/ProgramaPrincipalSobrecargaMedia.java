package metodo.sobrecarregado;

public class ProgramaPrincipalSobrecargaMedia {

	public static void main(String[] args) {
		
		// Chamadas de m�todos sobrecarregados
		
		SobrecargaMedia m = new SobrecargaMedia();
		System.out.println(m.media(6, 9));
		
		SobrecargaMedia m1 = new SobrecargaMedia();
	    System.out.println(m1.media("6", "9"));
	    
	    
	    SobrecargaMedia m2 = new SobrecargaMedia();
	    System.out.println(m2.media(2,4,6,8,10));
	}

}

/**
 * A sobrecarga de m�todos em Java refere-se � capacidade de uma classe ter dois ou mais m�todos com o mesmo nome, desde que a lista de par�metros seja 
 * diferente (em termos de n�mero, tipo ou ordem). Isso permite que forne�a diferentes vers�es do mesmo m�todo para acomodar diferentes situa��es ou tipos 
 * de dados.*/
