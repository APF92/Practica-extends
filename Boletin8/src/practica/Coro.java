package practica;

public class Coro extends Carnaval {
	private boolean tieneAlegria=false;

	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param localidad
	 * @param tieneAlegria
	 */
	public Coro(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad, boolean tieneAlegria) {
		super(nombre, cif, telefono, componentes, ciudadConcurso, localidad);
		this.tieneAlegria = tieneAlegria;
	}

	public boolean isTieneAlegria() {
		return tieneAlegria;
	}

	public void setTieneAlegria(boolean tieneAlegria) {
		this.tieneAlegria = tieneAlegria;
	}
}
