package uniandes.dpoo.aerolinea.persistencia;
import java.io.IOException;
import org.json.JSONException;


import uniandes.dpoo.aerolinea.modelo.Aerolinea;
public interface IPersistenciaAerolinea {
	
	
	public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws IOException, InformacionInconsistenteException, JSONException, AeropuertoDuplicadoException;

	public void salvarAerolinea(String archivo, Aerolinea aerolinea);
}
