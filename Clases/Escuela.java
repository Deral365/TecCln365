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
		 Profesor Pro []= new Profesor[2];
		 Estudiante Est []= new Estudiante[cupos];
		GuardarE(Est);
		GuardarP(Pro);
		Imprimir(Aul,Pro,Est);
	}
	}
	
	
	public static void GuardarE(Estudiante [] Est) {
		String [] NombreH= {"Edgar","Angel","Hommey","Yair","Adrian","Leo","Ximena","Maria","Gema","Alexia","Gloria"};
		
		char Genero []= {'M','H'};
		int edad []= {18,20,19,23,24,30,25,22};
	}
public static void GuardarP(Profesor [] Pro) {
	String [] NombreH= {"Esteban","Jesus","Camacho","Fernando","Clemente","Jerson","Beatriz","Irma","Gema","Marisol","Luz","Mercedes"};
	
	char Genero []= {'M','H'};
	int edad []= {42,50,52,38,41,45,60,58,55,39};
	
		
	}
public static void Imprimir(Aulas [] Aul,Profesor [] Pro,Estudiante [] Est) {
	
	
	
}

}
