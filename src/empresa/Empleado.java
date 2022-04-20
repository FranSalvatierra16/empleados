package empresa;

public class Empleado {
	
	private int legajo;
	private String nombre;
	private String apellido;
	private String direccion;
	private String fecha;
private float sueldo;
	
	private int tipo;
	
	public Empleado(int tipo, int legajo, String nombre, String apellido, String direccion, String fecha, float sueldo)
	{   this.tipo=tipo;
		this.legajo=legajo;
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.fecha=fecha;
		this.sueldo=sueldo;
		
		
		
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("tipo de vendedor" +getTipo()+
		"Legajo:" + getLegajo()+
		"Nombre:" + getNombre()+
		"Apellido:" + getApellido()+
		"Direccion:" + getDireccion()+
		"Fecha de nacimiento" +getDireccion()+
		"sueldo: "+getSueldo());
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}



}
