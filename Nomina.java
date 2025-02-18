package Clases;

public class Nomina {

	public static void main(String[] args) {
		
		String nombre="";
		EM [] A = new EM [10];   
		for(int i=0; i<A.length;i++) {
			A[i].setNombre("*");
		}
		boolean Existe =false;
		do {
			int Opcion=0;
		
			System.out.println();
			System.out.println("==========================");
			System.out.println("Sueldo Empelado");
			System.out.println("-----------------");
			System.out.println("1- Registar empleado");
			System.out.println("2- Imprimir datos");
			System.out.println("3- SALIR");
			System.out.println("==========================");
			System.out.println("3- SELECCIONA UNA OPCION");
			Opcion=Leer.datoInt();
			System.out.println("---------------------------");
			
			switch(Opcion)
			{
			case 1: 
				System.out.println("Nombre del empleado : ");
				nombre= Leer.dato();
				Registrar(A,nombre);
				break;
			case 2:
				System.out.println("Datos recopilados : ");
				break;
				
			case 3:
				System.out.println("Saliendo del sistema : ");
				break;
		
			
				default:
					System.out.println("ERROR,OPCION FUERA DE RANGO");
					break;
			}
			if(Opcion==3)break; 
				
			}while(true);
		}
	public static void Registrar(EM[] empleado, String nombre) {
		char genero;
		int hora_trabajo=0;
		int sueldo_hora=0;
		boolean Hecho=false;
		do {
			
			for(int k=0;k<empleado.length;k++) {
				if(empleado[k].getNombre) {}
				 System.out.println("Genero del empleado :"+ (k+1)+":");
				 genero=Leer.dato();
				 System.out.println("Horas del empleado :"+ (k+1)+":");
				 hora_trabajo=Leer.dato();
				 System.out.println("Pago por hora :"+ (k+1)+":");
				 sueldo_hora=Leer.dato();
				 empleado[k]=new Empleado(nombre,genero,hora_trabajo,sueldo_hora);
				 Hecho=true;
				 break;
			}					
		if (Hecho==true) { 
			break;
	}while(true);
	

}
}
}
