
import java.util.Scanner;

class LecturaDeTeclado {
    public static void main (String [] args) {
        Scanner lector = new Scanner(System.in);

        int numero;
        System.out.print("Ingresa un número: ");
        numero = lector.nextInt();
        System.out.println("El número es: " + numero);
    }
}
