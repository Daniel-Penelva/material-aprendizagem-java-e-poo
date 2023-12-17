package basico;

public class CriarObjeto {

	public static void main(String[] args) {
		/*
		 * Utilizando uma classe Wrapper Tem que definir o tipo criando o seu objeto que  é o new, ou seja, para criar o seu objeto tem que usar a palavra 
		 * chave new. 
		 * 
		 * OBS. Para fazer a conversão podemos usar o método value().
		 */
		Double preco = new Double(25.55);
		/* para retornar um valor inteiro */
		int novoPreco = preco.intValue();
		byte precoEmByte = preco.byteValue();

		System.out.println("Preco em double: " + preco + '\n' + "Fazendo a Conversão em:\n" + "Preco em int: "
				+ novoPreco + '\n' + "Preco em byte: " + precoEmByte);

		/* Conversão Estática */

		double d = Double.parseDouble("123.45");
		Integer i = Integer.parseInt("123");
		float f = Float.parseFloat("3.14F");

		System.out.println("double: " + d + '\n' + "int: " + i + '\n' + "float: " + f);

		/*
		 * Método valueOf(tipo) - este método permite a conversão de um valor de um tipo
		 * para outro tipo. Dentro do psrsmetro vc decide o tipo de conversao que deseja
		 * fazer. ex: quero converter String para boolean
		 */

		String casado = "Não sou casado";
		casado = String.valueOf(false);
		System.out.println("Casado:" + casado);

		/* contra exemplo: converte String para float */

		String situacao = "Aprovado";
		situacao = String.valueOf("Passou na materia:" + 7.9);
		System.out.println("Situação:" + situacao);

	}

}
