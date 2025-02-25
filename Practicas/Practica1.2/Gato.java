package Clases;

public class Gato extends Animal {
    private String Nombre;
    public Gato() {
    	System.out.println("SE CREO UN OBJETO GATO");
    }
    public Gato(String Nom)
    {
    	super("GATO");
    	Nombre=Nom;
    }
    public String ToString() {
    	return super.ToString()+"Y ME LLAMO "+Nombre;
    	
    }
    public String Sonido()
    {
    	return "MIAU MIAU";
    }
    
}
