package Clases;

public abstract class  Figura {
  private String Nombre;
  private char Relleno;
  
  public Figura() {
	  
  }
  public Figura(String Nom,char Re) {
	  Nombre=Nom;
	  this.Relleno=Re;
  }
  public String ToString () {
	  return Nombre+"\t"+Relleno;
  }
  public abstract int CalcularArea();
  public abstract int CalcularPerimetro();
  public abstract void Dibujar();
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public char getRelleno() {
	return Relleno;
}
public void setRelleno(char relleno) {
	Relleno = relleno;
}
  
}
