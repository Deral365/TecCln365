package Clases;

public class Perro extends Animal {

	private String Nombre;
	
	public Perro() {
		System.out.println("SE CREO UN OBJETO PERRO");
		
	}
	
	public Perro(String Nom) {
		super("Perro");
		Nombre=Nom;
	}
	
}
