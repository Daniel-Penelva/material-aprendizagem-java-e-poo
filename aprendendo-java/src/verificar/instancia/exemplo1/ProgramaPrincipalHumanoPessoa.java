package verificar.instancia.exemplo1;

import java.util.Scanner;

public class ProgramaPrincipalHumanoPessoa {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("voc� quer fazer o teste(sim/nao)? ");
		String resposta = s.next().toLowerCase();
		while (resposta.equals("sim")) {

			System.out.println("voc� � humano ou alien�gena? ");
			String pergunta = s.next().toLowerCase();

			while (pergunta.equals("humano")) {
				Pessoa p = new Pessoa();

				System.out.println("Responda sim ou n�o");
				System.out.println("Voc� tem cabe�a(sim)? ");
				String cab = s.next().toLowerCase();
				p.setCabeca(cab);

				System.out.println("Voc� tem tronco(sim)? ");
				String tr = s.next().toLowerCase();
				p.setTronco(tr);

				System.out.println("Voc� tem membro(sim)? ");
				String mem = s.next().toLowerCase();
				p.setMembro(mem);

				System.out.println("Ent�o voc� � humano mesmo!");

				System.out.println("Qual o seu nome? ");
				String n = s.next();
				p.setNome(n);

				System.out.println("Qual a sua idade? ");
				int i = s.nextInt();
				p.setIdade(i);

				System.out.println("Ol� !" + p.getNome());

				// Treinando o instanceof...

				if (p instanceof Pessoa) {
					System.out.println("Verdade vc � humano mesmo!");
				} else {
					System.out.println("Falso vc n�o � humano!");
				}
				break;
			}
			System.out.println("Deseja continuar(sim/nao)? ");
			resposta = s.next().toLowerCase();
		}

	}

}
