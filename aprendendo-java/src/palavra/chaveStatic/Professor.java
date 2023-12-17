package palavra.chaveStatic;

public class Professor {

	/** Valor imut�vel; e n�o � poss�vel instanci�-la, uma vez que n�o � poss�vel alterar o valor; esse valor vai se refletindo a todos os objetos. */
	public static final double VALOR_HORA_AULA = 100;

	/**  Valor mut�vel; � poss�vel instanciar, uma vez que � poss�vel alterar o valor; esse valor vai se refletindo a todos os objetos. */
	public static double VALOR_DIA_AULA = 300;

	/** � possivel declarar uma propriedade static final como private. Por�m, s� � poss�vel acessar o seu valor pelo m�todo getters. J� o m�todo setters n�o 
	 * vai ser poss�vel ger�-lo, uma vez que, n�o � poss�vel atribuir um novo valor, j� que seu valor n�o pode ser alterado. */
	private static final double VALOR_SEMANA_AULA = 1200;

	/** J� as propriedade que usam somente static e que estejam declarados como private vai ser poss�vel utilizar tanto o getters quanto o setters, uma 
	 * vez que, seu valor pode ser capturado e atribuido, j� que seu valor � mut�vel, ou seja, n�o � um valor constante. */
	private static double VALOR_MES_AULA = 4100;

	// Propriedades espec�ficas 
	private String nome;
	private String materia;

	
	// M�todos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	/* M�TODOS SETTERS E GETTERS "STATIC" E "STATIC FINAL" */
	
	public static double getValorSemanaAula() { // declarado como private e static final, logo n�o � poss�vel criar o m�todo getters
		return VALOR_SEMANA_AULA;
	}

	public static double getValorMesAula() { // declarado como private e static, logo � poss�vel criar os m�todos getters e setters
		return VALOR_MES_AULA;
	}

	public static void setValorMesAula(double VALOR_MES_AULA) {
		Professor.VALOR_MES_AULA = VALOR_MES_AULA;
	}

	/** � poss�vel criar um m�todo que n�o � est�tico (static) alterando uma propriedade est�tica. */
	public void mudarValorDiaAula(int novoValorDia) {
		VALOR_DIA_AULA = novoValorDia;
		System.out.println("VALOR_DIA_AULA: " + novoValorDia);
	}
}
