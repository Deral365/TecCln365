package Clases;

public class Figura {
   private String Nombre;
   private int GrosorBorde;
   private char Relleno;
   
   public Figura() {
	   
   }

public Figura(String nombre, int grosorBorde, char relleno) {
	super();
	Nombre = nombre;
	GrosorBorde = grosorBorde;
	Relleno = relleno;
}
  
 public String ToString() {
	 return Nombre +"\t"+GrosorBorde+"\t"+Relleno;
 }

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public int getGrosorBorde() {
	return GrosorBorde;
}

public void setGrosorBorde(int grosorBorde) {
	GrosorBorde = grosorBorde;
}

public char getRelleno() {
	return Relleno;
}

public void setRelleno(char relleno) {
	Relleno = relleno;
}
   

}
