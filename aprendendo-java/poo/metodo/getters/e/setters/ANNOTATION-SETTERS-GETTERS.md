# Métodos Setters e Getters

Os métodos getters e setters são parte fundamental da encapsulação em programação orientada a objetos. Eles são usados para acessar e modificar os atributos (ou propriedades) de uma classe, permitindo um controle mais preciso sobre o acesso aos dados internos de um objeto.

1. **Getter:**
   - Um método getter é usado para obter (ou recuperar) o valor de um atributo privado de uma classe.
   - O nome do método começa com "get" seguido pelo nome do atributo (com a primeira letra do atributo em maiúscula).
   - O getter geralmente retorna o valor do atributo.
   - Exemplo:

    ```java
    public class Pessoa {
        private String nome;

        public String getNome() {
            return nome;
        }
    }
    ```

2. **Setter:**
   - Um método setter é usado para definir (ou modificar) o valor de um atributo privado de uma classe.
   - O nome do método começa com "set" seguido pelo nome do atributo (com a primeira letra do atributo em maiúscula).
   - O setter geralmente recebe um parâmetro que é o novo valor a ser atribuído ao atributo.
   - Exemplo:

    ```java
    public class Pessoa {
        private String nome;

        public void setNome(String novoNome) {
            this.nome = novoNome;
        }
    }
    ```

3. **Exemplo de Uso:**
   - Agora, como usaria esses métodos em um programa principal:

    ```java
    public class ProgramaPrincipal {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();

            // Usando o setter para definir o nome
            pessoa.setNome("João");

            // Usando o getter para obter o nome
            String nomeDaPessoa = pessoa.getNome();

            System.out.println("Nome da pessoa: " + nomeDaPessoa);
        }
    }
    ```

   Neste exemplo, o método `setNome` é usado para definir o nome da pessoa, e o método `getNome` é usado para obter o nome da pessoa.

O uso de getters e setters fornece um controle mais preciso sobre como os atributos são acessados e modificados em uma classe, permitindo a implementação de lógica adicional, validações e garantindo a encapsulação dos dados.
