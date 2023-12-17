package classeOptional;

import java.util.Optional;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Criar inst�ncias de Usuario com e sem nome
        Usuario usuarioComNome = new Usuario("Jo�o");
        Usuario usuarioSemNome = new Usuario(null);

        // Exemplo utilizando Optional para imprimir o nome do usu�rio
        imprimirNome(usuarioComNome);
        imprimirNome(usuarioSemNome);

	}

	// M�todo que utiliza Optional para imprimir o nome do usu�rio, lidando com casos nulos
	private static void imprimirNome(Usuario usuario) {
        
		Optional.ofNullable(usuario)
                .map(Usuario::getNome)
                .ifPresentOrElse(nome -> System.out.println("Nome do usu�rio: " + nome),
                        () -> System.out.println("Nome n�o dispon�vel")
                );
	}
}


/** Explicando passo a passo o m�todo imprimirNome():
 * 
 * O m�todo `imprimirNome` � um exemplo de como usar o `Optional` para lidar com a possibilidade de um nome de usu�rio ser nulo. 
 * 
 * 1. **`Optional.ofNullable(usuario)`**:
 *     - `Optional.ofNullable` cria um `Optional` a partir do objeto `usuario`. Isso � �til porque `ofNullable` permite lidar com a situa��o em que o 
 *       `usuario` pode ser nulo sem lan�ar uma exce��o.
 *       
 * 2. **`map(Usuario::getNome)`**:
 * 		- `map` � usado para transformar o valor dentro do `Optional`. Neste caso, estou mapeando o `Usuario` para seu nome. Se o `usuario` n�o for nulo, 
 *        `map` aplica a fun��o `Usuario::getNome` para obter o nome. Se o `usuario` for nulo, `map` n�o faz nada.
 *        
 * 3. **`ifPresentOrElse(...)`**:
 * 		- `ifPresentOrElse` � usado para executar a��es com base na presen�a ou aus�ncia do valor dentro do `Optional`.
 * 		- Se o valor estiver presente (ou seja, o nome n�o � nulo), o primeiro lambda (`nome -> System.out.println("Nome do usu�rio: " + nome)`) ser� 
 *        executado, imprimindo o nome do usu�rio.
 *      - Se o valor n�o estiver presente (ou seja, o nome � nulo), o segundo lambda (`() -> System.out.println("Nome n�o dispon�vel")`) ser� executado, 
 *        imprimindo uma mensagem indicando que o nome n�o est� dispon�vel.
 *        
 * 4. **Linha a linha**:
 * - Se `usuario` n�o for nulo, `Optional.ofNullable(usuario)` cria um `Optional` contendo o `usuario`.
 * - Em seguida, `map(Usuario::getNome)` transforma o `Optional<Usuario>` em `Optional<String>` contendo o nome, se dispon�vel, ou um `Optional` vazio se o nome for nulo.
 * - Finalmente, `ifPresentOrElse(...)` executa o bloco de c�digo apropriado com base na presen�a ou aus�ncia do valor dentro do `Optional`. Se o nome 
 *   estiver presente, imprime o nome do usu�rio; caso contr�rio, imprime "Nome n�o dispon�vel".
 * 
 * O uso de `Optional` nesse exemplo permite lidar com a possibilidade de valores nulos de maneira mais limpa e expressiva, evitando a necessidade de verifica��es manuais de nulidade e tornando o c�digo mais conciso.
 * */

