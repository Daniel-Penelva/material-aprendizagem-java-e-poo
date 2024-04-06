package exemploSwitch.java17;

public class Principal {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(TipoUsuario.ADMINISTRADOR, "Daniel");
		Usuario usuario1 = new Usuario(TipoUsuario.USUARIO_COMUM, "Márcia");
		Usuario usuario2 = new Usuario(TipoUsuario.CONVIDADO, "Biana");

		String tipoAdministrador = usuario.getNomeMaiuscula();
		System.out.println(tipoAdministrador);

		System.out.println(usuario1.getNomeMaiuscula());
		System.out.println(usuario2.getNomeMaiuscula());

	}

}
