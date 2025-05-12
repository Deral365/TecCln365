package ArchivosObj;
import java.io.Serializable;
public abstract  class Persona implements Serializable
{	
	     private String Nombre;
	     private int Edad;
	     private char Genero;
	     
	     public Persona() {
	    	 
	     }
	     public Persona(String Nom,int edad,char Gen) {
	   	  this.Nombre=Nom;
	   	  this.Edad=edad;
	   	  this.Genero=Gen;
	     }     
	     public String  ToString() {                                         
		return   Nombre+"\t"+Edad+"\t"+Genero;
			                                                             
		}
		public String getNombre() {
			return Nombre;
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
		public char getGenero() {
			return Genero;
		}
		public void setGenero(char genero) {
			Genero = genero;
		}
		

}