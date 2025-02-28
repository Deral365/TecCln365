package Clases;

public class Producto extends Productos {

	public static void main(String[] args) {
		Productos A [] = new Productos[10];
        Recolectar(A);
        Iimprimir(A);
       
	}
	 public static void Recolectar (Productos A []) {
     A[0]=new Frescos("24/07/2025","352423","","");
     A[1]=new Frescos("24/08/2025","352344","","");
     
     A[2]=new Refrigerados("24/08/2025","352344","","");
     A[3]=new Refrigerados("24/08/2025","352344","","");
     A[4]=new Refrigerados("24/08/2025","352344","","");
	
	 }
	
	
	

}
