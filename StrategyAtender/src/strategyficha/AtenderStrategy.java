package strategyficha;

import java.util.Vector;

/**
 *
 * @author dav_o
 */
public interface AtenderStrategy {
    
    public void tomarPedido();
    
    public void asignarLugar(int nLugar);  
    
    public Vector<String> getPedido();
    
}
