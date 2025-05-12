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
        	Alumno Alu;
        	String Nom;
        	char Gen;
        	int edad, promedio;
        	String profesor,materia;
       
        do
        {
          // Leer un objeto CPersona desde el fichero. Cuando se
          // alcance el final del fichero Java lanzar� una
          // excepci�n del tipo EOFException.
          Alu = (Alumno)ois.readObject();
          VP[C]=Alu;
          C++;
          
          
          Nom = Alu.getNombre();
          edad=Alu.getEdad();
          Gen=Alu.getGenero();
          materia=Alu.getMateria();
          promedio=Alu.getPromedio(); 
          profesor=Alu.getProfesor();
        
      
          // Mostrar los datos nombre, direcci�n y tel�fono
          System.out.println(Nom+"\t"+edad+"\t"+Gen+"\t"+materia+"\t"+profesor);
          
        	  
             
              
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
      CargaronMateria(VP,C);
		Alumnoaprobado(VP,C);
		TotalGenero(VP,C);
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
  public static void ImprimeTcDoc(Alumno [] VP,int C)
  {
	  System.out.println();
	  System.out.println("LISTADO DE PERSONAL");
	  for(int z=0;z<C;z++)
	  {
		  VP[z].ToString();
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
      		Alumno [] VP=new Alumno[20];
      		mostrarFichero(nombreFichero, VP);
      		
      }
      catch(IOException e)
      {
        System.out.println("Error: " + e.getMessage());
      }
      
    
    
  }
  public static void CargaronMateria(Alumno[] VP, int C) {
	  System.out.println("¿Que materia deseas imprimir (Quimica, Programacion, Algebra)");
	  String Mat="";
	  Mat=Leer.dato();
	  
	  int conM=0,aux=0;
	  
	  for(int i=0;i<C;i++) {
		
		if(VP[i].getMateria()==Mat) {
			
			System.out.println(VP[i].getNombre()+"\t"+VP[i].getMateria()+"\t"+VP[i].getPromedio());
			if(VP[i].getPromedio()>conM) {
				conM=VP[i].getPromedio();
				aux=i;
			}
		}
		
	  }
	  System.out.println("El alumno con mejor promedio es: "+ VP[aux].getNombre());
	  }
  
  public static void Alumnoaprobado(Alumno[] VP,int C) {
	  System.out.println("Alumnos que aprobaron su materia: "); 
	  for(int i=0;i<C;i++) {
		if(VP[i].getPromedio()>=70) {
		  System.out.println(VP[i].getNombre()+"\t"+VP[i].getPromedio());
		}
	  }
	  System.out.println("Alumnos que reprobaron su materia: "); 
	  for(int i=0;i<C;i++) {
		if(VP[i].getPromedio()<70) {
		  System.out.println(VP[i].getNombre()+"\t"+VP[i].getPromedio());
		}
	  }
	  }
  public static void TotalGenero(Alumno[]VP, int C) {
	  int conm=0,conh=0;
	  for(int i =0;i<C;i++) {
		  if(VP[i].getGenero()=='M') {
			conh++;  
		  }else {
			  conm++;
		  }
	  }
	  System.out.println("Total de mujeres: " +conm);
	  System.out.println("Total de hombres: " +conh);
  }
  
}
