package practica;

public class Cuarteto extends Carnaval{
	private boolean tieneIronia=false;

	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param localidad
	 * @param tieneIronia
	 */
	public Cuarteto(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad, boolean tieneIronia) {
		super(nombre, cif, telefono, componentes, ciudadConcurso, localidad);
		this.tieneIronia = tieneIronia;
	}

	public boolean isTieneIronia() {
		return tieneIronia;
	}

	public void setTieneIronia(boolean tieneIronia) {
		this.tieneIronia = tieneIronia;
	}

}
