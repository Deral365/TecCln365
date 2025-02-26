package Clases;

public class Congelados extends Productos {
   String Temp;

public Congelados() {
	
	
}

public Congelados(String Caducidad, String Lote, String Envasado, String Pais) {
	super(Caducidad, Lote, Envasado, Pais);
	
}

public String getTemp() {
	return Temp;
}

public void setTemp(String temp) {
	Temp = temp;
}


   
   
}
