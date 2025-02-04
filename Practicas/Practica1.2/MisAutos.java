public class MisAutos {
    public static void main(String[] args) {
        Auto Carro = new Auto();
        Carro = new Auto("KIA", "SOUL", 120000);
        String Nombre = Carro.getMarca() + "" + Carro.getModelo();
        int Costo = Carro.getPrecio();

        System.out.println("Mi auto es" + Nombre + "Y cuesta" + Costo);
    }
}
