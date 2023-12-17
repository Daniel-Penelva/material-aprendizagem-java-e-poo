package construtores;

public class ExemploConstrutor {

    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor padr�o (sem par�metros)
    public ExemploConstrutor() {
        nome = "Sem nome";
        idade = 0;
    }
    
    // Construtor com o par�metro nome
    public ExemploConstrutor(String nome) {
        this.nome = nome;
    }
    
    // Construtor com o par�metro idade
    public ExemploConstrutor(int idade) {
        this.idade = idade;
    }

    // Construtor com os par�metros nome e idade
    public ExemploConstrutor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // M�todo para exibir informa��es
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        
    	// Criando inst�ncias da classe usando diferentes construtores
        ExemploConstrutor pessoa1 = new ExemploConstrutor();
        ExemploConstrutor pessoa2 = new ExemploConstrutor("Daniel");
        ExemploConstrutor pessoa3 = new ExemploConstrutor(25);
        ExemploConstrutor pessoa4 = new ExemploConstrutor("Alice", 25);

        // Exibindo informa��es das inst�ncias
        System.out.println("Informa��es da pessoa1:");
        pessoa1.exibirInformacoes();
        
        System.out.println("Informa��es da pessoa2:");
        pessoa2.exibirInformacoes();
        
        System.out.println("Informa��es da pessoa3:");
        pessoa3.exibirInformacoes();

        System.out.println("\nInforma��es da pessoa4:");
        pessoa4.exibirInformacoes();
    }
}

