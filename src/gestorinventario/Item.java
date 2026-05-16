package gestorinventario;

/**
 * Clase base que representa un artículo genérico de la tienda.
 *
 * @author TuNombre
 * @version 1.0
 */
public abstract class Item {

    /** Nombre del artículo. */
    private String nombre;

    /** Precio del artículo en euros. */
    private double precio;

    /** Cantidad disponible en stock. */
    private int stock;

    /**
     * Constructor de Item.
     *
     * @param nombre Nombre del artículo.
     * @param precio Precio del artículo.
     * @param stock  Cantidad inicial en stock.
     */
    public Item(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Devuelve el nombre del artículo.
     *
     * @return El nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio del artículo.
     *
     * @return El precio en euros.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el artículo.
     *
     * @param precio El nuevo precio en euros.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el stock disponible.
     *
     * @return Cantidad en stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Reduce el stock en una unidad al vender.
     *
     * @throws StockAgotadoException Si no hay stock disponible.
     */
    public void vender() throws StockAgotadoException {
        if (stock <= 0) {
            throw new StockAgotadoException("Stock agotado para: " + nombre);
        }
        stock--;
    }

    /**
    * Comprueba si hay stock disponible.
    *
    * @return true si hay stock, false si está agotado.
    */
    public boolean tieneStock() {
        return getStock() > 0;
    }
    
    /**
     * Devuelve información del artículo como texto.
     *
     * @return Cadena con los datos del artículo.
     */
    @Override
    public abstract String toString();
}
