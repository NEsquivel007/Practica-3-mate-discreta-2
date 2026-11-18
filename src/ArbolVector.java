import java.util.Arrays;

public class ArbolVector {

    private final String nombre;
    private final String[] datos;

    public ArbolVector(String nombre, String[] datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    public String getNombre() {
        return nombre;
    }

    public int longitud() {
        return datos.length;
    }

    public String valorEn(int i) {
        return datos[i];
    }

    public boolean existe(int i) {
        return i >= 0 && i < datos.length && datos[i] != null;
    }

    public boolean esHoja(int i) {
        return existe(i) && !existe(2 * i + 1) && !existe(2 * i + 2);
    }

    public int contarNodos() {
        int c = 0;
        for (String x : datos) if (x != null) c++;
        return c;
    }

    public int buscarIndice(String valor) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] != null && datos[i].equalsIgnoreCase(valor)) return i;
        }
        return -1;
    }

    public String[] valoresOrdenados() {
        String[] r = new String[contarNodos()];
        int k = 0;
        for (String x : datos) if (x != null) r[k++] = x;
        Arrays.sort(r);
        return r;
    }

    public void mostrar() {
        System.out.println("--- " + nombre + " ---");
        System.out.println("Vector: " + Arrays.toString(datos));
        System.out.println("Nodos: " + contarNodos());
        System.out.println("Vista (raíz a la izquierda, hijo derecho arriba):");
        imprimirLateral(0, 0);
    }

    private void imprimirLateral(int i, int nivel) {
        if (!existe(i)) return;
        imprimirLateral(2 * i + 2, nivel + 1);
        System.out.println("    ".repeat(nivel) + datos[i]);
        imprimirLateral(2 * i + 1, nivel + 1);
    }
}