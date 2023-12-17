package arrayListExemplo;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Disciplina d1 = new Disciplina();
		d1.setCodigo("1");
		d1.setNome("Arquitetura de Computadores");
		d1.setCreditos(100);

		Disciplina d2 = new Disciplina();
		d2.setCodigo("2");
		d2.setNome("Padrões de Software");
		d2.setCreditos(100);
		
		Disciplina d3 = new Disciplina();
		d3.setCodigo("3");
		d3.setNome("Banco de Dados");
		d3.setCreditos(70);

		List<Disciplina> dLista = new ArrayList<Disciplina>();
		dLista.add(d1);
		dLista.add(d2);
		dLista.add(d3);

		for (Disciplina d : dLista) {
			System.out.println("Disciplina: \n " + "Codigo: " + d.getCodigo() + " Nome: " + d.getNome() + " Crédito: "
					+ d.getCreditos());
		}
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Remover da Lista >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/ 
		
		dLista.remove(1); // remove o índice (posição) da lista 
		
		for (Disciplina d : dLista) {
			System.out.println("Disciplina: \n " + "Codigo: " + d.getCodigo() + " Nome: " + d.getNome() + " Crédito: "
					+ d.getCreditos());
		}
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Capturar um elemento especifico da disciplina pelo indice >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/ 
		
		 // Retorna o valor do indice zero
		System.out.println(dLista.get(0));
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Verifica o tamanho da Lista >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/ 
		
		 // Retorna o valor do indice zero
		System.out.println("Tamanno da lista: " + dLista.size());

	}

}
