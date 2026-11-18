import java.util.Arrays;

public class Semejantes {

    public static boolean sonSemejantes(ArbolVector a, ArbolVector b) {
        if (a.contarNodos() != b.contarNodos()) return false;
        return Arrays.equals(a.valoresOrdenados(), b.valoresOrdenados());
    }

    public static void ejecutar() {
        ArbolVector a = Entrada.elegirFigura("Elija el primer árbol:");
        if (a == null) return;
        ArbolVector b = Entrada.elegirFigura("Elija el segundo árbol:");
        if (b == null) return;

        if (sonSemejantes(a, b)) {
            System.out.println(a.getNombre() + " y " + b.getNombre() + " SON semejantes.");
        } else {
            System.out.println(a.getNombre() + " y " + b.getNombre() + " NO son semejantes.");
        }
    }
}