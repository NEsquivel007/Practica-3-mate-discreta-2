public class Main {

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Entrada.leerEntero("Seleccione una opción: ");
            System.out.println();
            switch (opcion) {
                case 1 -> mostrarFiguras();
                case 2 -> Semejantes.ejecutar();
                case 3 -> Hojas.ejecutar();
                case 4 -> Hermano.ejecutar();
                case 5 -> Padre.ejecutar();
                case 6 -> Isomorfos.ejecutar();
                case 7 -> Recorridos.ejecutar();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("\n========== ÁRBOLES BINARIOS (VECTOR) ==========");
        System.out.println("1. Mostrar los árboles (figuras 12.11 a 12.14)");
        System.out.println("2. Determinar si dos árboles son semejantes");
        System.out.println("3. Número de hojas de un árbol");
        System.out.println("4. Hermano de un nodo");
        System.out.println("5. Padre de un nodo");
        System.out.println("6. Determinar si dos árboles son isomorfos");
        System.out.println("7. Recorridos INORDEN, POSORDEN y PREORDEN");
        System.out.println("0. Salir");
        System.out.println("===============================================");
    }

    static void mostrarFiguras() {
        for (ArbolVector v : Arboles.FIGURAS) {
            v.mostrar();
            System.out.println();
        }
    }
}