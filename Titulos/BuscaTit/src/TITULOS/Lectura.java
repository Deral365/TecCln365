package TITULOS;
import java.io.*;
import java.util.*;
/*
 * Lee un archivo de TEXTO separado por comas que se encuentra dentro
 * del proyecto en la carpeta archivo con el nombre TITUSS.cvs
 * Contiene 4 DATOS:  Titulo del LIBRO, AUTOR, PRECIO DE COMPRA y PRECIO DE VENTA.
 */

public class Lectura 
{
    public static void main(String[] args) 
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea = null;
        try 
        {
            //Cargamos el archivo de la ruta relativa
            archivo = new File("archivo\\TITUSS.csv");
            //Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            br = new BufferedReader(fr);

            String[] Titulo = new String[32100];
            String Autor []=new String[32100];
            String [] Tit=null;
          
            int tot = 0;
            //Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) 
            {
            	//Utilizamos el separador para los datos
                Tit = linea.split(";");
                Titulo[tot]=Tit[0];
                Autor[tot]=Tit[1];
                //Presentamos los datos
            	
                System.out.println("TITULO: " + Titulo[tot]);
                System.out.println("\tAUTOR: "+Autor[tot]);
                tot++;
            }
            System.out.println("=================================================");
            System.out.println("TOTAL: "+tot);
            System.out.println("=================================================");
           
            //Capturamos las posibles excepciones
        } 
        catch (Exception e) 
        {
            System.out.println("OCURRIO UN ERROR DE LECTURA");
            e.printStackTrace();
        } 
        
        finally 
        {
            try 
            {
                if (fr != null) 
                {
                    fr.close();
                }
            } 
            catch (Exception e2) 
            {
                e2.printStackTrace();
            }
        }
    }
    
    public static void BuscarTitulo(String Titulo []) {
    	String busca= Leer.dato();
    	
    	for (int i=0;i<Titulo.length;i++){
    		if(busca.equalsIgnoreCase(Titulo[i])) {
    			System.out.println();
    		}
    	}
    }
   
public static void BuscarAutor(String Autor) {
    	
    }
}
