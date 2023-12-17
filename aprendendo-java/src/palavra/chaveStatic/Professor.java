package palavra.chaveStatic;

public class Professor {

	/** Valor imutável; e não é possível instanciá-la, uma vez que não é possível alterar o valor; esse valor vai se refletindo a todos os objetos. */
	public static final double VALOR_HORA_AULA = 100;

	/**  Valor mutável; é possível instanciar, uma vez que é possível alterar o valor; esse valor vai se refletindo a todos os objetos. */
	public static double VALOR_DIA_AULA = 300;

	/** É possivel declarar uma propriedade static final como private. Porém, só é possível acessar o seu valor pelo método getters. Já o método setters não 
	 * vai ser possível gerá-lo, uma vez que, não é possível atribuir um novo valor, já que seu valor não pode ser alterado. */
	private static final double VALOR_SEMANA_AULA = 1200;

	/** Já as propriedade que usam somente static e que estejam declarados como private vai ser possível utilizar tanto o getters quanto o setters, uma 
	 * vez que, seu valor pode ser capturado e atribuido, já que seu valor é mutável, ou seja, não é um valor constante. */
	private static double VALOR_MES_AULA = 4100;

	// Propriedades específicas 
	private String nome;
	private String materia;

	
	// Métodos Getters e Setters
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

	/* MÉTODOS SETTERS E GETTERS "STATIC" E "STATIC FINAL" */
	
	public static double getValorSemanaAula() { // declarado como private e static final, logo não é possível criar o método getters
		return VALOR_SEMANA_AULA;
	}

	public static double getValorMesAula() { // declarado como private e static, logo é possível criar os métodos getters e setters
		return VALOR_MES_AULA;
	}

	public static void setValorMesAula(double VALOR_MES_AULA) {
		Professor.VALOR_MES_AULA = VALOR_MES_AULA;
	}

	/** É possível criar um método que não é estático (static) alterando uma propriedade estática. */
	public void mudarValorDiaAula(int novoValorDia) {
		VALOR_DIA_AULA = novoValorDia;
		System.out.println("VALOR_DIA_AULA: " + novoValorDia);
	}
}
