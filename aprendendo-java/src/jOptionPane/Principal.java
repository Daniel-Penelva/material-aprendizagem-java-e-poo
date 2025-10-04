package jOptionPane;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Exemplo 1 - Mostrar uma mensagem
		JOptionPane.showMessageDialog(null, "Olá, bem-vindo ao sistema!");

		
		// Exemplo 2 - entrada de dados (String)
		String nome = JOptionPane.showInputDialog("Entre com o seu nome: ");
		JOptionPane.showMessageDialog(null, "Seu nome é : " + nome);

		
		// Exemplo 3 - entrada de dados (número)
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a sua idade: "));
		JOptionPane.showMessageDialog(null, "Sua idade é : " + idade);

		
		// Exemplo 4 - Caixa de Confirmação (Sim /Não /Cancelar)
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você escolheu sim!");
		} else if (resposta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Você escolheu não!");
		} else {
			JOptionPane.showMessageDialog(null, "Você cancelou a operação.");
		}
		
		
		// Exemplo 5 - Opções personalizadas
		Object[] opcoes = { "Adicionar", "Remover", "Sair" };
		int escolha = JOptionPane.showOptionDialog(
		        null,
		        "O que deseja fazer?",
		        "Menu",
		        JOptionPane.DEFAULT_OPTION,
		        JOptionPane.INFORMATION_MESSAGE,
		        null,
		        opcoes,
		        opcoes[0]
		);

		if (escolha == 0) {
		    JOptionPane.showMessageDialog(null, "Você escolheu Adicionar");
		} else if (escolha == 1) {
		    JOptionPane.showMessageDialog(null, "Você escolheu Remover");
		} else {
		    JOptionPane.showMessageDialog(null, "Saindo...");
		}
		
		
		// Exemplo 6 - Mensagem com ícone diferente
		JOptionPane.showMessageDialog(null, "Isso é uma mensagem de erro!", "Erro", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Atenção: verifique os dados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

	}

}
