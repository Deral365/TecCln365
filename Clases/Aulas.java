package Clases;

public class Aulas  {
       private int Cupo;
       private int Numero;
       private int Ma;

	public Aulas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aulas(int numero,int ma,int cupo) {
		Numero=numero;
		Ma=ma;
		Cupo=cupo;
	}

	public int getCupo() {
		return Cupo;
	}

	public void setCupo(int cupo) {
		Cupo = cupo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public int getMa() {
		return Ma;
	}

	public void setMa(int ma) {
		Ma = ma;
	}
       
       
}
