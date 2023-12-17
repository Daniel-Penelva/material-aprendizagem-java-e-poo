# Static

A palavra-chave `static` em Java é usada para criar membros de classe (membros estáticos), o que significa que esses membros pertencem à classe em vez de 
pertencerem a instâncias específicas dessa classe. Aqui estão alguns conceitos importantes relacionados à palavra-chave `static`:

1. **Membros Estáticos:**
   - Os membros estáticos são compartilhados por todas as instâncias da classe e podem ser acessados diretamente através do nome da classe, sem precisar criar uma instância da classe.
   - Membros estáticos incluem variáveis estáticas (ou campos estáticos) e métodos estáticos.

2. **Variáveis Estáticas:**
   - Uma variável estática é compartilhada por todas as instâncias da classe. Pode ser usada para armazenar dados que devem ser compartilhados entre todas as instâncias da classe.

3. **Métodos Estáticos:**
   - Um método estático pertence à classe, não a instâncias específicas. Pode ser chamado diretamente através do nome da classe, sem criar uma instância da classe.

O uso de membros estáticos é útil em situações em que você deseja compartilhar dados ou funcionalidades entre todas as instâncias de uma classe, ou quando a lógica de um método não depende do estado específico de uma instância. No entanto, é importante usá-los com moderação, pois o compartilhamento excessivo de estado global pode levar a problemas de manutenção e acoplamento.