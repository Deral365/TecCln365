package Clases;

public class Productos {
	
  private String Caducidad;
  private String Lote;
  private String Pais;
  private String Envasado;
  
  public Productos() {
	  
  }
  
  public Productos (String Caducidad,String Lote,String Envasado,String Pais) {
	  this.Caducidad=Caducidad;
	  this.Lote=Lote;
	  this.Envasado=Envasado;
	  this.Pais=Pais;
  }

public String getCaducidad() {
	return Caducidad;
}

public void setCaducidad(String caducidad) {
	Caducidad = caducidad;
}

public String getLote() {
	return Lote;
}

public void setLote(String lote) {
	Lote = lote;
}

public String getPais() {
	return Pais;
}

public void setPais(String pais) {
	Pais = pais;
}

public String getEnvasado() {
	return Envasado;
}

public void setEnvasado(String envasado) {
	Envasado = envasado;
}
  
  
}

