package Clases;

public class Triangulo extends Figura{
     private int Base;
     private int Altura;
     
     public Triangulo() {
    	 
     }

	public Triangulo(String nombre, int grosorBorde, char relleno,int base,int altura) {
		super(nombre, grosorBorde, relleno);
		Base=base;
		Altura=altura;
		
		
	}
	public String ToString() {
		return super.ToString()+"\t"+Base+"\t"+Altura;
	}

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}
	
	
     
}
