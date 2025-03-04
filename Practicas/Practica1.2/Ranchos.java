package Clases;

public class Ranchos {

	public static void main(String[] args) {
		int N=(int)(Math.random()*401)+100;
		
	 Vaca [] MisVacas= new Vaca[N];
     Ordeña(MisVacas);
	}
   public static void Ordeña(Vaca [] V) {
	   
	   int Tipo;
	   int Litros ;
	   int Variante ;
	   String Nom="Badiraguato";
	   for(int i=0;i<V.length;i++) {
		 Tipo= (int)(Math.random()*2)+1;
		 if(Tipo==1) {
			 Variante=(int)(Math.random()*2)+1;
			 if(Variante==1) {
				
				Litros = (int)(Math.random()*5)+3;
				
			 }else {
				 Litros=(int)(Math.random()*30)+20;
			 }
		 }else {
			 Variante=1;
			 Litros=(int)(Math.random()*2)+1;
		 }
		V[i] = new  Vaca(Nom,Tipo,Variante,Litros);
		 System.out.println(V[i].getNombre()+V[i].getTipo()+V[i].getVariante()+V[i].getLitros());
	   }
   }

   public static void Produccion(Vaca [] V) { 
	   
}
   
}

