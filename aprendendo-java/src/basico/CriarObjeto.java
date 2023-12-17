package basico;

public class CriarObjeto {

	public static void main(String[] args) {
		/*
		 * Utilizando uma classe Wrapper Tem que definir o tipo criando o seu objeto que  � o new, ou seja, para criar o seu objeto tem que usar a palavra 
		 * chave new. 
		 * 
		 * OBS. Para fazer a convers�o podemos usar o m�todo value().
		 */
		Double preco = new Double(25.55);
		/* para retornar um valor inteiro */
		int novoPreco = preco.intValue();
		byte precoEmByte = preco.byteValue();

		System.out.println("Preco em double: " + preco + '\n' + "Fazendo a Convers�o em:\n" + "Preco em int: "
				+ novoPreco + '\n' + "Preco em byte: " + precoEmByte);

		/* Convers�o Est�tica */

		double d = Double.parseDouble("123.45");
		Integer i = Integer.parseInt("123");
		float f = Float.parseFloat("3.14F");

		System.out.println("double: " + d + '\n' + "int: " + i + '\n' + "float: " + f);

		/*
		 * M�todo valueOf(tipo) - este m�todo permite a convers�o de um valor de um tipo
		 * para outro tipo. Dentro do psrsmetro vc decide o tipo de conversao que deseja
		 * fazer. ex: quero converter String para boolean
		 */

		String casado = "N�o sou casado";
		casado = String.valueOf(false);
		System.out.println("Casado:" + casado);

		/* contra exemplo: converte String para float */

		String situacao = "Aprovado";
		situacao = String.valueOf("Passou na materia:" + 7.9);
		System.out.println("Situa��o:" + situacao);

	}

}
