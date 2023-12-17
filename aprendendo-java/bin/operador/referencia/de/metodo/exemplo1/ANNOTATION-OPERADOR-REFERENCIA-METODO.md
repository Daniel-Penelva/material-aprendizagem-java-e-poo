# O operador `::`

O operador `::` em Java é conhecido como o operador de referência de método. Ele permite referenciar métodos existentes ou construtores por meio de seus nomes, em vez de fornecer uma implementação completa. Este operador é comumente usado em expressões lambda e em certos contextos, como a criação de arrays.

**OBS.** Assim como as exrpessões lambdas, os operadores de referência de método (::) só podem ser utilizados em interface Funcional (ou seja, só apresentam métodos abstratos), se utilizar, por exemplo, uma interface em Object vai dar erro, porque ela não têm apenas métodos abstratos.

**Sintaxe:**

<Class name>::<method name>

**Dica:**
Operador de referência são definidos em três etapas:
  - o Tipo
  - o operador de referência :: 
  - o nome do método que quer chamar sem os parênteses
  
  - **Por Exemplo:** `clientes.forEach(Cliente :: getNome);`

Alguns exemplos para entender melhor:

1. **Referência de Método para Construtores:**

   Usando `::` para referenciar um construtor. Suponha que você tenha uma interface funcional `Fabrica` com um método `criar`:

   ```java
   interface Fabrica<T> {
       T criar();
   }

   // Com expressão lambda
   Fabrica<Exemplo> fabricaLambda = () -> new Exemplo();

   // Com referência de método
   Fabrica<Exemplo> fabricaMetodoReferencia = Exemplo::new;
   ```

2. **Referência de Método para Métodos Estáticos:**

   Você pode usar `::` para referenciar métodos estáticos:

   ```java
   interface Operacao {
       static int somar(int a, int b) {
           return a + b;
       }
   }

   // Com expressão lambda
   Operacao operacaoLambda = (a, b) -> Operacao.somar(a, b);

   // Com referência de método
   Operacao operacaoMetodoReferencia = Operacao::somar;
   ```

3. **Referência de Método para Métodos de Instância em um Objeto Particular:**

   Se já tem um objeto e deseja chamar um método de instância sobre ele, você pode usar `::`:

   ```java
   class Impressora {
       void imprimir(String texto) {
           System.out.println(texto);
       }
   }

   Impressora minhaImpressora = new Impressora();

   // Com expressão lambda
   Consumer<String> consumidorLambda = texto -> minhaImpressora.imprimir(texto);

   // Com referência de método
   Consumer<String> consumidorMetodoReferencia = minhaImpressora::imprimir;
   ```

4. **Referência de Método para Métodos de Instância de um Tipo Específico:**

   Se estiver trabalhando com um tipo específico, pode usar `::` para referenciar métodos de instância desse tipo:

   ```java
   List<String> palavras = Arrays.asList("Java", "é", "legal");

   // Com expressão lambda
   palavras.forEach(s -> System.out.println(s));

   // Com referência de método
   palavras.forEach(System.out::println);
   ```

   Aqui, `System.out::println` é uma referência de método para o método `println` da classe `PrintStream`.

No contexto específico que você mencionou, `toArray(ItemPedido[]::new)` é uma forma mais concisa de criar um array de `ItemPedido` a partir de uma lista. Isso usa a referência de método para o construtor de array (`ItemPedido[]::new`), que é equivalente a escrever uma lambda como `(size) -> new ItemPedido[size]`.