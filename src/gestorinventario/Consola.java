package gestorinventario;

/**
 * Representa una consola de videojuegos en el inventario.
 * <p>Extiende la clase {@link Item}.</p>
 *
 * @author TuNombre
 * @version 1.0
 */
public class Consola extends Item {

    /** Marca fabricante de la consola. */
    private String marca;

    /**
     * Constructor de Consola.
     *
     * @param nombre Nombre de la consola.
     * @param precio Precio en euros.
     * @param stock  Cantidad en stock.
     * @param marca  Marca de la consola.
     */
    public Consola(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    /**
     * Devuelve la marca de la consola.
     *
     * @return La marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Calcula el precio final de la consola.
     *
     * @return El precio sin descuento.
     */
    public double calcularPrecioFinal() {
        return getPrecio();
    }

    /**
    * Devuelve si la consola es de una marca concreta.
    *
    * @param m La marca a comparar.
    * @return true si coincide, false si no.
    */
    public boolean esDeMarca(String m) {
        return this.marca.equalsIgnoreCase(m);
    }
    
    /**
     * Devuelve información completa de la consola.
     *
     * @return Cadena con todos los datos.
     */
    @Override
    public String toString() {
        return "[Consola] " + getNombre() + " | " + marca +
               " | " + getPrecio() + "€ | Stock: " + getStock();
    }
}
