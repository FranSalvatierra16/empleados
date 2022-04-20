package empresa;

public class Vendedor extends Empleado {
	
	private float venta_mensual1;
	
	public Vendedor(int tipo, int legajo,String nombre, String apellido, String direccion, String fecha, float venta_mensual1,float sueldo) {
		super(tipo, legajo, nombre, apellido, direccion, fecha, sueldo);
		this.venta_mensual1=venta_mensual1;
		
		
		// TODO Auto-generated constructor stub
	}

	public float getVenta_mensual() {
		return venta_mensual1;
	}

	public void setVenta_mensual(float venta_mensual) {
		this.venta_mensual1 = venta_mensual;
		
	}

	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
				
	}


	
	

}
