package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.ArrayList;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
public abstract class Cliente {

	private ArrayList<Tiquete>tiquetesSinUsar;
	private ArrayList<Tiquete>tiquetesUsados;
	
	//constructor
	public Cliente() {
		tiquetesSinUsar = new ArrayList<Tiquete>();
		tiquetesUsados = new ArrayList<Tiquete>();
	}
	
	//getters y metodos
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		
		int valorTotal = 0;
		for (int i = 0; i < tiquetesSinUsar.size(); i++) {
			valorTotal += tiquetesSinUsar.get(i).getTarifa();
		}
		return valorTotal;
	}
	
	public void usarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.remove(tiquete);
		tiquetesUsados.add(tiquete);
	}
	
}
