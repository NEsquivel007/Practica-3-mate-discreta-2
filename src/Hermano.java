public class Hermano {

    /** Devuelve el índice del hermano, o -1 si no tiene. */
    public static int indiceHermano(ArbolVector v, int i) {
        if (i <= 0) return -1;
        int h = (i % 2 == 1) ? i + 1 : i - 1; // impar = hijo izquierdo, par = hijo derecho
        return v.existe(h) ? h : -1;
    }

    public static void ejecutar() {
        ArbolVector v = Entrada.elegirFigura("Elija el árbol:");
        if (v == null) return;

        String valor = Entrada.leerLinea("Ingrese el nodo (letra): ");
        int i = v.buscarIndice(valor);

        if (i == -1) {
            System.out.println("El nodo " + valor + " no existe en " + v.getNombre() + ".");
        } else if (i == 0) {
            System.out.println("El nodo " + valor + " es la raíz y no tiene hermano.");
        } else {
            int h = indiceHermano(v, i);
            if (h == -1) {
                System.out.println("El nodo " + valor + " no tiene hermano.");
            } else {
                System.out.println("El hermano del nodo " + valor + " es: " + v.valorEn(h));
            }
        }
    }
}