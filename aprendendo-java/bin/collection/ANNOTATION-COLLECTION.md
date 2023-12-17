# Collection

A interface Collection faz parte do framework de cole��es e representa um grupo de objetos conhecidos como elementos. As classes que implementam a interface Collection oferecem m�todos para manipula��o de elementos, como adicionar, remover e verificar a presen�a de um elemento na cole��o.

Esses s�o apenas alguns exemplos b�sicos de como trabalhar com a interface Collection e suas implementa��es no framework de cole��es Java. A API de cole��es fornece uma rica variedade de classes e interfaces que podem atender a v�rias necessidades de armazenamento e manipula��o de dados. Ao explorar t�picos mais avan�ados, voc� pode descobrir classes como Queue, Deque, LinkedList, entre outras.

## Diferenciando cada estrutura de dados:

### 1. **List (ArrayList):**
   - **Caracter�sticas:** 
     - Cole��o ordenada de elementos (mant�m a ordem de inser��o).
     - Permite elementos duplicados.
     - Os elementos podem ser acessados por meio de �ndices.
   - **Uso T�pico:**
     - Quando voc� precisa de uma lista ordenada de elementos e pode ter duplicatas.
     - �til quando a ordem de inser��o ou posi��o � importante.

   Exemplo:
   ```java
   List<String> lista = new ArrayList<>();
   lista.add("Ma��");
   lista.add("Banana");
   lista.add("P�ra");
   ```

### 2. **Set (HashSet):**
   - **Caracter�sticas:** 
     - N�o mant�m uma ordem espec�fica dos elementos (n�o garante a ordem de inser��o).
     - N�o permite elementos duplicados.
     - N�o suporta acesso por �ndices.
   - **Uso T�pico:**
     - Quando voc� precisa garantir que n�o haja elementos duplicados.
     - N�o se preocupa com a ordem dos elementos.

   Exemplo:
   ```java
   Set<String> conjunto = new HashSet<>();
   conjunto.add("Ma��");
   conjunto.add("Banana");
   conjunto.add("P�ra");
   ```

### 3. **Map (HashMap):**
   - **Caracter�sticas:** 
     - Estrutura chave-valor, onde cada elemento � associado a uma chave �nica.
     - N�o mant�m uma ordem espec�fica dos pares chave-valor.
     - Permite que chaves ou valores sejam duplicados.
   - **Uso T�pico:**
     - Armazenamento de informa��es associadas a chaves �nicas.
     - Quando voc� precisa de um r�pido acesso a valores com base em uma chave.

   Exemplo:
   ```java
   Map<String, Integer> mapa = new HashMap<>();
   mapa.put("Ma��", 3);
   mapa.put("Banana", 5);
   mapa.put("P�ra", 2);
   ```

### 4. **Iterator:**
   - **Caracter�sticas:** 
     - Interface utilizada para percorrer (iterar) cole��es em Java.
     - Oferece m�todos como `hasNext()` para verificar se h� mais elementos, e `next()` para obter o pr�ximo elemento.
     - Permite a remo��o de elementos durante a itera��o (atrav�s do m�todo `remove()`).

   - **Uso T�pico:**
     - Quando voc� precisa percorrer os elementos de uma cole��o sem se preocupar com a implementa��o espec�fica da cole��o.

   Exemplo de uso:
   ```java
   List<String> lista = new ArrayList<>();
   lista.add("Ma��");
   lista.add("Banana");
   lista.add("P�ra");

   Iterator<String> iterator = lista.iterator();
   while (iterator.hasNext()) {
       String elemento = iterator.next();
       System.out.println(elemento);
   }
   ```

   Neste exemplo, o `Iterator` � utilizado para percorrer os elementos da lista. Note que a itera��o � realizada atrav�s de um loop while, onde `hasNext()` verifica se h� mais elementos e `next()` obt�m o pr�ximo elemento.

A escolha entre usar um loop `for-each` (enhanced for loop) ou um `Iterator` depende do contexto e dos requisitos espec�ficos do seu c�digo. Em muitos casos, o uso do `for-each` � mais conciso e leg�vel, mas o `Iterator` oferece mais controle, especialmente quando precisa remover elementos durante a itera��o.