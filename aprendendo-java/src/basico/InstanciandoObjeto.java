package basico;

public class InstanciandoObjeto {

	public static void main(String[] args) {
		
		/* Instanciamento de forma expl�cita - Aqui, est� criando uma inst�ncia da classe Cachorro e atribuindo essa inst�ncia � vari�vel pitbull. Isso � 
		 * chamado de instanciamento expl�cito, pois est� explicitamente especificando o tipo da vari�vel (Cachorro) no lado esquerdo.*/
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "Pitbull";
		pitbull.tamanho = 40;
		
		System.out.println("Ra�a: " + pitbull.raca + " e Tamanho: " + pitbull.tamanho);
		
		pitbull.latir();
		
		/* Forma impl�cita - A partir do Java 10, voc� pode usar a palavra-chave var para inferir automaticamente o tipo da vari�vel com base no tipo do 
		 * objeto do lado direito. Isso � chamado de infer�ncia de tipo local.*/  
		var pastorAlemao = new Cachorro();
		
		pastorAlemao.raca = "Pastor Alem�o";
		pastorAlemao.tamanho = 70;
		
		System.out.println("Ra�a: " + pastorAlemao.raca + " e Tamanho: " + pastorAlemao.tamanho);
		
		pitbull.latir();
		
		/** Ambos os exemplos criam inst�ncias da classe Cachorro e atribuem valores aos seus atributos raca e idade. A principal diferen�a � que no 
		 * primeiro exemplo o tipo da vari�vel � explicitamente declarado (Cachorro pitbull), enquanto no segundo exemplo o tipo � inferido automaticamente 
		 * pelo compilador (var pastorAlemao). Em geral, a escolha entre as duas formas depende da prefer�ncia do desenvolvedor e do contexto do c�digo.
		 * */
	}

	
	static class Cachorro {

		int tamanho;
		String raca;

		public Cachorro() {
			super();
		}

		void latir() {
			System.out.println("T� latindo...");
		}
	}

}
