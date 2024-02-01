package practica;

public class Chirigota extends Carnaval {
	private boolean tieneGracia=true;
	
	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param ciudadConcurso
	 * @param localidad
	 * @param gracia
	 */
	public Chirigota(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad, boolean tieneGracia) {
		super(nombre, cif, telefono, componentes, ciudadConcurso, localidad);
		this.tieneGracia = tieneGracia;
	}

	public boolean isTieneGracia() {
		return tieneGracia;
	}

	public void setTieneGracia(boolean tieneGracia) {
		this.tieneGracia = tieneGracia;
	}
	
	public String toString() {
		return "Chirigota: " + 
				"nombre= '" + getNombre() + '\'' + 
				", cif= '" + getCif() + '\'' + 
				", telefono= " + getTelefono() +  
				", componentes= " + getComponentes() +
				", ciudadConcurso= " + getCiudadConcurso() +
				", localidad= " + getLocalidad() + 
				", tieneGracia= " + isTieneGracia();
	}
	
	 public static void main(String[] args) {
	        // Crear instancias de Chirigota
	        Chirigota chirigota1 = new Chirigota("Los de las Anchoas", "876954321P", 722666544, 11, CiudadConcurso.CADIZ, Localidad.SANTOÑA, true);
	        Chirigota chirigota2 = new Chirigota("No te vayas todavía", "123456789X", 686575464, 12, CiudadConcurso.CADIZ, Localidad.SEVILLA, true);
	        ChirigotaClasica chirigota3 = new ChirigotaClasica("Los de Cadiz Norte", "213432543J", 645546654, 12, CiudadConcurso.CADIZ, Localidad.CADIZ, false, true);

	        // Imprimir información de las instancias creadas
	        System.out.println(chirigota1);
	        System.out.println(chirigota2);
	        System.out.println(chirigota3);
	    }
}
