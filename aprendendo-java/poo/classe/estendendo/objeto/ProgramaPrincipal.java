package classe.estendendo.objeto;

import java.util.Scanner;

public class ProgramaPrincipal {

public static void main(String[] args) {
		
		//A variavel "obj" do tipo Object recebe qualquer objeto, pois todo objeto estende Object
		Object obj = new Aluno("Daniel","dan123","1234",30200);
		
		System.out.println("Aluno: " + obj);
		
		// Pegando os valores com o m�todo toString()
		System.out.println(obj.toString());
		
		//******************** Exemplo 2 - pegando os dados da classe Aluno *******************************
		
		Aluno a = new Aluno();
		a.setNome("Davi");
		a.setLogin("davi123");
		a.setSenha("1234");
		a.setRegistroAcademico(12000);
		
		System.out.println("Aluno \n " + "Nome: " + a.getNome() + ", Login: " + a.getLogin() +
				           ", Senha: " + a.getSenha() + ", Registro Acad�mico: " + a.getRegistroAcademico());
		
		//pegando os valores com o m�todo toString()
		System.out.println(a.toString());
		
		
		//******************** Exemplo 3 - pegando os dados da classe Usuario *******************************
		//Repare que nesta classe n�o vai ter como capturar a variavel "RegistroAcademico", uma vez que esse 
		//atributo pertence da classe Aluno, pois � especifico a ele e n�o a classe Usuario.
		
		Usuario usu = new Usuario();
		usu.setNome("Miriam");
		usu.setLogin("miri123");
		usu.setSenha("1234");
		
		System.out.println("Aluno \n " + "Nome: " + usu.getNome() + ", Login: " + usu.getLogin() +
		           ", Senha: " + usu.getSenha());

        //pegando os valores com o m�todo toString()
        System.out.println(usu.toString());
		
		System.out.println("\n");
      //******************** Exemplo 4 - pegando os dados da classe Aluno *******************************
        
		Scanner s = new Scanner(System.in);
		Aluno alu = new Aluno();
		
		System.out.println("Entre com o nome do Aluno: ");
		String n = s.next();
		alu.setNome(n);
		
		System.out.println("Entre com o login do Aluno: ");
		String l = s.next();
		alu.setLogin(l);
		
		System.out.println("Entre com a senha do Aluno: ");
		String se = s.next();
		alu.setSenha(se);
		
		System.out.println("Entre com o registro acad�mico do Aluno: ");
		int rg = s.nextInt();
		alu.setRegistroAcademico(rg);
		
		System.out.println("Aluno \n " + "Nome: " + alu.getNome() + ", Login: " + alu.getLogin() +
		           ", Senha: " + alu.getSenha() + ", Registro Acad�mico: " + alu.getRegistroAcademico());
		
	}

}
