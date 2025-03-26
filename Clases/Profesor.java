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
public boolean Asistencia() {
	    boolean as=false;
		int Ar=(int)(Math.random()*5);
		if(Ar>1) {
			return as= true;
		}else {
			return as;
		}
}
   
}
