package Clases;

public class Vaca extends Rancho {
  private int Tipo;
  private int Variante;
  private int Litros;
public Vaca() {
	
	
}
public Vaca(String Nom, int tipo,int variante,int litros) {
	super(Nom);
	Tipo=tipo;
	Variante=variante;
	Litros=litros;
}
public int getTipo() {
	return Tipo;
}
public void setTipo(int tipo) {
	Tipo = tipo;
}
public int getVariante() {
	return Variante;
}
public void setVariante(int variante) {
	Variante = variante;
}
public int getLitros() {
	return Litros;
}
public void setLitros(int litros) {
	Litros = litros;
}
  
 
}
