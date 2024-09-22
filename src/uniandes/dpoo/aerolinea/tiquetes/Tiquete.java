package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	//constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
		this.usado = false;
	}
	
	//getters
	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public boolean esUsado() {
		return usado;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
}
