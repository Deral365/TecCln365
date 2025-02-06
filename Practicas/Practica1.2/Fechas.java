package Clases;

public class Fechas {

	public static void main(String[] args) {
		
		int A=Leer.datoInt();
		Fecha fecha = new Fecha(D,M,A);
  
		if(fecha.fechaCorrecta()) {
			System.out.println("La Fecha: " + fecha +" ES CORRECTA" );
		}else {
			System.out.println("La Fecha: " + fecha +" ES INCORRECTA" );
		}
}
}
