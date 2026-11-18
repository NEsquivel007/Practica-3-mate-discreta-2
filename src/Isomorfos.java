public class Isomorfos {

    public static boolean sonIsomorfos(ArbolVector a, ArbolVector b) {
        return comparar(a, b, 0);
    }

    private static boolean comparar(ArbolVector a, ArbolVector b, int i) {
        boolean ea = a.existe(i);
        boolean eb = b.existe(i);
        if (!ea && !eb) return true;
        if (ea != eb) return false;
        return comparar(a, b, 2 * i + 1) && comparar(a, b, 2 * i + 2);
    }

    public static void ejecutar() {
        ArbolVector a = Entrada.elegirFigura("Elija el primer árbol:");
        if (a == null) return;
        ArbolVector b = Entrada.elegirFigura("Elija el segundo árbol:");
        if (b == null) return;

        if (sonIsomorfos(a, b)) {
            System.out.println(a.getNombre() + " y " + b.getNombre() + " SON isomorfos.");
        } else {
            System.out.println(a.getNombre() + " y " + b.getNombre() + " NO son isomorfos.");
        }
    }
}