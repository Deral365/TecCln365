package Clases;

public class Persona {
 private String Nombre;
 private char Genero;
 
 public Persona() {
	 
 }

 public Persona(String Nombre,char Genero ) {
	 this.Nombre=Nombre;
	  this.Genero=Genero;
	
 }
 public String ToString() {
	 return Nombre+"\t"+Genero;
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
 
}
