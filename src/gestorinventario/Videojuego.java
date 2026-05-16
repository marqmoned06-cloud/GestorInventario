package gestorinventario;

/**
 * Representa un videojuego en el inventario de la tienda.
 * <p>Extiende la clase {@link Item}.</p>
 *
 * @author TuNombre
 * @version 1.0
 */
public class Videojuego extends Item {

    /** Plataforma del videojuego (ej: PS5, PC). */
    private String plataforma;

    /** Género del videojuego (ej: Acción, RPG). */
    private String genero;

    /**
     * Constructor de Videojuego.
     *
     * @param nombre     Nombre del videojuego.
     * @param precio     Precio en euros.
     * @param stock      Cantidad en stock.
     * @param plataforma Plataforma compatible.
     * @param genero     Género del juego.
     */
    public Videojuego(String nombre, double precio, int stock,
                      String plataforma, String genero) {
        super(nombre, precio, stock);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    /**
     * Devuelve la plataforma del videojuego.
     *
     * @return La plataforma.
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Devuelve el género del videojuego.
     *
     * @return El género.
     */
    public String getGenero() {
        return genero;
    }


    public double calcularPrecioFinal() {
        return (getPrecio() + 5.0) * 0.90;
    }

    /**
    * Devuelve si el videojuego es de una plataforma concreta.
    *
    * @param p La plataforma a comparar.
    * @return true si coincide, false si no.
    */
    public boolean esDePlataforma(String p) {
        return this.plataforma.equalsIgnoreCase(p);
    }
    
    /**
     * Devuelve información completa del videojuego.
     *
     * @return Cadena con todos los datos.
     */
    @Override
    public String toString() {
        return "[Videojuego] " + getNombre() + " | " + plataforma +
               " | " + genero + " | " + getPrecio() + "€ | Stock: " + getStock();
    }
}