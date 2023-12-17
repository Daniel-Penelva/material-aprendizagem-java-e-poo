# Static

A palavra-chave `static` em Java � usada para criar membros de classe (membros est�ticos), o que significa que esses membros pertencem � classe em vez de 
pertencerem a inst�ncias espec�ficas dessa classe. Aqui est�o alguns conceitos importantes relacionados � palavra-chave `static`:

1. **Membros Est�ticos:**
   - Os membros est�ticos s�o compartilhados por todas as inst�ncias da classe e podem ser acessados diretamente atrav�s do nome da classe, sem precisar criar uma inst�ncia da classe.
   - Membros est�ticos incluem vari�veis est�ticas (ou campos est�ticos) e m�todos est�ticos.

2. **Vari�veis Est�ticas:**
   - Uma vari�vel est�tica � compartilhada por todas as inst�ncias da classe. Pode ser usada para armazenar dados que devem ser compartilhados entre todas as inst�ncias da classe.

3. **M�todos Est�ticos:**
   - Um m�todo est�tico pertence � classe, n�o a inst�ncias espec�ficas. Pode ser chamado diretamente atrav�s do nome da classe, sem criar uma inst�ncia da classe.

O uso de membros est�ticos � �til em situa��es em que voc� deseja compartilhar dados ou funcionalidades entre todas as inst�ncias de uma classe, ou quando a l�gica de um m�todo n�o depende do estado espec�fico de uma inst�ncia. No entanto, � importante us�-los com modera��o, pois o compartilhamento excessivo de estado global pode levar a problemas de manuten��o e acoplamento.