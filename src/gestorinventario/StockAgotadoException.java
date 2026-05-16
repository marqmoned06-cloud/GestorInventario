package gestorinventario;

/**
 * Excepción lanzada cuando se intenta vender un artículo sin stock.
 *
 * @author TuNombre
 * @version 1.0
 */
public class StockAgotadoException extends Exception {

    /** Código de error asociado a la excepción. */
    private int codigoError;

    /**
     * Constructor de la excepción.
     *
     * @param mensaje    Mensaje descriptivo del error.
     * @param codigoError Código numérico del error.
     */
    public StockAgotadoException(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    /**
     * Constructor simplificado sin código de error.
     *
     * @param mensaje Mensaje descriptivo del error.
     */
    public StockAgotadoException(String mensaje) {
        super(mensaje);
        this.codigoError = 0;
    }

    /**
     * Devuelve el código de error.
     *
     * @return El código de error.
     */
    public int getCodigoError() {
        return codigoError;
    }
}