package POJOs;

public class Pais {

	private String nombre;
	private String capital;
	private String poblacion;
	private String clima;
	private String salarioMinimo;
	private Continente continente;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(String salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public Continente getContinente() {
		return continente;
	}
	public void setContinente(Continente continente) {
		this.continente = continente;
	}
	
	public Pais(String nombre, String capital, String poblacion, String clima, String salarioMinimo,
			Continente continente) {
		this.nombre = nombre;
		this.capital = capital;
		this.poblacion = poblacion;
		this.clima = clima;
		this.salarioMinimo = salarioMinimo;
		this.continente = continente;
	}
	
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", capital=" + capital + ", poblacion=" + poblacion + ", clima=" + clima
				+ ", salarioMinimo=" + salarioMinimo + ", continente=" + continente + "]";
	}
	
	
	

}
