package adapter;

/**
 *
 * @author dav_o
 */
public abstract class PagoCuenta {
    
    abstract public double totalizar(Cuenta cuenta);
    abstract public void cobrar(double totalizado, int cotas);
    abstract public double getEstado();
    
}
