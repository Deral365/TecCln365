package Clases;

public class MisFiguras {

	public static void main(String[] args) {
		Cuadrado Cua=new Cuadrado();
		Cua=new Cuadrado("Cuadrado",'C',5);
		Cua.Dibujar();
        
		Triangulo Tri=new Triangulo();
		Tri=new Triangulo("Triangulo",'T',4,5);
		Tri.Dibujar();
	}

}
