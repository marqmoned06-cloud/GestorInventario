package gestorinventario;

/**
 * Excepción lanzada cuando se intenta vender un artículo sin stock.
 *
 * @author TuNombre
 * @version 1.0
 */
public class StockAgotadoException extends Exception {

    /**
     * Constructor de la excepción.
     *
     * @param mensaje Mensaje descriptivo del error.
     */
    public StockAgotadoException(String mensaje) {
        super(mensaje);
    }
}
