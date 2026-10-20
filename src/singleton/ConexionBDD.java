package singleton;


public class ConexionBDD {
	//He elegido este ejemplo para explicar singleton ya que instanciar una conexion a BDD es un proceso costoso para el sistema
	//si hacemos varias instancias de ello el programa se volvera lento
	
	private static ConexionBDD instancia;
	
	//ya que la intencion de singleton es que solo exista un solo objeto o instancia de el, es conveniente que los atributos ya tengan su valor, ya que 
	//todos sus atributos son constantes es decir, nunca van a cambiar su valor.
	//por eso el constructor esta vacio a no ser que queramos aplicarle logica a su inicio
	
	private String url = "url de conexion a base de datos...";
	private String usuario = "Pepe";
	private String contrasenia = "1234";
	
	

	
	private ConexionBDD() {
		
	}



	public static ConexionBDD getInstancia() {
		if (instancia == null) {
			instancia = new ConexionBDD();
			System.out.println("Creando la conexion...");
		}
		System.out.println("Utilizando la conexion ya existente...");
		return instancia;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public static void setInstancia(ConexionBDD instancia) {
		ConexionBDD.instancia = instancia;
	}
	
	
	
}
