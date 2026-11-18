import java.util.Scanner;

public class Entrada {

    public static final Scanner sc = new Scanner(System.in);

    public static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
            }
        }
    }

    public static String leerLinea(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    /** Muestra las figuras disponibles y devuelve la elegida (o null si es inválida). */
    public static ArbolVector elegirFigura(String msg) {
        System.out.println(msg);
        for (int i = 0; i < Arboles.FIGURAS.length; i++) {
            System.out.println((i + 1) + ". " + Arboles.FIGURAS[i].getNombre());
        }
        int op = leerEntero("Opción: ");
        if (op < 1 || op > Arboles.FIGURAS.length) {
            System.out.println("Opción inválida.");
            return null;
        }
        return Arboles.FIGURAS[op - 1];
    }
}