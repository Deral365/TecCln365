package Clases;

public class Profesor extends Persona {
   private String Materia;

public Profesor() {
	super();
	
}

public Profesor(String Nom, int edad, char Gen,String Mat) {
	super(Nom, edad, Gen);
	Materia=Mat;
}

public String getMateria() {
	return Materia;
}

public void setMateria(String materia) {
	Materia = materia;
}
public abstract boolean Asistencia() {
	
}
   
}
