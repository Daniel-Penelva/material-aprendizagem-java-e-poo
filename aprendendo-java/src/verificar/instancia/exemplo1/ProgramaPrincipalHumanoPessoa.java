package verificar.instancia.exemplo1;

import java.util.Scanner;

public class ProgramaPrincipalHumanoPessoa {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("você quer fazer o teste(sim/nao)? ");
		String resposta = s.next().toLowerCase();
		while (resposta.equals("sim")) {

			System.out.println("você é humano ou alienígena? ");
			String pergunta = s.next().toLowerCase();

			while (pergunta.equals("humano")) {
				Pessoa p = new Pessoa();

				System.out.println("Responda sim ou não");
				System.out.println("Você tem cabeça(sim)? ");
				String cab = s.next().toLowerCase();
				p.setCabeca(cab);

				System.out.println("Você tem tronco(sim)? ");
				String tr = s.next().toLowerCase();
				p.setTronco(tr);

				System.out.println("Você tem membro(sim)? ");
				String mem = s.next().toLowerCase();
				p.setMembro(mem);

				System.out.println("Então você é humano mesmo!");

				System.out.println("Qual o seu nome? ");
				String n = s.next();
				p.setNome(n);

				System.out.println("Qual a sua idade? ");
				int i = s.nextInt();
				p.setIdade(i);

				System.out.println("Olá !" + p.getNome());

				// Treinando o instanceof...

				if (p instanceof Pessoa) {
					System.out.println("Verdade vc é humano mesmo!");
				} else {
					System.out.println("Falso vc não é humano!");
				}
				break;
			}
			System.out.println("Deseja continuar(sim/nao)? ");
			resposta = s.next().toLowerCase();
		}

	}

}
