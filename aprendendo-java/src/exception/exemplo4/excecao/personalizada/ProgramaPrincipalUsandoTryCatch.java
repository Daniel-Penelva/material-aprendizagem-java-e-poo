package exception.exemplo4.excecao.personalizada;

import exception.exemplo4.excecao.personalizada.*;

public class ProgramaPrincipalUsandoTryCatch {

	public static void main(String[] args) {
	       
	    /* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
	      //public static void main(String[] args) throws CPFInvalidaException
	          
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
	          
		try{
	       	   
				ValidacaoUtilCPFeCNPJ.validarCpf("0123456789");
		       	    
		       	Integer x;
	 		
	 		    int vetor[] = new int[3];
	 		    int valor = 0;
	 		    for(int i=0; i<vetor.length; i++){   
	 		    	valor = valor + 10;
	 			     vetor[i] = valor;
	 			}
	 		        
	 		    //OBS. Acessando a posi��o 5, mas a posi��o 5 n�o existe!!!
	 			for(int i=0; i<5; i++){ 
	 				System.out.println(vetor[i]);
	 			}
	 			
	 			ValidacaoUtilCPFeCNPJ.validandoCNPJ("6789");
	 			
	 	} catch(CPFInvalidaException e){
	 		
	        	System.out.println("Erro: " + e.getMessage());
	        	e.printStackTrace(); //o m�todo printStackTrace() mostra a pilha de informa��es da exce��o do erro
	       	    e.printStackTrace();
	       	    
	   } catch (CNPJInvalidaException e) {
		   System.out.println("Erro: " + e.getMessage());
		   e.printStackTrace();
				
	   }catch(Exception e){
		   System.out.println("Erro: " + e.getMessage());//neste caso eu posso tratar gen�ricamente a exce��o do RuntimeException - exemplo do array
		   
	   }finally{
	       System.out.println("Passa independente do catch");
	   }
	}
}

