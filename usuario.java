public class Usuario{
	
	// ATRIBUTOS
	private String nombre;
	private String cedula;
	private String password;
	private int edad;
	private int cantidadDeHijos;
	private int saldo;

	// CONSTRUCTORES
	//Sin parámetros
	public Usuario(){
		this.nombre = 'A definir';
		this.cedula = 'A definir';
		this.password = '123Cuatro';
		this.edad = NULL;
		this.cantidadDeHijos = NULL;
		this.saldo = 0;
	}

	//Con parámetros
	public Usuario(String unNombre, String unaCedula, String unPassword, int unaEdad, int unaCantidadDeHijos, int unSaldo) {
		this.nombre = unNombre;
		this.cedula = unaCedula;
		this.password = unPassword;
		this.edad = unaEdad;
		this.cantidadDeHijos = unaCantidadDeHijos;
		this.saldo = unSaldo;
	}

	
	// Métodos set's y get's
	public void setNombre(String unNombre){
		nombre = unNombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setCedula(String unaCedula){
		cedula = unaCedula;
	}

	public String getCedula(){
		return cedula;
	}

	public void setPassword(String unPassword){
		password = unPassword;
	}

	public String getPassword(){
		return password;
	}

	public void setEdad(int unaEdad){
		edad = unaEdad;
	}

	public int getEdad(){
		return edad;
	}
	
	public void setCantidadDeHijos(int unaCantidadDeHijos){
		cantidadDeHijos = unaCantidadDeHijos;
	}

	public int getCantidadDeHijos(){
		return cantidadDeHijos;
	}

	public void setSaldo(int unSaldo){
		saldo = unSaldo;
	}

	public int getSaldo(){
		return saldo;
	}

	@Override
	public boolean equals(Object obj){
		return (((Usuario)obj).getCedula() == this.getCedula());
	}
}
