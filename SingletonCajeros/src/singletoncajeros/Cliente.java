package singletoncajeros;

/**
 *
 * @author DAv_O
 */
public class Cliente {
    
    private final String nombre;
    private String pedido;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }   
    
}
