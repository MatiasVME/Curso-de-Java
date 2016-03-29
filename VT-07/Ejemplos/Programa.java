import java.util.Scanner;

class Programa {
  public static void main (String [] args) {
    Scanner lector = new Scanner (System.in);

    System.out.println("¿Cuál es tu nombre?");
    String nombre = lector.nextLine();

    System.out.println("Entonces tu nombre es: " + nombre);
    System.out.println("Tu nombre tiene " + nombre.length() + " letras");
    System.out.println("La primera letra de tu nombre es: "
      + nombre.charAt(0));

    int numeroCaracteres = nombre.length();
    System.out.println("La última letra de tu nombre es: "
      + nombre.charAt(numeroCaracteres - 1));
  }
}
