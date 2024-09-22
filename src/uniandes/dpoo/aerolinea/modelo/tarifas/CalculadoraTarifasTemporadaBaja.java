package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;


public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	
	protected static int COSTO_POR_KM_NATURAL = 600;
	protected static int COSTO_POR_KM_CORPORATIVO= 900;
	protected static double DESCUENTO_PEQ = 0.02;
	protected static double DESCUENTO_MEDIANAS = 0.01;
	protected static double DESCUENTO_GRANDE = 0.02;
	
	public CalculadoraTarifasTemporadaBaja() {
		super();
	}
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int costoBase;
		if (cliente.getTipoCliente().equals("Natural")) {
			costoBase = calcularDistanciaVuelo(vuelo.getRuta()) * COSTO_POR_KM_NATURAL; 
		} else {
			costoBase = calcularDistanciaVuelo(vuelo.getRuta()) * COSTO_POR_KM_CORPORATIVO;
		}
		int calculo = calcularDistanciaVuelo(vuelo.getRuta());
		
		return costoBase * calculo;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		double descuento = 0;
		if (cliente.getTipoCliente().equals("Natural")) {
			descuento = DESCUENTO_PEQ;
		} else {
			if (cliente.getTipoCliente().equals("Mediana")) {
				descuento = DESCUENTO_MEDIANAS;
			} else {
				descuento = DESCUENTO_GRANDE;
			}
		}
		return descuento;
	}
	



}
