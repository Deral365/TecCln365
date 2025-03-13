package Clases;

public class Escuela {

	public static void main(String[] args) {
		int N= Leer.datoInt();
		
		Alumno A []=new  Alumno[N];
		Capturar(A);
		Carrera(A);
	}
	public static void Capturar(Alumno[] A) {
		

	    String[] Control = {"123453","947483","093892","023872","902823","0480383","9721931"};
	    String[] Nombre = {"Angel","Adrian","Hommey","Erik","Jose","Pedro","Leo","Jesus"};
	    char[] Genero = {'H','M'};
	    char[] Carrera = {'S','T'};
		for(int i=0;i<A.length;i++) {
			String nom=Nombre[(int)(Math.random()*8)];
			char gen =Genero[(int)(Math.random()*2)];
			String con=Control[(int)(Math.random()*7)];
			char car=Carrera[(int)(Math.random()*2)];
			int ca1=(int)(Math.random()*41)+60;
			int ca2=(int)(Math.random()*41)+60;
			int ca3=(int)(Math.random()*41)+60;
			int ca4=(int)(Math.random()*41)+60;
			int pro=0;
			A[i]=new Alumno(nom,gen,con,car,ca1,ca2,ca3,ca4,pro);
		}
	}
		public static void Carrera(Alumno[] A) {
			System.out.println("Ingresa que carrera deseas imprimir: S/T");
			char c=Leer.datocar();
			if(c=='S') {
				for(int i=0;i<A.length;i++) {
					if(A[i].getCarrera()=='S') {
						System.out.println(A[i].ToString());
					}
				}
			}else if(c=='T') {
				for(int i=0;i<A.length;i++) {
					if(A[i].getCarrera()=='T') {
						System.out.println(A[i].ToString());
					}
				}
				
			}
		}
}
