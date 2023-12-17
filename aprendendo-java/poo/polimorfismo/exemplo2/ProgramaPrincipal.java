package polimorfismo.exemplo2;
//Aula 49
public class ProgramaPrincipal {
	
	public static void calcule(OperacaoMatematica operacao, double x, double y)
	{
	  System.out.println(operacao.calcular(x, y));	
	}
	
	
	public static void main(String[] args){
		
		calcule(new Soma(), 5, 10);
		
		calcule(new Multiplicacao(), 5, 6);
	}

}

/* O m�todo calcule aceita uma inst�ncia de OperacaoMatematica como par�metro e chama o m�todo calcular dessa inst�ncia. Isso � poss�vel devido ao 
 * polimorfismo, onde objetos de subclasses podem ser tratados como objetos da classe base. */
