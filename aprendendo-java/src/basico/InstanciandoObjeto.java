package basico;

public class InstanciandoObjeto {

	public static void main(String[] args) {
		
		/* Instanciamento de forma explícita - Aqui, está criando uma instância da classe Cachorro e atribuindo essa instância à variável pitbull. Isso é 
		 * chamado de instanciamento explícito, pois está explicitamente especificando o tipo da variável (Cachorro) no lado esquerdo.*/
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "Pitbull";
		pitbull.tamanho = 40;
		
		System.out.println("Raça: " + pitbull.raca + " e Tamanho: " + pitbull.tamanho);
		
		pitbull.latir();
		
		/* Forma implícita - A partir do Java 10, você pode usar a palavra-chave var para inferir automaticamente o tipo da variável com base no tipo do 
		 * objeto do lado direito. Isso é chamado de inferência de tipo local.*/  
		var pastorAlemao = new Cachorro();
		
		pastorAlemao.raca = "Pastor Alemão";
		pastorAlemao.tamanho = 70;
		
		System.out.println("Raça: " + pastorAlemao.raca + " e Tamanho: " + pastorAlemao.tamanho);
		
		pitbull.latir();
		
		/** Ambos os exemplos criam instâncias da classe Cachorro e atribuem valores aos seus atributos raca e idade. A principal diferença é que no 
		 * primeiro exemplo o tipo da variável é explicitamente declarado (Cachorro pitbull), enquanto no segundo exemplo o tipo é inferido automaticamente 
		 * pelo compilador (var pastorAlemao). Em geral, a escolha entre as duas formas depende da preferência do desenvolvedor e do contexto do código.
		 * */
	}

	
	static class Cachorro {

		int tamanho;
		String raca;

		public Cachorro() {
			super();
		}

		void latir() {
			System.out.println("Tá latindo...");
		}
	}

}
