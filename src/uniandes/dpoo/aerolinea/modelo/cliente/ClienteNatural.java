package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {

	public static String NATURAL = "Natural";
	private String nombre;
	
	
	//constructor
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	//getters
	
	@Override
	public String getTipoeCliente() {
		
		return NATURAL;
	}

	
	@Override
	public String getIdentificador() {
		return nombre;
	}

	
}
