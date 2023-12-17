package palavra.chaveStatic;

public class ProgramaPrincipalProfessor {

	public static void main(String[] args) {
		
		Professor professor = new Professor();

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		System.out.println("VALOR_HORA_AULA: " + Professor.VALOR_HORA_AULA); // atributo public e static final (imutável)
		
		// professor.VALOR_HORA_AULA = 500; // resulta em erro, uma vez que sua propriedade é final, ou seja, não podemos alterar o valor dessa propriedade.

		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		System.out.println("VALOR_DIA_AULA: " + Professor.VALOR_DIA_AULA); // atributo public e static // 300
		
		double novoValor = professor.VALOR_DIA_AULA = 450; // por ser somente static é possível alterar o valor
		System.out.println("VALOR_DIA_AULA: " + novoValor); // 450
		
		// ou pode fazer assim:
		professor.VALOR_DIA_AULA = 590; // por ser somente static é possível alterar o valor
		System.out.println("VALOR_DIA_AULA: " + Professor.VALOR_DIA_AULA); // 590
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		System.out.println("VALOR_SEMANA_AULA: " + Professor.getValorSemanaAula());  // atributo private e static final (imutável) // 1200

		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		System.out.println("VALOR_MES_AULA: " + Professor.getValorMesAula()); // atributo private e static // 4100
		
		Professor.setValorMesAula(5700); // por ser somente static é possível alterar o valor
		System.out.println("VALOR_MES_AULA: " + Professor.getValorMesAula());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		professor.mudarValorDiaAula(700); // alterando uma propriedade static através de um método não estático.
		
	}

}
