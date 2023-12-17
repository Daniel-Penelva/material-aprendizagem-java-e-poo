# Collection

A interface Collection faz parte do framework de coleções e representa um grupo de objetos conhecidos como elementos. As classes que implementam a interface Collection oferecem métodos para manipulação de elementos, como adicionar, remover e verificar a presença de um elemento na coleção.

Esses são apenas alguns exemplos básicos de como trabalhar com a interface Collection e suas implementações no framework de coleções Java. A API de coleções fornece uma rica variedade de classes e interfaces que podem atender a várias necessidades de armazenamento e manipulação de dados. Ao explorar tópicos mais avançados, você pode descobrir classes como Queue, Deque, LinkedList, entre outras.

## Diferenciando cada estrutura de dados:

### 1. **List (ArrayList):**
   - **Características:** 
     - Coleção ordenada de elementos (mantém a ordem de inserção).
     - Permite elementos duplicados.
     - Os elementos podem ser acessados por meio de índices.
   - **Uso Típico:**
     - Quando você precisa de uma lista ordenada de elementos e pode ter duplicatas.
     - Útil quando a ordem de inserção ou posição é importante.

   Exemplo:
   ```java
   List<String> lista = new ArrayList<>();
   lista.add("Maçã");
   lista.add("Banana");
   lista.add("Pêra");
   ```

### 2. **Set (HashSet):**
   - **Características:** 
     - Não mantém uma ordem específica dos elementos (não garante a ordem de inserção).
     - Não permite elementos duplicados.
     - Não suporta acesso por índices.
   - **Uso Típico:**
     - Quando você precisa garantir que não haja elementos duplicados.
     - Não se preocupa com a ordem dos elementos.

   Exemplo:
   ```java
   Set<String> conjunto = new HashSet<>();
   conjunto.add("Maçã");
   conjunto.add("Banana");
   conjunto.add("Pêra");
   ```

### 3. **Map (HashMap):**
   - **Características:** 
     - Estrutura chave-valor, onde cada elemento é associado a uma chave única.
     - Não mantém uma ordem específica dos pares chave-valor.
     - Permite que chaves ou valores sejam duplicados.
   - **Uso Típico:**
     - Armazenamento de informações associadas a chaves únicas.
     - Quando você precisa de um rápido acesso a valores com base em uma chave.

   Exemplo:
   ```java
   Map<String, Integer> mapa = new HashMap<>();
   mapa.put("Maçã", 3);
   mapa.put("Banana", 5);
   mapa.put("Pêra", 2);
   ```

### 4. **Iterator:**
   - **Características:** 
     - Interface utilizada para percorrer (iterar) coleções em Java.
     - Oferece métodos como `hasNext()` para verificar se há mais elementos, e `next()` para obter o próximo elemento.
     - Permite a remoção de elementos durante a iteração (através do método `remove()`).

   - **Uso Típico:**
     - Quando você precisa percorrer os elementos de uma coleção sem se preocupar com a implementação específica da coleção.

   Exemplo de uso:
   ```java
   List<String> lista = new ArrayList<>();
   lista.add("Maçã");
   lista.add("Banana");
   lista.add("Pêra");

   Iterator<String> iterator = lista.iterator();
   while (iterator.hasNext()) {
       String elemento = iterator.next();
       System.out.println(elemento);
   }
   ```

   Neste exemplo, o `Iterator` é utilizado para percorrer os elementos da lista. Note que a iteração é realizada através de um loop while, onde `hasNext()` verifica se há mais elementos e `next()` obtém o próximo elemento.

A escolha entre usar um loop `for-each` (enhanced for loop) ou um `Iterator` depende do contexto e dos requisitos específicos do seu código. Em muitos casos, o uso do `for-each` é mais conciso e legível, mas o `Iterator` oferece mais controle, especialmente quando precisa remover elementos durante a iteração.