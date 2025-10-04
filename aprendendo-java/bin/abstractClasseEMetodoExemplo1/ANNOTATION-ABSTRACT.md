# Abstract 

A palavra-chave abstract � utilizada para definir classes e m�todos abstratos. 

Explorando abstract em ambos os casos:

## 1. **Classes Abstratas:**
   - Uma classe abstrata � uma classe que n�o pode ser instanciada diretamente. � frequentemente utilizada para fornecer uma base comum para subclasses e para conter m�todos abstratos que devem ser implementados pelas subclasses.
   - Uma classe abstrata pode ter m�todos abstratos (sem implementa��o) e m�todos concretos (com implementa��o).

Uma classe abstrata n�o pode ser instanciada diretamente, o que significa que n�o pode criar objetos (instanciar) a partir dela. A raz�o para isso � que as classes abstratas geralmente s�o projetadas para serem estendidas por subclasses concretas que fornecem implementa��es para m�todos abstratos.

Quando declara uma classe como abstrata usando a palavra-chave abstract, isso implica que a classe � incompleta e deve ser estendida para ser utilizada completamente. Uma classe abstrata pode ter m�todos concretos com implementa��es, mas tamb�m pode ter m�todos abstratos, que s�o apenas declara��es de m�todo sem implementa��o.

## 2. **M�todos Abstratos:**
   - Um m�todo abstrato � um m�todo declarado sem uma implementa��o na classe abstrata. A implementa��o � fornecida pelas subclasses concretas.
   - Toda classe que cont�m um m�todo abstrato deve ser marcada como abstrata.

O uso de classes e m�todos abstratos é útil quando quer fornecer uma estrutura comum para várias classes, mas deixa a implementação específica para as subclasses.