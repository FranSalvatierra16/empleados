package empresa;

public class Administrador extends Empleado{
	private String area;
	

	public Administrador(int tipo, int legajo,  String nombre, String apellido, String direccion, String fecha, String area, float sueldo) {
		super(tipo, legajo, nombre, apellido, direccion, fecha, sueldo);
		this.area=area;
		
		
		// TODO Auto-generated constructor stub
	}
	
	


public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}





@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"Area:"+getArea();
}

}
