# Método Sobrescrito

A sobrescrita de métodos ocorre quando uma classe filha fornece uma implementação específica para um método que já está definido em sua classe pai. Isso permite que a classe filha substitua o comportamento do método herdado da classe pai. AAlguns conceitos-chave sobre a sobrescrita de métodos em Java:

1. **Assinatura do Método:**
   - A sobrescrita deve manter a mesma assinatura do método na classe pai, incluindo o mesmo nome, tipo de retorno e lista de parâmetros.

2. **Modificador de Acesso:**
   - O modificador de acesso do método na classe filha não pode ser mais restritivo do que o modificador na classe pai. Ou seja, se um método é público na classe pai, deve permanecer público na classe filha.


O uso da anotação `@Override` não é estritamente necessário, mas é uma prática recomendada para indicar explicitamente que o método está sendo sobrescrito.

A sobrescrita de métodos é uma técnica poderosa que permite a especialização de comportamento em classes derivadas, proporcionando uma maior flexibilidade no design de classes em hierarquias de herança.