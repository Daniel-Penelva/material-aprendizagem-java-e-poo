# Abstract 

A palavra-chave abstract é utilizada para definir classes e métodos abstratos. 

Explorando abstract em ambos os casos:

## 1. **Classes Abstratas:**
   - Uma classe abstrata é uma classe que não pode ser instanciada diretamente. É frequentemente utilizada para fornecer uma base comum para subclasses e para conter métodos abstratos que devem ser implementados pelas subclasses.
   - Uma classe abstrata pode ter métodos abstratos (sem implementação) e métodos concretos (com implementação).

Uma classe abstrata não pode ser instanciada diretamente, o que significa que não pode criar objetos (instanciar) a partir dela. A razão para isso é que as classes abstratas geralmente são projetadas para serem estendidas por subclasses concretas que fornecem implementações para métodos abstratos.

Quando declara uma classe como abstrata usando a palavra-chave abstract, isso implica que a classe é incompleta e deve ser estendida para ser utilizada completamente. Uma classe abstrata pode ter métodos concretos com implementações, mas também pode ter métodos abstratos, que são apenas declarações de método sem implementação.

## 2. **Métodos Abstratos:**
   - Um método abstrato é um método declarado sem uma implementação na classe abstrata. A implementação é fornecida pelas subclasses concretas.
   - Toda classe que contém um método abstrato deve ser marcada como abstrata.

O uso de classes e métodos abstratos é útil quando quer fornecer uma estrutura comum para várias classes, mas deixa a implementação específica para as subclasses.