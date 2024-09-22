package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;	

public abstract class CalculadoraTarifas {
	public static double IMPUESTO = 0.28; 
	
	public CalculadoraTarifas() {		
	}
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase(vuelo, cliente);
        double porcentajeDescuento = calcularPorcentajeDescuento(cliente);
        int valorImpuesto = calcularValorImpuesto(costoBase);
        
        return (int) ((costoBase - (costoBase * porcentajeDescuento)) + valorImpuesto);
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		Aeropuerto origen = ruta.getOrigen();
	    Aeropuerto destino = ruta.getDestino();
	
	    return Aeropuerto.calcularDistancia(origen, destino);
        
    }
	
	protected int calcularValorImpuesto(int costoBase) {
		return (int) (costoBase * IMPUESTO);
	}
	
}
