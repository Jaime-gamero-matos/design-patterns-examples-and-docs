package adapter;

public class AdaptadorPasarelaPagos implements ProcesadorPagosActual {
	private PasarelaDePagoAntigua pasarelaAntigua;
	
	
	
	public AdaptadorPasarelaPagos(PasarelaDePagoAntigua pasarelaAntigua) {
		super();
		this.pasarelaAntigua = pasarelaAntigua;
	}



	@Override
	public void procesarPago(DatosPago datosBancarios) {
		//adaptamos los datos bancarios actuales a el xml que es el tipo de dato que acepta la pasarela
		String adaptadorXML = "<pago>" +
							  "<cliente>" + datosBancarios.getIdCliente() + "</cliente>" + 
							  "<monto>" +   datosBancarios.getMonto()     + "</monto>"+
							  "</pago>";
		pasarelaAntigua.hacerCobro(adaptadorXML);
	}

}
