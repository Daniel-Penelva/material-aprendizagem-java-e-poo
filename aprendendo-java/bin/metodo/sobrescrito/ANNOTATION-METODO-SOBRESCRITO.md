# M�todo Sobrescrito

A sobrescrita de m�todos ocorre quando uma classe filha fornece uma implementa��o espec�fica para um m�todo que j� est� definido em sua classe pai. Isso permite que a classe filha substitua o comportamento do m�todo herdado da classe pai. AAlguns conceitos-chave sobre a sobrescrita de m�todos em Java:

1. **Assinatura do M�todo:**
   - A sobrescrita deve manter a mesma assinatura do m�todo na classe pai, incluindo o mesmo nome, tipo de retorno e lista de par�metros.

2. **Modificador de Acesso:**
   - O modificador de acesso do m�todo na classe filha n�o pode ser mais restritivo do que o modificador na classe pai. Ou seja, se um m�todo � p�blico na classe pai, deve permanecer p�blico na classe filha.


O uso da anota��o `@Override` n�o � estritamente necess�rio, mas � uma pr�tica recomendada para indicar explicitamente que o m�todo est� sendo sobrescrito.

A sobrescrita de m�todos � uma t�cnica poderosa que permite a especializa��o de comportamento em classes derivadas, proporcionando uma maior flexibilidade no design de classes em hierarquias de heran�a.