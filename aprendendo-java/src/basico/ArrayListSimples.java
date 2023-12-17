package basico;

import java.util.ArrayList;

public class ArrayListSimples {
	
	public static void main(String[] args) 
	{
		/*
		 *  Collection Framework Array List = é um conjunto de classes que permite mais flexibilidade da 
		 *  manipulação de lista.
		 *  atraves do array list é possivel:
		 *   
		 *  .adicionar
		 *  .remover
		 *  .pesquisar
		 *  .recuperar
		 **/
		
		/* <cast> = para especificar o tipo de dados que quer incluir no array list */
	       ArrayList<String> cores = new ArrayList<>();
	      
	       cores.add("Branco");   /* IMPORTANTE : método add() para "adicionar" um valor no array list */
	       
	        System.out.println("Adicionado valores: " + cores.toString());
	        cores.add("Azul");
	        cores.add("Vermelho");
	        
	       
	        cores.add(0,"Preto");  /* se colocar no indice 0, vai iniciar no inicio da lista */
	        System.out.println("Adicionado valores:" + cores.toString());
	        
	        /* Para saber o tamanho do array list */
	        System.out.println("tamanho array: " + cores.size());
	        
	        /*IMPORTANTE: metodo get() - para "recuperar" um elemento do array list
	         * 
	         *  Outra forma de fazer:
	         *  
	         *  String remove = cores.get(3);
	         *   System.out.println(remove);
	         *  */
	        
	        System.out.println("Recupera indice 3: " + cores.get(3));
	        
	        /* metodo indexOf() - este método retorna o indice de qlq valor do array list */
	        System.out.println("indice Branco: " + cores.indexOf("Branco"));
	        
	        
	        
	        cores.remove("Branco"); /* IMPORTANTE: metodo remove() - este método "remove" um valor no array list */
	        System.out.println("Removeu a cor Branca: " + cores.toString());
	        
	      /* metodo contains() - este método retorna um boolean, este metodo "pesquisa" um valor no array se o metodo encontrar então returna true senão false */
	       
	       boolean pergunta = cores.contains("Azul");
	       System.out.println("Tem azul? " + pergunta);
	       
	       System.out.println("Tem roxo? " + cores.contains("Roxo"));
	       
	       // Exemplo 2
	       ArrayList<String> listaDeCores = new ArrayList<>();

			listaDeCores.add("verde");
			listaDeCores.add("vermelho");
			listaDeCores.add(0, "amarelo"); // Este zero no parametro corresponde q o amarelo começa no indice zero
			listaDeCores.add("preto");
			listaDeCores.add("azul");

			System.out.println("Lista de cores: " + listaDeCores.toString());

			System.out.println("Tamanho da lista: " + listaDeCores.size());

			System.out.println("Recupera o elemento 2: " + listaDeCores.get(0));
			
			System.out.println("Recupera o elemento 1: " + listaDeCores.get(1));

			System.out.println("valor do indice: " + listaDeCores.indexOf("preto"));
			
			System.out.println("Tem valores no array(false = se tem elementos no array): " + listaDeCores.isEmpty());

			listaDeCores.remove("verde");
			System.out.println("Nova lista: " + listaDeCores.toString());

			// este exemplo: o método contains() retorna um boolean
			System.out.println("Tem a cor cinza ? " + listaDeCores.contains("Cinza"));    
	}
}
