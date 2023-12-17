# M�todos Setters e Getters

Os m�todos getters e setters s�o parte fundamental da encapsula��o em programa��o orientada a objetos. Eles s�o usados para acessar e modificar os atributos (ou propriedades) de uma classe, permitindo um controle mais preciso sobre o acesso aos dados internos de um objeto.

1. **Getter:**
   - Um m�todo getter � usado para obter (ou recuperar) o valor de um atributo privado de uma classe.
   - O nome do m�todo come�a com "get" seguido pelo nome do atributo (com a primeira letra do atributo em mai�scula).
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
   - Um m�todo setter � usado para definir (ou modificar) o valor de um atributo privado de uma classe.
   - O nome do m�todo come�a com "set" seguido pelo nome do atributo (com a primeira letra do atributo em mai�scula).
   - O setter geralmente recebe um par�metro que � o novo valor a ser atribu�do ao atributo.
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
   - Agora, como usaria esses m�todos em um programa principal:

    ```java
    public class ProgramaPrincipal {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();

            // Usando o setter para definir o nome
            pessoa.setNome("Jo�o");

            // Usando o getter para obter o nome
            String nomeDaPessoa = pessoa.getNome();

            System.out.println("Nome da pessoa: " + nomeDaPessoa);
        }
    }
    ```

   Neste exemplo, o m�todo `setNome` � usado para definir o nome da pessoa, e o m�todo `getNome` � usado para obter o nome da pessoa.

O uso de getters e setters fornece um controle mais preciso sobre como os atributos s�o acessados e modificados em uma classe, permitindo a implementa��o de l�gica adicional, valida��es e garantindo a encapsula��o dos dados.
