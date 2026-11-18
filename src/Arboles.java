public class Arboles {

    // Posición: raíz = 0, hijo izq = 2i+1, hijo der = 2i+2. null = vacío.
    public static final ArbolVector[] FIGURAS = {
            // Figura 12.11:  i -> (z, m),  m -> derecha w
            new ArbolVector("Figura 12.11",
                    new String[]{"i", "z", "m", null, null, null, "w"}),

            // Figura 12.12:  i -> izquierda m,  m -> (z, w)
            new ArbolVector("Figura 12.12",
                    new String[]{"i", "m", null, "z", "w"}),

            // Figura 12.13:  j -> (k, m),  k -> (x, y),  m -> (z, w)
            new ArbolVector("Figura 12.13",
                    new String[]{"j", "k", "m", "x", "y", "z", "w"}),

            // Figura 12.14:  a -> (b, c),  b -> (d, e),  c -> (f, g)
            new ArbolVector("Figura 12.14",
                    new String[]{"a", "b", "c", "d", "e", "f", "g"})
    };
}