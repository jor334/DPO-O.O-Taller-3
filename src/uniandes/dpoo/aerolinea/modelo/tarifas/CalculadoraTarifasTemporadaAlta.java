package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	
	protected int COSTO_POR_KM = 1000;
	
	public CalculadoraTarifasTemporadaAlta() {
		super();
	}
	
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return calcularDistanciaVuelo(vuelo.getRuta()) * COSTO_POR_KM;
	}
	
	
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}
