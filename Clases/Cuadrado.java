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
	 char Re=super.getRelleno();
	 for(int i=1;i<=Lado;i++) {
		 for(int j=1;j<=Lado;j++) {
			 System.out.print(Re+" ");
		 }
		 System.out.println();
	 
	 }
 }

public int getLado() {
	return Lado;
}

public void setLado(int lado) {
	Lado = lado;
}
 
}
