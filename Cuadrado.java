package Clases;

public class Cuadrado extends Figura {
      private int Lado;
      public Cuadrado() {
    	  
      }
	public Cuadrado(String nombre, int grosorBorde, char relleno, int lado) {
		super(nombre, grosorBorde, relleno);
		this.Lado=lado;
	}
	public int getLado() {
		return Lado;
	}
	public void setLado(int lado) {
		Lado = lado;
	}
      
	 public String ToString() {
		 return super.ToString()+"\t"+Lado;
		 
	 }
}
