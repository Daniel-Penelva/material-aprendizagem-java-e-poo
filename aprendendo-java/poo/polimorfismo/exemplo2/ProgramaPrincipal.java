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

/* O método calcule aceita uma instância de OperacaoMatematica como parâmetro e chama o método calcular dessa instância. Isso é possível devido ao 
 * polimorfismo, onde objetos de subclasses podem ser tratados como objetos da classe base. */
