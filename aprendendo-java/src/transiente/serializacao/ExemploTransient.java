package transiente.serializacao;

import java.io.*;

class MinhaClasse implements Serializable {
    // Este campo será serializado
    private String nome;

    // Este campo será excluído do processo de serialização
    transient private int valorTransiente;

    public MinhaClasse(String nome, int valorTransiente) {
        this.nome = nome;
        this.valorTransiente = valorTransiente;
    }

    @Override
    public String toString() {
        return "MinhaClasse{nome='" + nome + "', valorTransiente=" + valorTransiente + '}';
    }
}

public class ExemploTransient {
    public static void main(String[] args) {
        
    	MinhaClasse objeto = new MinhaClasse("Objeto", 42);

        // Serialização
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivo_serializado.ser"))) {
            oos.writeObject(objeto);
            System.out.println("Objeto serializado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserialização
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivo_serializado.ser"))) {
            MinhaClasse objetoDesserializado = (MinhaClasse) ois.readObject();
            System.out.println("Objeto desserializado: " + objetoDesserializado);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
