package Clases;

public class Escuela {

	public static void main(String[] args) {
	   Aulas Aul [] = new Aulas[3];
	   Aul[0]=new Aulas(1,1,12);
	   Aul[1]=new Aulas(2,2,15);
	   Aul[2]=new Aulas(3,3,18);
	  
	int A,cupos;
	do {
		System.out.println("NUMERO DE AULA PARA LA CLASE  (1,2,3)");
		A=Leer.datoInt();
	}while(A<1 || A>3); {
		cupos=Aul[A-1].getCupo();
		
		GuardarE(Aul);
		GuardarP(Aul);
		Imprimir(Aul);
	}
	}
	
	
	public static void GuardarE(Aulas [] Aul) {
		
	
		
	}
public static void GuardarP(Aulas [] Aul) {
		
	
		
	}
public static void Imprimir(Aulas [] Aul) {
	
	
	
}

}
