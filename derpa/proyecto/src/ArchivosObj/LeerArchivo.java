package ArchivosObj;
import java.io.*;
public class LeerArchivo 
{
	public static void mostrarFichero(String nombreFichero, Alumno [] VP)  throws IOException
  {
    PrintStream flujoS = System.out; // salida est�ndar
    ObjectInputStream ois = null;// entrada de datos desde el fichero
    File Archivo = null;       // objeto que identifica el fichero
    int C=0;
    try
    {
      // Crear un objeto File que identifique al fichero
      Archivo = new File(nombreFichero);
      
      // Verificar si el fichero existe
      if (Archivo.exists())
      {
        // Si existe, abrir un flujo desde el mismo (Output Input Stream)
        ois = new ObjectInputStream(new FileInputStream(Archivo));
        
        // Declarar los datos a leer desde el fichero
        	Alumno Alum;
        	String Nom;
        	char Gen;
        	int edad, sueldo, tipo, espe;
       
        do
        {
          // Leer un objeto CPersona desde el fichero. Cuando se
          // alcance el final del fichero Java lanzar� una
          // excepci�n del tipo EOFException.
          Alum = (Alumno)ois.readObject();
          VP[C]=Alum;
          C++;
          String TIPO=null, ESPEC=null;
          Nom = Alum.getNombre();
          edad=Alum.getEdad();
          Gen=Alum.getGenero();
          sueldo=Profe.getSueldo();
          tipo=Profe.getTipo(); 
          if(tipo==1) {	TIPO="COMPLETO"; }
          if(tipo==2) {	TIPO="MEDIO "; }
          if(tipo==3) {	TIPO="PARCIAL"; }
          espe=Profe.getEspecialidad();
          if(espe==1) {	ESPEC="LICENCIATURA"; }
          if(espe==2) {	ESPEC="MAESTRIA"; }
          if(espe==3) {	ESPEC="DOCTORADO"; }
          
          
          // Mostrar los datos nombre, direcci�n y tel�fono
          System.out.println(nombre+"\t"+edad+"\t"+sexo+"\t"+sueldo+"\t"+TIPO+"\t"+ESPEC);
          
          flujoS.println();
        }while(true);
      }
      else
        flujoS.println("El fichero no existe");
    }
    catch(EOFException e)
    {
      flujoS.println("Fin del Archivo");
      ImprimeTcDoc(VP,C);
    }
    catch(ClassNotFoundException e)
    {
      flujoS.println("Error: " + e.getMessage());
    }
    finally
    {
      // Cerrar el flujo
      if (ois != null) ois.close();
    }
  }
  public static void ImprimeTcDoc(Profesor [] VP,int C)
  {
	  System.out.println();
	  System.out.println("LISTADO DE PERSONAL");
	  for(int z=0;z<C;z++)
	  {
		  VP[z].quienSoy();
	  }
  }
  public static void main(String[] args)
  {
    PrintStream flujoS = System.out; // salida est�ndar
    String nombreFichero = null;     // nombre del fichero
    File fichero = null; // objeto que identifica el fichero  	 	
    	
      try
      {
    	  // Enviar a una variable String el nombre del fichero
    	  flujoS.print("Nombre del fichero de datos a leer: ");
    	  nombreFichero = Leer.dato();
      		Profesor [] VP=new Profesor[20];
      		mostrarFichero(nombreFichero, VP);
      }
      catch(IOException e)
      {
        System.out.println("Error: " + e.getMessage());
      }
    
  }
}
