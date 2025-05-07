package ArchivosObj;

	public abstract class  Persona {
	     private String Nombre;
	     private int Edad;
	     private int Genero;
	     
	     public Persona() {
	    	 
	     }
	     public Persona(String Nom,int edad,char Gen) {
	   	  Nombre=Nom;
	   	  this.Edad=edad;
	   	  this.Genero=Gen;
	     }     
	     public String  ToString() {                                         
		return   Nombre+"\t"+Edad+"\t"+Genero;
			                                                             
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public int getEdad() {
			return Edad;
		}
		public void setEdad(int edad) {
			Edad = edad;
		}
		public int getGenero() {
			return Genero;
		}
		public void setGenero(int genero) {
			Genero = genero;
		}

}