# O operador `::`

O operador `::` em Java � conhecido como o operador de refer�ncia de m�todo. Ele permite referenciar m�todos existentes ou construtores por meio de seus nomes, em vez de fornecer uma implementa��o completa. Este operador � comumente usado em express�es lambda e em certos contextos, como a cria��o de arrays.

**OBS.** Assim como as exrpess�es lambdas, os operadores de refer�ncia de m�todo (::) s� podem ser utilizados em interface Funcional (ou seja, s� apresentam m�todos abstratos), se utilizar, por exemplo, uma interface em Object vai dar erro, porque ela n�o t�m apenas m�todos abstratos.

**Sintaxe:**

<Class name>::<method name>

**Dica:**
Operador de refer�ncia s�o definidos em tr�s etapas:
  - o Tipo
  - o operador de refer�ncia :: 
  - o nome do m�todo que quer chamar sem os par�nteses
  
  - **Por Exemplo:** `clientes.forEach(Cliente :: getNome);`

Alguns exemplos para entender melhor:

1. **Refer�ncia de M�todo para Construtores:**

   Usando `::` para referenciar um construtor. Suponha que voc� tenha uma interface funcional `Fabrica` com um m�todo `criar`:

   ```java
   interface Fabrica<T> {
       T criar();
   }

   // Com express�o lambda
   Fabrica<Exemplo> fabricaLambda = () -> new Exemplo();

   // Com refer�ncia de m�todo
   Fabrica<Exemplo> fabricaMetodoReferencia = Exemplo::new;
   ```

2. **Refer�ncia de M�todo para M�todos Est�ticos:**

   Voc� pode usar `::` para referenciar m�todos est�ticos:

   ```java
   interface Operacao {
       static int somar(int a, int b) {
           return a + b;
       }
   }

   // Com express�o lambda
   Operacao operacaoLambda = (a, b) -> Operacao.somar(a, b);

   // Com refer�ncia de m�todo
   Operacao operacaoMetodoReferencia = Operacao::somar;
   ```

3. **Refer�ncia de M�todo para M�todos de Inst�ncia em um Objeto Particular:**

   Se j� tem um objeto e deseja chamar um m�todo de inst�ncia sobre ele, voc� pode usar `::`:

   ```java
   class Impressora {
       void imprimir(String texto) {
           System.out.println(texto);
       }
   }

   Impressora minhaImpressora = new Impressora();

   // Com express�o lambda
   Consumer<String> consumidorLambda = texto -> minhaImpressora.imprimir(texto);

   // Com refer�ncia de m�todo
   Consumer<String> consumidorMetodoReferencia = minhaImpressora::imprimir;
   ```

4. **Refer�ncia de M�todo para M�todos de Inst�ncia de um Tipo Espec�fico:**

   Se estiver trabalhando com um tipo espec�fico, pode usar `::` para referenciar m�todos de inst�ncia desse tipo:

   ```java
   List<String> palavras = Arrays.asList("Java", "�", "legal");

   // Com express�o lambda
   palavras.forEach(s -> System.out.println(s));

   // Com refer�ncia de m�todo
   palavras.forEach(System.out::println);
   ```

   Aqui, `System.out::println` � uma refer�ncia de m�todo para o m�todo `println` da classe `PrintStream`.

No contexto espec�fico que voc� mencionou, `toArray(ItemPedido[]::new)` � uma forma mais concisa de criar um array de `ItemPedido` a partir de uma lista. Isso usa a refer�ncia de m�todo para o construtor de array (`ItemPedido[]::new`), que � equivalente a escrever uma lambda como `(size) -> new ItemPedido[size]`.