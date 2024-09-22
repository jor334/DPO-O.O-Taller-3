package uniandes.dpoo.aerolinea.modelo;
import java.util.ArrayList;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;


public class Vuelo {

	private Avion avion;
	private String fecha;
	private Ruta ruta;
	private ArrayList<Tiquete>tiquetes;
	
    //constructor
	public Vuelo(Avion avion, String fecha, Ruta ruta) {
		this.avion = avion;
		this.fecha = fecha;
		this.ruta = ruta;
		tiquetes = new ArrayList<Tiquete>();
	}
	
	
	//getters
	public Ruta getRuta() {
		return ruta;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public ArrayList<Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	//#TODO completar el throws
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
	}
}
