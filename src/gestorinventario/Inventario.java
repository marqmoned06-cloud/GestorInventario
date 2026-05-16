package gestorinventario;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona el inventario completo de la tienda de videojuegos.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Inventario {

    /** Lista de artículos disponibles en la tienda. */
    private List<Item> articulos;

    /**
     * Constructor que inicializa el inventario vacío.
     */
    public Inventario() {
        this.articulos = new ArrayList<>();
    }

    /**
     * Añade un artículo al inventario.
     *
     * @param item El artículo a añadir.
     */
    public void agregarItem(Item item) {
        articulos.add(item);
    }

    /**
     * Vende un artículo reduciéndolo en una unidad del stock.
     *
     * @param nombre El nombre del artículo a vender.
     * @throws StockAgotadoException Si el artículo no tiene stock.
     */
    public void venderItem(String nombre) throws StockAgotadoException {
        for (Item item : articulos) {
            if (item.getNombre().equalsIgnoreCase(nombre)) {
                item.vender();
                System.out.println("Vendido: " + nombre);
                return;
            }
        }
        System.out.println("Artículo no encontrado: " + nombre);
    }

    /**
     * Muestra todos los artículos del inventario por pantalla.
     */
    public void mostrarInventario() {
        System.out.println("=== INVENTARIO ===");
        for (Item item : articulos) {
            System.out.println(item);
        }
    }
    
    /**
    * Devuelve el número total de artículos en el inventario.
    *
    * @return Número de artículos.
    */
    public int totalArticulos() {
        return articulos.size();
    }

}
