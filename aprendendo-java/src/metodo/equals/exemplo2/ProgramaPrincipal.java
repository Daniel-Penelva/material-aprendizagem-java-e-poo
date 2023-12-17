package metodo.equals.exemplo2;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do Aluno: ");
		String n = s.next();
		aluno.setNome(n);

		System.out.println("Entre com o login do Aluno: ");
		String l = s.next();
		aluno.setLogin(l);

		System.out.println("Entre com a senha do Aluno: ");
		String se = s.next();
		aluno.setSenha(se);

		System.out.println("Entre com o registro acadêmico do Aluno: ");
		int rg = s.nextInt();
		aluno.setRegistroAcademico(rg);

		System.out.println("Aluno \n " + "Nome: " + aluno.getNome() + ", Login: " + aluno.getLogin() + ", Senha: "
				+ aluno.getSenha() + ", Registro Acadêmico: " + aluno.getRegistroAcademico());

		// retornando com o metodo toString()
		System.out.println(aluno.toString());

		Object obj = null;
		boolean resulta = aluno.equals2(obj);
		System.out.println("resultado: " + resulta);

	}
}
