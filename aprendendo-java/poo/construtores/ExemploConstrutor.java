package construtores;

public class ExemploConstrutor {

    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor padrão (sem parâmetros)
    public ExemploConstrutor() {
        nome = "Sem nome";
        idade = 0;
    }
    
    // Construtor com o parâmetro nome
    public ExemploConstrutor(String nome) {
        this.nome = nome;
    }
    
    // Construtor com o parâmetro idade
    public ExemploConstrutor(int idade) {
        this.idade = idade;
    }

    // Construtor com os parâmetros nome e idade
    public ExemploConstrutor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        
    	// Criando instâncias da classe usando diferentes construtores
        ExemploConstrutor pessoa1 = new ExemploConstrutor();
        ExemploConstrutor pessoa2 = new ExemploConstrutor("Daniel");
        ExemploConstrutor pessoa3 = new ExemploConstrutor(25);
        ExemploConstrutor pessoa4 = new ExemploConstrutor("Alice", 25);

        // Exibindo informações das instâncias
        System.out.println("Informações da pessoa1:");
        pessoa1.exibirInformacoes();
        
        System.out.println("Informações da pessoa2:");
        pessoa2.exibirInformacoes();
        
        System.out.println("Informações da pessoa3:");
        pessoa3.exibirInformacoes();

        System.out.println("\nInformações da pessoa4:");
        pessoa4.exibirInformacoes();
    }
}

