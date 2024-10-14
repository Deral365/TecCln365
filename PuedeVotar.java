import java.util.Scanner;

public class PuedeVotar {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        String mensaje;
        mensaje = (edad >= 18) ? "Puedes Votar" : "No puedes votar";
        System.out.println(mensaje);
        sc.close();

    }

}