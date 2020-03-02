package singletoncajeros;

/**
 *
 * @author dav_o
 */
public interface Cajero {
    
    public void atender(Cliente cliente);
    public void liberar();
    public boolean isLibre();
    public void setLibre(boolean ocupado);   

}
