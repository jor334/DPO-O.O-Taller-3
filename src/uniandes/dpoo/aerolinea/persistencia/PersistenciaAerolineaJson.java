package uniandes.dpoo.aerolinea.persistencia;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import org.json.JSONArray;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {

	@Override
	public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws IOException{
		
		String contenido = new String(Files.readAllBytes(Paths.get(archivo)));
		
		JSONObject json = new JSONObject(contenido);
		
		JSONArray clientesArray = json.getJSONArray("clientes");
		JSONArray tiquetesArray = json.getJSONArray("tiquetes");
		
		for (int i = 0; i< clientesArray.length(); i++) {
			JSONObject cliente = clientesArray.getJSONObject(i);
			
		}
	}
	
	public void salvarAerolinea(String archivo, Aerolinea aerolinea) {

		
			
		
	}
}
