package practica;

public class Carnaval {
	private String nombre;
	private String cif;
	private int telefono;
	private int componentes;
	private CiudadConcurso ciudadConcurso;
	private Localidad localidad;
	
	
	
	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param ciudadConcurso
	 * @param localidad
	 */
	public Carnaval(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.telefono = telefono;
		this.componentes = componentes;
		this.localidad = localidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getComponentes() {
		return componentes;
	}
	public void setComponentes(int componentes) {
		this.componentes = componentes;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	public CiudadConcurso getCiudadConcurso() {
		return ciudadConcurso;
	}
	public void setCiudadConcurso(CiudadConcurso ciudadConcurso) {
		this.ciudadConcurso = ciudadConcurso;
	}
	

}
