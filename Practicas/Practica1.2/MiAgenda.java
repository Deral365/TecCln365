package Clases;

public class MiAgenda {

	public static void main(String[] args) {
		
		String nombre="";
		CONTACTO [] A = new CONTACTO [10];
		for(int i=0; i<A.length;i++) {
			A[i].setNombre("*");
		}
		int Opcion=0;
		String K="";
		boolean Existe =false;
		do {
			System.out.println();
			System.out.println("==========================");
			System.out.println("AGENDA TELEFONICA");
			System.out.println("-----------------");
			System.out.println("1- REGISTRAR");
			System.out.println("2- ELIMINAR");
			System.out.println("3- LISTAR");
			System.out.println("4- CONSULTAR");
			System.out.println("5- ESPACIOS LIBRES");
			System.out.println("6- SALIR");
			System.out.println("==========================");
			System.out.println("6- SELECCIONA UNA OPCION");
			Opcion=Leer.datoInt();
			System.out.println("---------------------------");
			
			switch(Opcion)
			{
			case 1: 
				System.out.println("Nombre del contacto : ");
				nombre= Leer.dato();
				Registrar(A,nombre);
				break;
			case 2:
				EliminarContacto(A);
				break;
				
			case 3:
				ListaContactos(A);
				break;
			case 4:
				consultaContacto(A);
				break;
			case 5:
				HuecosLibres(A);
				break;
			case 6:
				System.out.println("SALIENDO DE LA AGENDA ................................");
				break;
				default:
					System.out.println("ERROR,OPCION FUERA DE RANGO");
					break;
			}
			if(Opcion==6)break; 
				
			}while(true);
		}
		
		public static void Registrar(CONTACTO[] agenda, String Nombre) {
			String Nombre="";
			boolean contacto_invalido=false;
			boolean Hecho=false;
			do {
				if(AgendaLlena(agenda)) 
					break;
				if(contacto_invalido=true) {
					System.out.println("Contacto ya registrado");
					Hecho=true;
					break;
					
				}
				for(int k=0;k<agenda.length;k++) {
					if(agenda[k].getNombre)
				}
					
			}while(true);
		
		public static void ALTA(Agenda [] A,String Nom) {
			System.out.println
		}

	}

}
