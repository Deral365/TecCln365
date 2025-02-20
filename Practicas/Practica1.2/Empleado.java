package Clases;

public class Empleado {
	private String Nombre;
	  private char Genero;
	  int Hora_trabajo=0;
	  int Sueldo_hora=0;
	  
	     public Empleado() {
	    	 
	     }
	  
	     public Empleado(String nombre,char genero,int hora_trabajo,int sueldo_hora) {
	    	 super();
	    	 Nombre= nombre;
	    	 Genero=genero;
	    	 Hora_trabajo=hora_trabajo;
	    	 Sueldo_hora=sueldo_hora;
	    	 
	     }
	 

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public char getGenero() {
			return Genero;
		}

		public void setGenero(char genero) {
			Genero = genero;
		}

		public int getHora_trabajo() {
			return Hora_trabajo;
		}

		public void setHora_trabajo(int hora_trabajo) {
			Hora_trabajo = hora_trabajo;
		}

		public int getSueldo_hora() {
			return Sueldo_hora;
		}

		public void setSueldo_hora(int sueldo_hora) {
			Sueldo_hora = sueldo_hora;
		}
	     
	     
}
