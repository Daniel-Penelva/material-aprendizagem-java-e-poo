package modelo.diagrama.de.classe;

import javax.swing.JOptionPane;

public class ProgramaPrincipalStatic {

	public static void main(String[] args) {

		new Aluno();

		new Aluno();

		new Aluno();

		System.out.println(Aluno.getQtdAluno());

		
		Aluno a = new Aluno();
		String matricula = JOptionPane.showInputDialog(null, "Digite a matricula: "); // Exemplo da API do Java do método Estatico JOptionPane
		a.setMatricula(matricula);

		String cpf = JOptionPane.showInputDialog(null, "Digite o CPF: ");
		
		if (ValidacaoUtil.validaCPF(cpf) == true) {
			a.setCpf(cpf);
			
		} else {
			JOptionPane.showMessageDialog(null, "CPF inválido");
		}

		JOptionPane.showMessageDialog(null, a.getMatricula());
		JOptionPane.showMessageDialog(null, a.getCpf());

		System.out.println(Math.PI);
		
		System.out.println(ValidacaoUtil.x = 10.7); // Mostrando que a variavel x pode ser alterado
		System.out.println(ValidacaoUtil.y);
	}

}
