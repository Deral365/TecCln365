package Clases;

public class Cuadrado extends Figura {
	
 private int Lado;
 
 public Cuadrado() {
	 
 }
 
 public Cuadrado(String Nom,char Re,int Lado) {
	 super(Nom,Re);
	 this.Lado=Lado;
 }
 public String ToString() {
	 return super.ToString()+"\t"+Lado;
 }
 public  int CalcularArea() {
	 return Lado*Lado;
 }
 public int CalcularPerimetro() {
	 return Lado*4;
 }
 public  void Dibujar() {
	 
 }

public int getLado() {
	return Lado;
}

public void setLado(int lado) {
	Lado = lado;
}
 
}
