package Clases;

public class Estudiante extends Persona {
   private double Calificacion;

public Estudiante() {
	super();
	
}

public Estudiante(String Nom, int edad, char Gen,double Cal) {
	super(Nom, edad, Gen);
	Calificacion=Cal;
}

public double getCalificacion() {
	return Calificacion;
}

public void setCalificacion(double calificacion) {
	Calificacion = calificacion;
}
public abstract boolean Asistencia() {
	int As=(int)(Math.random()*2)];
	if(As==0) {
		return false;
	}else {
		return true;
	}
	
}
   

}
