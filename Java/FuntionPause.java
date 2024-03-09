import java.util.Scanner;

public class FuntionPause {

      // Pausar la pantalla
      public static void pausa() {
        Scanner read = new Scanner(System.in);
        read.nextLine(); // Limpiamos buffer del System.in
        System.out.println("\t\nPresione enter para continuar...");
        read.nextLine(); // Ahora el programa se detiene hasta que se pulse ENTER
        read.close();
    }
}
