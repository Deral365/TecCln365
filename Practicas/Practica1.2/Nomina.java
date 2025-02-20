package Clases;

public class Nomina {

	public static void main(String[] args) {
		
		String nombre="";
		Empleado [] A = new Empleado [4];   
		int prm=0;
		int prh=0;
		int conm=0;
		int conh=0;
		
		
			
				
				Registrar(A,prm,prh,conm,conh);
		
	}
			
		
	public static void Registrar(Empleado[] A,int prm,int prh,int conm,int conh) {
		
	    String nombre;
		char genero;
		int hora_trabajo=0;
		int sueldo_hora=0;
		boolean Hecho=false;
		
			
			for(int k=0;k<A.length;k++) {
				 System.out.println("Nombre del empleado : ");
				 nombre= Leer.dato();
				 System.out.println("Genero del empleado :"+ (k+1)+":");
				 genero=Leer.datocar();
				 System.out.println("Horas del empleado :"+ (k+1)+":");
				 hora_trabajo=Leer.datoInt();
				 System.out.println("Pago por hora :"+ (k+1)+":");
				 sueldo_hora=Leer.datoInt();
				 A[k]=new Empleado(nombre,genero,hora_trabajo,sueldo_hora);
				 
				
				 
			}					
		
			System.out.println("Datos recopilados : ");
			Calcular(A,prm,prh,conm,conh);
	}
	
		
	
	
		public static void Calcular(Empleado[] A,int prm,int prh,int conm,int conh) {
			
			int Calculo=0;
			int Hora_extra;
			int aux=0;
			boolean Hecho=false;
			
				
				for(int k=0;k<A.length;k++) {
					
					 if(A[k].Hora_trabajo>40 ) {
						 Hora_extra=A[k].Hora_trabajo-40;
						aux=Hora_extra*2;		 
						Calculo=(A[k].Hora_trabajo*A[k].Sueldo_hora)+(aux*A[k].Sueldo_hora);
						System.out.println(A[k].getNombre()+"    "+ Calculo);
						if(A[k].getGenero()=='M' || A[k].getGenero()=='m') {
							conm=conm+1;
						prm=prm+Calculo;
						}else {
							conh=conh+1;
							prh=prh+Calculo;
						}
						if(k>=4) {
						Hecho=true;
						 break;
						}
					 }else {
						 
						 Calculo=(A[k].Hora_trabajo*A[k].Sueldo_hora);	
						 if(A[k].getGenero()=='M' || A[k].getGenero()=='m') {	
							    conm=conm+1;
								prm=prm+Calculo;
								}else {
									conh=conh+1;
									prh=prh+Calculo;
								}
						 System.out.println(A[k].getNombre()+"    "+ Calculo);
						 
						 if(k>=4) {
								Hecho=true;
								 break;
								}
					 }
			
					 
					 
				}
				
				System.out.println("Promedio de mujeres y hombres :  ");
				Promedio(A,prm,prh,conm,conh);
}
		
		public static void Promedio(Empleado[] A,int prm,int prh,int conm,int conh) {
			
			int promedio_m=0;
			int promedio_h=0;
			boolean Hecho=false;
			  promedio_m=prm/conm;
			  promedio_h=prh/conh;
			  System.out.println("Promedio de mujeres  : "+promedio_m );
			  System.out.println("Promedio de hombres :  "+promedio_h);
			
					 
					 
				}
				
				
}


