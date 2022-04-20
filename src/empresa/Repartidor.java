package empresa;

public class Repartidor {
	private int tipo;
	private int legajo;
	private String nombre;
	private String apellido;
	private String direccion;
	private String fecha;
	private  float sueldo;
    private int km_recorridos;
    
	public Repartidor(int tipo, int legajo, String nombre, String apellido, String direccion, String fecha,
			int km_recorridos,float sueldo) {
		this.tipo=tipo;
		this.legajo=legajo;
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.fecha=fecha;
		this.km_recorridos=km_recorridos;
		this.sueldo=sueldo;
		
		
 
		// TODO Auto-generated constructor stub
	}
	public int getLegajo() {
		return legajo;
	}
	public int getSueldo() {
		return 3*km_recorridos;
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
	
	
	public int getKm_recorridos() {
		return km_recorridos;
	}
	public void setKm_recorridos(int km_recorridos) {
		this.km_recorridos = km_recorridos;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return ("tipo de vendedor" +getTipo()+
				"Legajo:" + getLegajo()+
				"Nombre:" + getNombre()+
				"Apellido:" + getApellido()+
				"Direccion:" + getDireccion()+
				"Fecha de nacimiento" +getFecha()+
				"sueldo: "+sueldo+
		        "km recorridos "+getKm_recorridos());
		        
	}
}
