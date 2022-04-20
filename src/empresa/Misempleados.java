package empresa;

import java.util.ArrayList;
import java.util.Arrays;

public class Misempleados {
	Repartidor[] lista_repartidores;
	int vRepartidores;
	Empleado[] lista_empleado;
	int vEmpleados;
	Vendedor[] lista_vendedores;
	int vVendedores;
	Administrador[] lista_administradores; 
	int vAdministradores;
	
	public Misempleados() {
		 lista_repartidores=new Repartidor[8];
	     vRepartidores=0;
		lista_empleado= new Empleado[6];
		vEmpleados=0;
		lista_vendedores= new Vendedor[3];
	     vVendedores=0;
	     lista_administradores=new Administrador[3];
	     vAdministradores=0;
	    
	}
	
	public Administrador agregarAdministrador(int tipo, int legajo, String nombre, String apellido, String direccion, String fecha, String area, float sueldo)
	{
		Administrador nuevoAdmin= new Administrador(tipo, legajo, nombre, apellido, direccion, fecha, area, sueldo);
		int pos=buscarUltimapos();
		lista_empleado[pos]=nuevoAdmin;
		vEmpleados++;
		
		return nuevoAdmin;
	}
	public Vendedor agregarVendedor(int tipo, int legajo, String nombre, String apellido, String direccion, String fecha, float venta_mensual1, float sueldo) {
		
		Vendedor nuevoVendedor= new Vendedor(tipo, legajo, nombre, apellido, direccion, fecha, venta_mensual1, sueldo);
		int pos=buscarUltimapos();
		lista_empleado[pos]=nuevoVendedor;
		vEmpleados++;
		
		
		
		return nuevoVendedor;
		
	}
    public Repartidor agregar_repartidor(int tipo, int legajo, String nombre, String apellido, String direccion, String fecha, int km_recorridos, float sueldo) {
		
		Repartidor nuevoRep= new Repartidor (tipo, legajo, nombre, apellido, direccion, fecha, km_recorridos, sueldo);
		int pos=buscarUltimaposRep();
		lista_repartidores[pos]=nuevoRep;
		vRepartidores++;
		
		
		
		return nuevoRep;
		
	}
	public int buscarUltimapos()
	{
		int i=0;
		while(lista_empleado[i]!=null&&i<=vEmpleados)
		{
			i++;
		}
		return i;
	}
	public int buscarUltimaposRep()
	{
		int i=0;
		while(lista_repartidores[i]!=null&&i<=vRepartidores)
		{
			i++;
		}
		return i;
	}
public void mostrar_lista() {
	
int i=0;
while(lista_empleado[i]!=null) {

System.out.println(lista_empleado[i].toString());
i++;
		
	}
}
public Boolean busporleg(int leg)
{
	Boolean esta=false;
	int i=0;
	
	while(lista_empleado[i]!=null&&esta==false)
	{
		if(lista_empleado[i].getLegajo()!=leg)
		{
			i++;
		}
		else {
			esta=true;
			System.out.println(lista_empleado[i].toString());
		}
	}
	return esta;
}
public int contempleados()
{
	int i=0;
	while(lista_empleado[i]!=null)
	{
		i++;
	}
	return i;
	
}
public void mostrar_listarep()
{
	int i=0;
while(lista_repartidores[i]!=null) {
	
	System.out.println(lista_repartidores[i].toString());
	i++;
	
}
}
public float sueldototal()
{
	int i=0;
	float sueldotot=0;
	while(lista_repartidores[i]!=null) {
		
		sueldotot= sueldotot +lista_repartidores[i].getSueldo();
		i++;
		
	}
	 i=0;
	while(lista_empleado[i]!=null) {

	sueldotot=sueldotot +lista_empleado[i].getSueldo();
	i++;
			
		}
	return sueldotot;
	
}
}

