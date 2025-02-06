package Clases;

public class Fecha {

		
		 
	
	private int Dia;
	private int Mes;
	private int Anio;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia,int mes,int anio) {
		super();
		Dia=dia;
		Mes=mes;
		Anio=anio;
	}
	public boolean fechaCorrecta() {
		boolean  Bien=true;
		return Bien;
	}
	
	
	public int getDia() {
		return Dia;
	}

	public int getMes() {
		return Mes;
	}

	public int getAnio() {
		return Anio;
	
		
	
}
	
}