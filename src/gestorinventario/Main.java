package gestorinventario;

/**
 * Clase principal que ejecuta la aplicación.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
    Inventario inventario = new Inventario();

    inventario.agregarItem(new Videojuego("Elden Ring", 59.99, 5, "PS5", "RPG"));
    inventario.agregarItem(new Videojuego("FIFA 25", 69.99, 3, "PC", "Deportes"));
    inventario.agregarItem(new Consola("PlayStation 5", 549.99, 2, "Sony"));
    inventario.agregarItem(new Consola("Xbox Series X", 499.99, 1, "Microsoft"));

    inventario.mostrarInventario();
    System.out.println("Total artículos: " + inventario.totalArticulos());

    try {
        inventario.venderItem("Elden Ring");
        inventario.venderItem("Elden Ring");
    } catch (StockAgotadoException e) {
        System.out.println("Error: " + e.getMessage());
    }

    System.out.println("\nInventario actualizado:");
    inventario.mostrarInventario();
}
}