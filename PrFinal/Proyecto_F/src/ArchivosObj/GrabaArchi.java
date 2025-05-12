package ArchivosObj;
import java.io.*;
public class GrabaArchi 
{
	public static void main(String[] args) 
	{
	 	String nombreArchivo = null;     // nombre del fichero
	    File Archivo = null; // objeto que identifica el fichero
	    try
	    {
	      // Crear un objeto File que identifique al fichero
	      System.out.print("Nombre del ARCHIVO de datos a escribir: ");
	      nombreArchivo = Leer.dato();
	      Archivo = new File(nombreArchivo);
	      // Verificar si el fichero existe
	      char resp = 's';
	      if (Archivo.exists())
	      {
	        System.out.print("El ARCHIVO ya existe, desea sobreescribirlo? (s/n) ");
	        resp = Leer.caracter();
	        Leer.limpiar();
	      } 
	      if (resp == 's')
	      {
	        CreaArchivo(Archivo);
	      } 
	    }
	    catch(IOException e)
	    {
	      System.out.println("Error: " + e.getMessage());
	    }
	}
	public static void CreaArchivo(File Archivo) throws IOException
	{
		 ObjectOutputStream oos = null;// salida de datos hacia el ARCHIVO
		    char resp;
		    try
		    {
		      // Crear un flujo hacia el ARCHIVO que permita escribir
		      // objetos y datos de tipos primitivos.
		      oos = new ObjectOutputStream(new FileOutputStream(Archivo));
		      // Declarar los datos a escribir en el ARCHIVO
		      String nombre,materia,profesor;
		      char G;
		      int edad, promedio;
		      // Leer datos de la entrada est�ndar y escribirlos
		      // en el ARCHIVO
		      do 
		      {
		    	System.out.print("Nombre: "); nombre=Leer.dato();
		    	System.out.print("Edad: "); edad=Leer.datoInt();
		    	
		    	System.out.print("Genero(M/F): "); G=Leer.caracter();
		    	
		    	System.out.print("Promedio: "); promedio=Leer.datoInt();
		        do
		        {
		        	System.out.print("Nombre de tu materia (Quimica, Programacion,Algebra): ");
		        	materia=Leer.dato();
		        
		        }while(materia=="quimica"  || materia=="pogramacion" || materia=="algebra" || materia=="Quimica"  || materia=="Pogramacion" || materia=="Algebra"  );
		        
		        do
		        {
		        	System.out.print("Profesor (Esteban, Jesus, Beatriz, Maria): ");
		             profesor=Leer.dato();
		        
		        }while(profesor=="jesus" || profesor=="esteban" || profesor=="maria" || profesor=="beatriz");
		     // Crear un objeto Profesor y almacenarlo en el ARCHIVO
		        oos.writeObject(new Alumno(nombre, edad, G, materia, promedio, profesor));
		        System.out.print("Desea escribir otro registro? (s/n) ");
		        resp = Leer.caracter();
		        Leer.limpiar();
		      }while (resp == 's' || resp=='S');
		    }
		    finally
		    {
		      // Cerrar el flujo
		      if (oos != null) oos.close();
		    }
	}

}
