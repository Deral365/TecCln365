package Clases;

public class Agenda {
	 private String Telefono;
	  private String Nombre;
	  
	     public Agenda() {
	    	 
	     }
	  
	     public Agenda(String nombre,String telefono) {
	    	 super();
	    	 Nombre= nombre;
	    	 Telefono=telefono;
	    	 
	     }
	     public String ToString(){
	    	 return Nombre-"\t"+Telefono;
	     }
	     
	     
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getTelefono() {
			return Telefono;
		}

		public void setTelefono(String telefono) {
			Telefono = telefono;
		}
		
}
