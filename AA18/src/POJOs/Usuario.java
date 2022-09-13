package POJOs;

public class Usuario {

	private String usuario;
	private String nombre;
	private String apellido;
	
	public Usuario(String usuario, String nombre, String apellido) {
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Usuario: " +usuario+ " Nombre: " +nombre+ " Apellido: " +apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
