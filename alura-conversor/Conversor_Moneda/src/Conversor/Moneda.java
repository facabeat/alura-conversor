
public abstract class Moneda {   	
	protected double cantidadConvertir; /
	
	}*/
	
	protected  void setCantidadConvertir(double cantidadConvertir) {
		this.cantidadConvertir=cantidadConvertir;
	}
	
	protected double getCantidadConvertir() { //
			return this.cantidadConvertir;
		
	}
	
	
	public abstract double convertirPesosAOtraMoneda(); 
	
	public abstract double convertirOtraMonedaAPesos(); 
}