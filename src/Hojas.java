public class Hojas {

    public static int contarHojas(ArbolVector v) {
        int hojas = 0;
        for (int i = 0; i < v.longitud(); i++) {
            if (v.esHoja(i)) hojas++;
        }
        return hojas;
    }

    public static void ejecutar() {
        ArbolVector v = Entrada.elegirFigura("Elija el árbol:");
        if (v == null) return;

        System.out.println(v.getNombre() + " tiene " + contarHojas(v) + " hoja(s).");
        System.out.print("Hojas: ");
        for (int i = 0; i < v.longitud(); i++) {
            if (v.esHoja(i)) System.out.print(v.valorEn(i) + " ");
        }
        System.out.println();
    }
}