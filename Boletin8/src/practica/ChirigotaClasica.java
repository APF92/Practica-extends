package practica;

public class ChirigotaClasica extends Chirigota {
	private boolean suenaAntiguo=false;

	/**
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param componentes
	 * @param ciudadConcurso 
	 * @param localidad
	 * @param tieneGracia
	 * @param suenaAntiguo
	 */
	public ChirigotaClasica(String nombre, String cif, int telefono, int componentes, CiudadConcurso ciudadConcurso, Localidad localidad,
			boolean tieneGracia, boolean suenaAntiguo) {
		super(nombre, cif, telefono, componentes, ciudadConcurso, localidad, tieneGracia);
		this.suenaAntiguo = suenaAntiguo;
	}

	public boolean isSuenaAntiguo() {
		return suenaAntiguo;
	}

	public void setSuenaAntiguo(boolean suenaAntiguo) {
		this.suenaAntiguo = suenaAntiguo;
	}
	
	public String toString() {
		return "Chirigota: " + 
				"nombre= '" + getNombre() + '\'' + 
				", cif= '" + getCif() + '\'' + 
				", telefono= " + getTelefono() +  
				", componentes= " + getComponentes() + 
				", localidad= " + getLocalidad() + 
				", ciudadConcurso= " + getCiudadConcurso() +
				", tieneGracia= " + isTieneGracia() +
				", suenaAntiguo= " + isSuenaAntiguo();
	}
	
	 public static void main(String[] args) {
	        // Crear instancias de Chirigota
	        Chirigota chirigota1 = new Chirigota("Los de las Anchoas", "876954321P", 722666544, 11, CiudadConcurso.CADIZ, Localidad.SANTOÑA, true);
	        Chirigota chirigota2 = new Chirigota("No te vayas todavía", "123456789X", 686575464, 12, CiudadConcurso.CADIZ, Localidad.SEVILLA, true);
	        ChirigotaClasica chirigota3 = new ChirigotaClasica("Los de Cadiz Norte", "213432543J", 645546654, 12, CiudadConcurso.CADIZ, Localidad.CADIZ, false, true);

	        // Imprimir información de las instancias creadas
	        System.out.println("Chirigota 1: " + chirigota1);
	        System.out.println("Chirigota 2: " + chirigota2);
	        System.out.println("Chirigota 3: " + chirigota3);
	    }

}
