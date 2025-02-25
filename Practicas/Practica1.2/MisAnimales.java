package Clases;

public class MisAnimales {

	public static void main(String[] args) {
		Perro Perrito =new Perro();
		Perrito= new Perro("FIRULAIS");
		System.out.println(Perrito.ToString());
		System.out.println(Perrito.Sonido());
		System.out.println("---------------------------------");
		Gato Gatito=new Gato("GARFIELD");
		System.out.println(Gatito.ToString());
		System.out.println(Gatito.Sonido());

	}

}
