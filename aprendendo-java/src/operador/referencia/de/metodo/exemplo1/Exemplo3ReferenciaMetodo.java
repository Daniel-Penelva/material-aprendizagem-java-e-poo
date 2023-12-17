package operador.referencia.de.metodo.exemplo1;

public class Exemplo3ReferenciaMetodo {

	public static void main(String[] args) {
		
        //Comparador comparador = (s1, s2) -> s1.compareTo(s2); // Usando uma expressão lambda para implementar a interface funcional
		
		// Usando referência a método de instância de um tipo arbitrário (método compareTo)
		//Operador de referência - São três etapas:
		//1º - o Tipo | 2º o operador de referência :: | 3º o nome do método que quer chamar sem os parênteses 
        Comparador comparador = String::compareTo;
        
        int resultado = comparador.comparar("abc", "def");
        System.out.println("Resultado da comparação: " + resultado);

	}

}


//Interface funcional com um método
interface Comparador {
 int comparar(String s1, String s2);
}
