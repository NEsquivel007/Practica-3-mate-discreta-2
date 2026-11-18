public class Padre {

    public static void ejecutar() {
        ArbolVector v = Entrada.elegirFigura("Elija el árbol:");
        if (v == null) return;

        String valor = Entrada.leerLinea("Ingrese el nodo (letra): ");
        int i = v.buscarIndice(valor);

        if (i == -1) {
            System.out.println("El nodo " + valor + " no existe en " + v.getNombre() + ".");
        } else if (i == 0) {
            System.out.println("El nodo " + valor + " es la raíz y no tiene padre.");
        } else {
            System.out.println("El padre del nodo " + valor + " es: " + v.valorEn((i - 1) / 2));
        }
    }
}