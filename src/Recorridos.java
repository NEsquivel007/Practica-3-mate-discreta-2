public class Recorridos {

    // PREORDEN: raíz, izquierdo, derecho
    public static void preorden(ArbolVector v, int i, StringBuilder sb) {
        if (!v.existe(i)) return;
        sb.append(v.valorEn(i)).append(" ");
        preorden(v, 2 * i + 1, sb);
        preorden(v, 2 * i + 2, sb);
    }

    // INORDEN: izquierdo, raíz, derecho
    public static void inorden(ArbolVector v, int i, StringBuilder sb) {
        if (!v.existe(i)) return;
        inorden(v, 2 * i + 1, sb);
        sb.append(v.valorEn(i)).append(" ");
        inorden(v, 2 * i + 2, sb);
    }

    // POSORDEN: izquierdo, derecho, raíz
    public static void posorden(ArbolVector v, int i, StringBuilder sb) {
        if (!v.existe(i)) return;
        posorden(v, 2 * i + 1, sb);
        posorden(v, 2 * i + 2, sb);
        sb.append(v.valorEn(i)).append(" ");
    }

    public static void ejecutar() {
        for (ArbolVector v : Arboles.FIGURAS) {
            StringBuilder pre = new StringBuilder();
            StringBuilder in = new StringBuilder();
            StringBuilder pos = new StringBuilder();

            preorden(v, 0, pre);
            inorden(v, 0, in);
            posorden(v, 0, pos);

            System.out.println("--- " + v.getNombre() + " ---");
            System.out.println("PREORDEN : " + pre);
            System.out.println("INORDEN  : " + in);
            System.out.println("POSORDEN : " + pos);
            System.out.println();
        }
    }
}