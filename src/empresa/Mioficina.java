package empresa;
import java.util.Scanner;

public class Mioficina {
static Scanner kb;

	
	public static void main(String[] args) {
	kb=new Scanner(System.in);
	Misempleados oficina= new Misempleados();
	Boolean continuar=true;
	int tipo_empleado;
	Repartidor rep1=null;
	Administrador admin1=null;
	Vendedor vend1=null;
	
	while(continuar==true)
	{
		tipo_empleado=0;
System.out.println("1.Agregar vendedor 2.Agregar administrador 3.Agregar repartidor 4.Salir");
tipo_empleado=kb.nextInt();

switch (tipo_empleado) {

case 1: 
admin1= oficina.agregarAdministrador(tipo_empleado, 1,"Francisco", "Salvatierra", "Chubut 342", "16/10/2001","Marketing", 15);

break;
case 2:
	vend1= oficina.agregarVendedor(tipo_empleado, 2, "Juan", "Gimenez", "Chubut 67", "12/02/2000", 1982, (float) (1982*0.3) );
	
	break;
case 3:
  rep1= oficina.agregar_repartidor(tipo_empleado, 7, "Valentin", "Radovich", "Chubut 1542", "27/07/2001", 34, 34*3);
 

  break;

case 4:
	continuar=false;
	

	break;

default:
	System.out.println("Opcion invalida");
	break;
}
	}
	Boolean seguir=true;
	while(seguir==true)
	{
		System.out.println("1. Mostrar empleados de la empresa ");
		System.out.println("2. Mostrar Repartidores ");
		System.out.println("3. Cantidad de empleados ");
		System.out.println("4. Buscar empleado por legajo ");
		System.out.println("5. Sueldo total ");
		
		int key=kb.nextInt();
		switch (key) {
		
		case 1:
	
	oficina.mostrar_lista();
	break;
	
		case 2:
	oficina.mostrar_listarep();
	break;
		case 3:
	int cant= oficina.contempleados();
	System.out.println("Cant empleados "+cant);
	break;
		case 4:
	kb.nextLine();
int leg=kb.nextInt();
System.out.println("leg  " +leg);
 Boolean esta=false;
 esta=oficina.busporleg(leg);
 if(true==esta)
 {
	 System.out.println("Legajo encontrado");
 }else
 {
	 System.out.println("Legajo no encontrado");
 }
 break;
		
		case 5:
		float total=0; 
		total=oficina.sueldototal();
		System.out.println("Sueldo total: "+total);
		case 6:
			seguir=false;
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		
	}


	
	}
}
}


