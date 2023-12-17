package operador.referencia.de.metodo.exemplo1;

public class Exemplo3ReferenciaMetodo {

	public static void main(String[] args) {
		
        //Comparador comparador = (s1, s2) -> s1.compareTo(s2); // Usando uma express�o lambda para implementar a interface funcional
		
		// Usando refer�ncia a m�todo de inst�ncia de um tipo arbitr�rio (m�todo compareTo)
		//Operador de refer�ncia - S�o tr�s etapas:
		//1� - o Tipo | 2� o operador de refer�ncia :: | 3� o nome do m�todo que quer chamar sem os par�nteses 
        Comparador comparador = String::compareTo;
        
        int resultado = comparador.comparar("abc", "def");
        System.out.println("Resultado da compara��o: " + resultado);

	}

}


//Interface funcional com um m�todo
interface Comparador {
 int comparar(String s1, String s2);
}
