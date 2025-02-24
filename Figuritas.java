package Clases;

public class Figuritas {

	public static void main(String[] args) {
	   Cuadrado Cua= new Cuadrado();
	   Cua= new Cuadrado("CUADRADO",5,'C',8);
	   System.out.println("NOMBRE\tBORDE\tRELLENO\tLADO");
       System.out.println(Cua.ToString());
       
       Triangulo Tri= new Triangulo();
	   Tri= new Triangulo("TRIANGULO",5,'T',8,9);
	   System.out.println("NOMBRE\tBORDE\tRELLENO\tLADO");
       System.out.println(Tri.ToString());
       
	}

}
