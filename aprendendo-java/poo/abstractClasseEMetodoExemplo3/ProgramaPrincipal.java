package abstractClasseEMetodoExemplo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**OBS. Não se pode instanciar (new) com método representado na classe Funcionario, pois dará erro, pois as classes abstratas geralmente são projetadas para serem 
		 * estendidas por subclasses concretas (no caso foi estendido pela subclasse concreta Programador) que fornecem implementações para métodos abstratos. 
		 * Por exemplo, isso dará erro: Funcionario fun = new Funcionario();*/
		
		
		Programador p = new Programador("Daniel Penelva", 3000);
	    System.out.println(p.getNome());
	    System.out.println(p.getSalario());
		
	    float calcSalario = p.calcularSalario();
	    System.out.println(calcSalario);
	    
	    
	    
	    // Exemplo Extra :: repassando aprendizado herança, mostrarei como acessar os atributos da Classe abstrata Funcionario e a Classe PessoaFisica pela Classe Programador.
	    // Vale ressaltar que a Classe Programador está estendendo a Classe abstrata Funcionario e a Classe abstrata Funcionario está estendendo a classe PessoaFisica.
	    
	    Set<Programador> conjuntoProgramadores = new HashSet<>();
	    
	    /* PROGRAMADOR 1 */
	    Programador programador1 = new Programador();
	    programador1.setCargo("Analsita de Sistema");
	    programador1.setNome("Daniel Penelva");
	    programador1.setSalario(5500);
	    programador1.setCpf("111.111.111-11");
	    programador1.setRg("2222222222");
	    
	    String dataNascimento1String = "25/12/1990";
	    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	    
	    try {
			Date dataNascimento1 = sdf1.parse(dataNascimento1String);
			programador1.setDataNascimento(dataNascimento1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    
	    /* PROGRAMADOR 2 */
	    Programador programador2 = new Programador();
	    programador2.setCargo("Programador Back-End");
	    programador2.setNome("Marina Silva");
	    programador2.setSalario(4500);
	    programador2.setCpf("444.111.444-14");
	    programador2.setRg("2222222999");
	    
	    String dataNascimento2String = "02/05/1987";
	    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	    
	    try {
			Date dataNascimento2 = sdf2.parse(dataNascimento2String);
			programador2.setDataNascimento(dataNascimento2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    
	    // Adicionando as instâncias na collection set.
	    conjuntoProgramadores.add(programador1);
	    conjuntoProgramadores.add(programador2);
	    
	    for (Programador programadores : conjuntoProgramadores) {
	    	System.out.println("Nome: " + programadores.getNome() + " Cargo: " + programadores.getCargo() + " Salário: " + programadores.getSalario() 
	    	+ " CPF: " + programadores.getCpf() + " RG: " + programadores.getRg() + " Data Nascimento: " + programadores.getDataNascimento());
	    }
	}
}
