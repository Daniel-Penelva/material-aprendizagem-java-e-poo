package exemploSwitch.java17;

public class Usuario {

	private TipoUsuario tipo;
	private String nome;

	public Usuario(TipoUsuario tipo, String nome) {
		super();
		this.tipo = tipo;
		this.nome = nome;
	}

	// Exemplificando o uso de Switch nova funcionalidade do java 17
	public String getNomeMaiuscula() {
		return switch (tipo) {
		case ADMINISTRADOR -> "ADMINISTRADOR: " + nome.toUpperCase();
		case USUARIO_COMUM -> "USU�RIO COMUM: " + nome.toUpperCase();
		case CONVIDADO -> "CONVIDADO: " + nome.toUpperCase();
		default -> "TIPO USU�RIO INV�LIDO";
		};
	}

}
