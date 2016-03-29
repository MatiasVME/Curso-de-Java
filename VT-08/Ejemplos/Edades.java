import java.util.Scanner;

class Edades {

  public static void main (String [] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("Ingresa tu edad: ");
    int edad = lector.nextInt();

    if (edad <= 10) {
      System.out.println("Eres un niño");
    }

    else if (edad <= 17) {
      System.out.println("Eres un adolecente");
    }

    else if (edad >= 18) {
      System.out.println("Eres un adulto");
    }
  }
}
