package Clases;

public class Alumno extends Persona {
 private String Control;
 private char Carrera;
 private int Cal1;
 private int Cal2;
 private int Cal3;
 private int Cal4;
 private double Promedio;
public Alumno() {
	super();
	
}
public Alumno(String Nombre, char Genero,String control,char carrera,int cal1,int cal2,int cal3,int cal4,int promedio) {
	super(Nombre, Genero);
	Control=control;
	Carrera=carrera;
	Cal1=cal1;
	Cal2=cal2;
	Cal3=cal3;
	Cal4=cal4;
	Promedio=promedio;
	
}

public String  ToString() {
	return super.ToString()+"\t"+Control+"\t"+Carrera+"\t"+Cal1+"\t"+Cal2+"\t"+Cal3+"\t"+Cal4+"\t"+Promedio;
}
public String getControl() {
	return Control;
}
public void setControl(String control) {
	Control = control;
}
public char getCarrera() {
	return Carrera;
}
public void setCarrera(char carrera) {
	Carrera = carrera;
}
public int getCal1() {
	return Cal1;
}
public void setCal1(int cal1) {
	Cal1 = cal1;
}
public int getCal2() {
	return Cal2;
}
public void setCal2(int cal2) {
	Cal2 = cal2;
}
public int getCal3() {
	return Cal3;
}
public void setCal3(int cal3) {
	Cal3 = cal3;
}
public int getCal4() {
	return Cal4;
}
public void setCal4(int cal4) {
	Cal4 = cal4;
}
public double getPromedio() {
	return Promedio;
}
public void setPromedio(double promedio) {
	Promedio = promedio;
}
 
 
 
}
