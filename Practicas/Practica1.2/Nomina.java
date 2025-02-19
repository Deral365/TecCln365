package Clases;

public class Nomina {

	public static void main(String[] args) {
		
		String nombre="";
		Empleado [] A = new Empleado [1];   
		
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
				Calcular(A);
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
	public static void Registrar(Empleado[] A,String nombre) {
		char genero;
		int hora_trabajo=0;
		int sueldo_hora=0;
		boolean Hecho=false;
		do {
			
			for(int k=0;k<A.length;k++) {
				
				 System.out.println("Genero del empleado :"+ (k+1)+":");
				 genero=Leer.datocar();
				 System.out.println("Horas del empleado :"+ (k+1)+":");
				 hora_trabajo=Leer.datoInt();
				 System.out.println("Pago por hora :"+ (k+1)+":");
				 sueldo_hora=Leer.datoInt();
				 A[k]=new Empleado(nombre,genero,hora_trabajo,sueldo_hora);
				 
				 Hecho=true;
				 break;
			}					
		if (Hecho==true) { 
			System.out.println("Haz registrado con exito a tu empleado");
			break;}
	}while(true);
	}
	
	
		public static void Calcular(Empleado[] A) {
			int Calculo=0;
			int Hora_extra;
			int aux=0;
			boolean Hecho=false;
			do {
				
				for(int i=0;i<A.length;i++) {
					 if(A[i].Hora_trabajo>40 ) {
						 Hora_extra=A[i].Hora_trabajo-40;
						aux=Hora_extra*2;		 
						Calculo=(A[i].Hora_trabajo*A[i].Sueldo_hora)+(aux*A[i].Sueldo_hora);
						System.out.println(A[i].getNombre()+ Calculo);
						if(i>=10) {
						Hecho=true;
						 break;
						}
					 }else {
						 
						 Calculo=(A[i].Hora_trabajo*A[i].Sueldo_hora);	
						 System.out.println(A[i].getNombre()+ Calculo);
						 if(i>=10) {
								Hecho=true;
								 break;
								}
					 }
			
					 
					 
				}					
			if (Hecho==true) { 
				System.out.println("Esta es la lista");
				break;}
		}while(true);

}
}

