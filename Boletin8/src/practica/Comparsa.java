package practica;

public class Comparsa extends Carnaval {
	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param localidad
	 * @param tieneSentimiento
	 */
	public Comparsa(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad,
			boolean tieneSentimiento) {
		super(nombre, cif, telefono, componentes, ciudadConcurso, localidad);
		this.tieneSentimiento = tieneSentimiento;
	}

	private boolean tieneSentimiento=false;

	public boolean isTieneSentimiento() {
		return tieneSentimiento;
	}

	public void setTieneSentimiento(boolean tieneSentimiento) {
		this.tieneSentimiento = tieneSentimiento;
	}

}
