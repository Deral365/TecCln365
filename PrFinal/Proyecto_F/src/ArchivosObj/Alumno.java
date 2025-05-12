package ArchivosObj;
import java.io.Serializable;
public class Alumno extends Persona implements Serializable  {
   private String Materia;
   private int Promedio;
   private String Profesor;
public Alumno() {
	super();
	
}
public Alumno(String Nom, int edad, char Gen,String materia,int promedio,String profesor) {
	super(Nom, edad, Gen);
	Materia=materia;
	Promedio=promedio;
	Profesor=profesor;
	}

public String  ToString() {
	return super.ToString()+"\t"+Materia+"\t"+Promedio+"\t"+Profesor;
}
public String getMateria() {
	return Materia;
}
public void setMateria(String materia) {
	Materia = materia;
}
public int getPromedio() {
	return Promedio;
}
public void setPromedio(int promedio) {
	Promedio = promedio;
}
public String getProfesor() {
	return Profesor;
}
public void setProfesor(String profesor) {
	Profesor = profesor;
}
   
   
   
   
   
   
}
