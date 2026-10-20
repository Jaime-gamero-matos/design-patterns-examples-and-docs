package adapter;

public class DatosPago {
	private String idCliente;
	private double monto;
	public DatosPago(String idCliente, double monto) {
		super();
		this.idCliente = idCliente;
		this.monto = monto;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public double getMonto() {
		return monto;
	}
	
	
	
}
