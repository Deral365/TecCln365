package Clases;

public class Triangulo extends Figura {
 private int Base;
 private int Altura;
 public Triangulo() {
	 
 }
 
 public Triangulo(String Nom,char Re, int base,int altura) {
	 super(Nom,Re);
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
